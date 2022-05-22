package model.Users;

import common.BankRate;
import viewModel.Accounts.Account;
import viewModel.Accounts.AccountType;
import viewModel.Users.User;
import viewModel.Users.UserType;

import java.util.List;

public class Director extends User {
    private String name;

    public Director(UserType type) {
        super(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void lookUpCustomer(Customer customer) {
        double money = customer.getAccount().getAmount()+customer.getAccount().getReqLoanAmount();
        System.out.println(customer.getName() + "’s current balance " + money + "$");
    }

    @Override
    public boolean approveLoan(Account account, double amount, double fund) {
        if(fund<amount){
            return false;
        }
        account.setReqLoanAmount(amount);
        System.out.println("Loan for " + account.getUsername() + " approved");
        return true;
    }

    public void close(){
        System.out.println("Operations for " + getName() + " closed");
    }

    public void changeInterestRate(List<Customer> customers, AccountType type, double rate){
        if(type.equals(AccountType.SAVINGS)){
            BankRate.InterestSavings = rate;
        }
        else if(type.equals(AccountType.STUDENT)){
            BankRate.InterestStudents = rate;
        }
        else if(type.equals(AccountType.LOAN)){
            BankRate.InterestLoan = rate;
        }
        else if(type.equals(AccountType.FIXED_DEPOSIT)){
            BankRate.InterestFixedDeposits = rate;
        }
        else{
            System.out.println("Invalid account type!!");
            return;
        }
        for(Customer c:customers){
            Account ac = c.getAccount();
            if(ac.getType().equals(type)){
                ac.setRate(rate);
            }
        }
        System.out.println("Interest rate changed for " + type.name() + " type accounts to " + rate + "%");
    }
}
