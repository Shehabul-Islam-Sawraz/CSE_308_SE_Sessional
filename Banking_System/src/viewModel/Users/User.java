package viewModel.Users;

import model.Users.Customer;
import viewModel.Accounts.Account;

public abstract class User {
    private final UserType type;

    public User(UserType type) {
        this.type = type;
    }

    public UserType getType() {
        return type;
    }

    public abstract void lookUpCustomer(Customer customer);
    public abstract boolean approveLoan(Account account, double amount, double fund);
}
