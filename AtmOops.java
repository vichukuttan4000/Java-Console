import java.util.*;
public class AtmOops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMService atm = new ATMService();
        while (true) {
            try{
                System.out.println("\n1 User Login");
                System.out.println("2 Admin");
                System.out.println("3 Exit");
                int mainChoice = sc.nextInt();
                if (mainChoice == 3)
                    break;
                if (mainChoice == 1) {
                    System.out.println("Enter Account Number");
                    int accNo = sc.nextInt();
                    System.out.println("Enter PIN");
                    int pin = sc.nextInt();
                    Account acc = atm.login(accNo, pin);
                    if (acc == null)
                        continue;
                    while (true) {
                        System.out.println("\n1 Balance");
                        System.out.println("2 Withdraw");
                        System.out.println("3 Deposit");
                        System.out.println("4 Change PIN");
                        System.out.println("5 Mini Statement");
                        System.out.println("6 Exit");
                        int choice = sc.nextInt();
                        if (choice == 6)
                            break;
                        switch (choice) {
                            case 1:
                                acc.balanceCheck();
                                break;
                            case 2:
                                System.out.println("Enter amount");
                                int w = sc.nextInt();
                                if(w%100==0){
                                    if(atm.userWithdraw(w)){
                                        acc.withdraw(w);
                                        atm.recordTransaction();    
                                    }
                                }
                                else{
                                    System.out.println("Invalid Denominations");
                                }
                                
                                break;
                            case 3:
                                System.out.println("Enter amount");
                                int d = sc.nextInt();
                                if(d%100==0){
                                    if(atm.userDeposit(d)){
                                        acc.deposit(d);
                                        atm.recordTransaction();    
                                    }
                                }
                                else{
                                    System.out.println("Invalid Denominations");
                                }
                                break;
                            case 4:
                                System.out.println("Enter new PIN");
                                int newPin = sc.nextInt();
                                acc.pinChange(newPin);
                                break;
                            case 5:
                                acc.miniStatement();
                                break;
                        }
                    }
                } else if (mainChoice == 2) {
                    System.out.println("Enter Admin Password");
                    int pass = sc.nextInt();
                    if (pass != 9999) {
                        System.out.println("Wrong password");
                        continue;
                    }
                    while (true) {
                        System.out.println("\n1 Deposit to ATM");
                        System.out.println("2 Per Day Transactions");
                        System.out.println("3 Total Transactions");
                        System.out.println("4 Exit");
                        int adminChoice = sc.nextInt();
                        if (adminChoice == 4)
                            break;
                        switch (adminChoice) {
                            case 1:
                                System.out.println("Enter amount");
                                int amt = sc.nextInt();
                                if(amt%100!=0){
                                    System.out.println("Invalid Denominations");
                                }
                                else{
                                    atm.adminDeposit(amt);
                                }
                                break;
                            case 2:
                                atm.showDailyTransactions();
                                break;
                            case 3:
                                atm.showTotalTransactions();
                                break;
                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("Error occured : Invalid input");
                break;
            }
        }
        System.out.println("Thank you for using ATM");
    }
}