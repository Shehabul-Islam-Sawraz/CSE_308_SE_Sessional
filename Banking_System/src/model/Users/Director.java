package model.Users;

import viewModel.Users.User;
import viewModel.Users.UserType;

public class Director extends User {
    private String name;

    public Director(UserType type) {
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
    public void approveLoan() {

    }

    public void close(){
        System.out.println("Operations for " + getName() + " closed");
    }
}
