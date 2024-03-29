package viewModel.Accounts;

public abstract class Account {
    private final String username;
    private final AccountType type;
    private double amount;
    private double rate;
    private double reqLoanAmount = 0;
    private int accountYear = 0;

    public Account(String username, AccountType type, double amount, double rate) {
        this.username = username;
        this.type = type;
        this.amount = amount;
        this.rate = rate;
    }

    public String getUsername() {
        return username;
    }

    public AccountType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getReqLoanAmount() {
        return reqLoanAmount;
    }

    public void setReqLoanAmount(double reqLoanAmount) {
        this.reqLoanAmount = reqLoanAmount;
    }

    public int getAccountYear() {
        return accountYear;
    }

    public void setAccountYear(int accountYear) {
        this.accountYear = accountYear;
    }

    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract boolean requestLoan(double amount);
    public abstract void queryDeposit();

    public abstract void incrementYear();
}
