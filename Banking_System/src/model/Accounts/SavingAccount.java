package model.Accounts;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class SavingAccount extends Account {

    public SavingAccount(String username, double amount) {
        super(username, AccountType.SAVINGS, amount, BankRate.AccSavings);
    }

    @Override
    public boolean deposit(double amount) {
        if(getReqLoanAmount()==0){
            setAmount(getAmount()+amount);
        }
        else{
            double loan = getReqLoanAmount();
            if(loan>=amount){
                setReqLoanAmount(loan-amount);
            }
            else{
                setReqLoanAmount(0);
                setAmount(getAmount()+amount-loan);
            }
        }
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(getAmount()-amount<1000){
            return false;
        }
        else{
            setAmount(getAmount()-amount);
        }
        return true;
    }

    @Override
    public void requestLoan(double amount) {

    }

    @Override
    public void queryDeposit() {

    }
}
