package model.Accounts;

import common.InterestRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class StudentAccount extends Account {

    public StudentAccount(String username, double amount) {
        super(username, AccountType.STUDENT, amount, InterestRate.AccStudents);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void requestLoan(double amount) {

    }

    @Override
    public void queryDeposit() {

    }
}
