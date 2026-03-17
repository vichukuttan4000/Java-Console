import java.time.LocalDate;
import java.util.*;
public class ATMService {
    HashMap<Integer, Account> accounts = new HashMap<>();
    int totalTransactions = 0;
    int todayTransactions = 0;
    int atmCap=2600000;
    int availableCash=200000;
    LocalDate today = LocalDate.now();
    public ATMService() {
        accounts.put(1, new Account(1, 1234, 1000));
        accounts.put(2, new Account(2, 1234, 5000));
        accounts.put(3, new Account(3, 1234, 8000));
    }
    public Account login(int accNo, int pin) {
        Account acc = accounts.get(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return null;
        }
        if (!acc.pinCheck(pin))
            return null;
        return acc;
    }
    public void recordTransaction() {
        LocalDate current = LocalDate.now();
        if (!current.equals(today)) {
            todayTransactions = 0;
            today = current;
        }
        totalTransactions++;
        todayTransactions++;
    }
    public void adminDeposit(int amount) {
        if(availableCash+amount>atmCap){
            System.out.println("CDM Capacity full");
        }
        else{
            availableCash+=amount;
            System.out.println("ATM Refilled!!");
        }
    }
    public boolean userDeposit(int amount){
        if(availableCash+amount>atmCap){
            System.out.println("CDM Capacity full");
            return false;
        }
        else{
            availableCash+=amount;
            return true;
        }
    }
    public boolean userWithdraw(int amount){
        if(availableCash-amount<0){
            System.out.println("Cash Insufficient in CDM");
            return false;
        }
        else{
            availableCash-=amount;
            return true;
        }
    }
    public void showDailyTransactions() {
        System.out.println("Today's Transactions : " + todayTransactions);
    }
    public void showTotalTransactions() {
        System.out.println("Total Transactions : " + totalTransactions);
    }
}