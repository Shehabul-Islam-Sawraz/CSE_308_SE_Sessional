import viewModel.Accounts.AccountType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader("in.txt"));
            Bank bank = new Bank();
            while ((line = br.readLine()) != null) {
                String[] command = line.split(" ");
                switch (command[0]){
                    case "Create":
                        bank.createAccount(command[1], AccountType.valueOf(command[2].toUpperCase()), Double.parseDouble(command[3]));
                        break;
                    case "Deposit":
                        bank.deposit(Double.parseDouble(command[1]));
                        break;
                    case "Withdraw":
                        bank.withdraw(Double.parseDouble(command[1]));
                        break;
                    case "Query":
                        bank.query();
                        break;
                    case "Request":
                        bank.requestLoan(Double.parseDouble(command[1]));
                        break;
                    case "Close":
                        bank.close();
                        break;
                    case "Open":
                        bank.loginAsEmployee(command[1].charAt(0)+"", command[1].charAt(1));
                        break;
                    case "Approve":
                        bank.approveLoan();
                        break;
                    case "Change":
                        bank.changeInterestRate(AccountType.valueOf(command[1].toUpperCase()),Double.parseDouble(command[2]));
                        break;
                    case "Lookup":
                        bank.lookUp(command[1]);
                        break;
//                    case "See":
//                        break;
//                    case "INC":
//                        break;
//                    defaulf:
//                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!!");
        }
        catch (Exception e) {
            System.out.println("Some error occurred!!");
            //e.printStackTrace();
        }
    }
}
