package model.Accounts;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;

public class StudentAccount extends Account {

    public StudentAccount(String username, double amount) {
        super(username, AccountType.STUDENT, amount, BankRate.AccStudents);
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
        if(amount>BankRate.StudentWithdraw || getAmount()<amount){
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
