package model.Users;

import model.Accounts.FDAccount;
import model.Accounts.LoanAccount;
import model.Accounts.SavingAccount;
import model.Accounts.StudentAccount;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;
import viewModel.Users.User;
import viewModel.Users.UserType;

public class Customer extends User {
    private String name;
    private Account account;

    public Customer(UserType type) {
        super(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void lookUpCustomer(Customer customer) {
        System.out.println("You don't have the permission for this action!!");
    }

    @Override
    public void approveLoan() {
        System.out.println("You don't have the permission for this action!!");
    }

    public boolean createAccount(String name, AccountType type, double amount){
        this.name = name;
        if(amount<0){
            System.out.println("You can't create a student account with negative amount!!");
            return false;
        }
        switch (type){
            case SAVINGS:
                account = new SavingAccount(name, amount);
                System.out.println("Savings account for " + name + " Created; Initial balance " + amount + "$");
                break;
            case STUDENT:
                account = new StudentAccount(name, amount);
                System.out.println("Student account for " + name + " Created; Initial balance " + amount + "$");
                break;
            case LOAN:
                account = new LoanAccount(name, amount);
                System.out.println("Loan account for " + name + " Created; Initial balance " + amount + "$");
                break;
            case FIXED_DEPOSIT:
                if (amount<100000){
                    System.out.println("Could not create Fixed Deposit account for " + name + ". Initial amount must be greater than 100,000$.");
                    return false;
                }
                account = new FDAccount(name, amount);
                System.out.println("Fixed deposit account for " + name + " Created; Initial balance " + amount + "$");
                break;
            default:
                System.out.println("Invalid account type!!");
                return false;
        }
        return true;
    }
}
