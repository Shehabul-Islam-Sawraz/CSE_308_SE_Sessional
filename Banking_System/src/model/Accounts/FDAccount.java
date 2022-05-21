package model.Accounts;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class FDAccount extends Account {

    public FDAccount(String username, double amount) {
        super(username, AccountType.FIXED_DEPOSIT, amount, BankRate.AccFixedDeposits);
    }

    @Override
    public boolean deposit(double amount) {
        if(amount<50000){
            System.out.println("You can't deposit an amount of less than 50,000$!!");
            return false;
        }
        else if(getReqLoanAmount()==0){
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
        if(getAmount()<amount || getAccountYear()<1){
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
