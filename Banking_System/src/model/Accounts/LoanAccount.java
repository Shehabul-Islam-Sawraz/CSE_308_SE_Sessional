package model.Accounts;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class LoanAccount extends Account {

    public LoanAccount(String username, double amount) {
        super(username, AccountType.LOAN, amount, BankRate.InterestLoan);
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
    public boolean requestLoan(double amount) {
        if(amount > ((getReqLoanAmount() * (1+BankRate.InterestRequestLoan)) / 100)) {
            System.out.println("Loan account holder can't get more than 5% of the current loan!! ");
            return false;
        }
        return true;
    }

    @Override
    public void queryDeposit() {

    }
}
