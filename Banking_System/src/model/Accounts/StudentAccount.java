package model.Accounts;

import common.InterestRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class StudentAccount extends Account {

    public StudentAccount(String username, double amount) {
        super(username, AccountType.STUDENT, amount, InterestRate.AccStudents);
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
