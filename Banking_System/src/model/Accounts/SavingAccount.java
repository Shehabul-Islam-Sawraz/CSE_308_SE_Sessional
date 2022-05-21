package model.Accounts;

import common.InterestRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class SavingAccount extends Account {

    public SavingAccount(String username, double amount) {
        super(username, AccountType.SAVINGS, amount, InterestRate.AccSavings);
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
    public void withdraw(double amount) {

    }

    @Override
    public void requestLoan(double amount) {

    }

    @Override
    public void queryDeposit() {

    }
}
