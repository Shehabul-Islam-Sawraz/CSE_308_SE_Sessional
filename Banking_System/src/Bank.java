import model.Accounts.StudentAccount;
import model.Users.Cashier;
import model.Users.Customer;
import model.Users.Director;
import model.Users.Officer;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;
import viewModel.Users.User;
import viewModel.Users.UserType;

import java.util.*;

public class Bank {
    private List<Customer> customers;
    private User loginType;
    private Director director;
    private List<Officer> officers;
    private List<Cashier> cashiers;
    private double fund;
    private List<Map.Entry<Account,Double>> pendingLoans;

    public Bank() {
        director = new Director(UserType.MANAGING_DIRECTOR);
        director.setName("MD");
        officers = new ArrayList<>();
        cashiers = new ArrayList<>();
        customers = new ArrayList<>();
        loginType = null;
        fund=1000000;
        pendingLoans = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            Officer officer = new Officer(UserType.OFFICER);
            officer.setName("O"+i);
            officers.add(officer);
        }
        for (int i = 1; i <= 5; i++) {
            Cashier cashier = new Cashier(UserType.CASHIER);
            cashier.setName("C"+i);
            cashiers.add(cashier);
        }

        System.out.print("Bank created; ");
        System.out.print(director.getName());
        for(Officer officer:officers){
            System.out.print(","+officer.getName());
        }
        for(Cashier cashier:cashiers){
            System.out.print(","+cashier.getName());
        }
        System.out.println(" created");
    }

    private boolean searchForName(String name){
        for(Customer customer:customers){
            if(customer.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void createAccount(String name, AccountType type, double amount){
        if(searchForName(name)){
            System.out.println("User already exist with this name. Can't create the account!!");
        }
        else{
            Customer customer = new Customer(UserType.CUSTOMER);
            if(customer.createAccount(name,type,amount)) {
                customers.add(customer);
                loginType = customer;
                if(type.equals(AccountType.LOAN)){
                    fund-=amount;
                }
                else{
                    fund+=amount;
                }
            }
        }
    }

    public void deposit(double amount){
        if(loginType==null){
            System.out.println("Please login for further actions!!");
        }
        else if(!(loginType instanceof Customer)){
            System.out.println("You don't have the permission for this action!!");
        }
        else{
            if(((Customer) loginType).deposit(amount)){
                fund+=amount;
            }
        }
    }

    public void withdraw(double amount){
        if(loginType==null){
            System.out.println("Please login for further actions!!");
        }
        else if(!(loginType instanceof Customer)){
            System.out.println("You don't have the permission for this action!!");
        }
        else{
            if(((Customer) loginType).withdraw(amount)){
                fund-=amount;
            }
        }
    }

    public void query(){
        if(loginType==null){
            System.out.println("Please login for further actions!!");
        }
        else if(!(loginType instanceof Customer)){
            System.out.println("You don't have the permission for this action!!");
        }
        else{
            ((Customer) loginType).query();
        }
    }

    public void requestLoan(double amount){
        if(loginType==null){
            System.out.println("Please login for further actions!!");
        }
        else if(!(loginType instanceof Customer)){
            System.out.println("You don't have the permission for this action!!");
        }
        else{
            Account ac = ((Customer) loginType).requestLoan(amount);
            if(ac!=null){
                pendingLoans.add(new AbstractMap.SimpleEntry<>(ac,amount));
                System.out.println("Loan request successful, sent for approval");
            }
        }
    }

    public void close(){
        if(loginType==null){
            System.out.println("Please login for further actions!!");
            return;
        }
        else if(loginType instanceof Customer){
            ((Customer) loginType).close();
        }
        else if(loginType instanceof Director){
            ((Director) loginType).close();
        }
        else if(loginType instanceof Officer){
            ((Officer) loginType).close();
        }
        else if(loginType instanceof Cashier){
            ((Cashier) loginType).close();
        }
        loginType=null;
    }

    public void loginAsEmployee(String name, char c){
        if(name.equals("M")){
            Director director = new Director(UserType.MANAGING_DIRECTOR);
            loginType = director;
            System.out.print("MD active.");
            if(pendingLoans.size()>0){
                System.out.println(" There are loan approvals pending");
            }
            else{
                System.out.println(" There are no loan approval pending");
            }
        }
        else if(name.equals("O")){
            Officer officer = new Officer(UserType.OFFICER);
            loginType = officer;
            System.out.print("O" + c + " active.");
            if(pendingLoans.size()>0){
                System.out.println(" There are loan approvals pending");
            }
            else{
                System.out.println(" There are no loan approval pending");
            }
        }
        else if(name.equals("C")){
            Cashier cashier = new Cashier(UserType.CASHIER);
            loginType = cashier;
            System.out.println("O" + c + " active.");
        }
        else{
            System.out.println("Please login as a valid employee!!");
            loginType = null;
        }
    }
}
