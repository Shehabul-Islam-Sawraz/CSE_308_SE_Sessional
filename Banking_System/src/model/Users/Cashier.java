package model.Users;

import viewModel.Accounts.Account;
import viewModel.Users.User;
import viewModel.Users.UserType;

public class Cashier extends User {
    private String name;

    public Cashier(UserType type) {
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

    }

    @Override
    public boolean approveLoan(Account account, double amount, double fund) {
        return false;
    }

    public void close(){
        System.out.println("Operations for " + getName() + " closed");
    }
}
