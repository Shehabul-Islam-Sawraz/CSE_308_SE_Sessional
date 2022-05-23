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
                switch (command[0].toLowerCase()){
                    case "create":
                        bank.createAccount(command[1].toLowerCase(), AccountType.valueOf(command[2].toUpperCase()), Double.parseDouble(command[3]));
                        break;
                    case "deposit":
                        bank.deposit(Double.parseDouble(command[1]));
                        break;
                    case "withdraw":
                        bank.withdraw(Double.parseDouble(command[1]));
                        break;
                    case "query":
                        bank.query();
                        break;
                    case "request":
                        bank.requestLoan(Double.parseDouble(command[1]));
                        break;
                    case "close":
                        bank.close();
                        break;
                    case "open":
                        char c = command[1].toLowerCase().charAt(0);
                        if(command[1].toLowerCase().equals("md") || (command.length==2 && (c=='o' || c=='c'))){
                            bank.loginAsEmployee(c+"", command[1].charAt(1));
                        }
                        else{
                            if(!bank.loginAsCustomer(command[1].toLowerCase())){
                                System.out.println("Invalid credentials!!");
                            }
                        }
                        break;
                    case "approve":
                        bank.approveLoan();
                        break;
                    case "change":
                        bank.changeInterestRate(AccountType.valueOf(command[1].toUpperCase()),Double.parseDouble(command[2]));
                        break;
                    case "lookup":
                        bank.lookUp(command[1].toLowerCase());
                        break;
                    case "see":
                        bank.seeFund();
                        break;
                    case "inc":
                        bank.incrementYear();
                        break;
                    default:
                        break;
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
