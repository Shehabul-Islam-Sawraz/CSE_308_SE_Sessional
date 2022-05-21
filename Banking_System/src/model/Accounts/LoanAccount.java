package model.Accounts;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class LoanAccount extends Account {

    public LoanAccount(String username, double amount) {
        super(username, AccountType.LOAN, amount, BankRate.AccLoan);
    }

    @Override
    public boolean deposit(double amount) {
        double loan = getAmount();
        if(loan>=amount){
            setAmount(loan-amount);
        }
        else{
            setAmount(0);
        }
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public void requestLoan(double amount) {

    }

    @Override
    public void queryDeposit() {

    }
}
