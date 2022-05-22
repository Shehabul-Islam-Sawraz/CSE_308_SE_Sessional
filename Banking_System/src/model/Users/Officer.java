package model.Users;

import viewModel.Accounts.Account;
import viewModel.Users.User;
import viewModel.Users.UserType;

public class Officer extends User {
    private String name;

    public Officer(UserType type) {
        super(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void lookUpCustomer(Customer customer) {
        double money = customer.getAccount().getAmount()+customer.getAccount().getReqLoanAmount();
        System.out.println(customer.getName() + "’s current balance " + money + "$");
    }

    @Override
    public boolean approveLoan(Account account, double amount, double fund) {
        if(fund<amount){
            return false;
        }
        account.setReqLoanAmount(amount);
        System.out.println("Loan for " + account.getUsername() + " approved");
        return true;
    }

    public void close(){
        System.out.println("Operations for " + getName() + " closed");
    }
}
