package model.Accounts;

import common.InterestRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class FDAccount extends Account {

    public FDAccount(String username, double amount) {
        super(username, AccountType.FIXED_DEPOSIT, amount, InterestRate.AccFixedDeposits);
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
