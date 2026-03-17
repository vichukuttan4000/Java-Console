import java.util.*;
public class Account {
    int accNo;
    int pin;
    int balance;
    ArrayList<Transaction> transactions = new ArrayList<>();
    public Account(int accNo, int pin, int balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
    }
    public boolean pinCheck(int inputPin) {
        if (pin == inputPin)
            return true;
        else {
            System.out.println("Invalid PIN");
            return false;
        }
    }
    public void balanceCheck() {
        System.out.println("Balance : " + balance);
    }
    public void deposit(int amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Amount Deposited");
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount));
        System.out.println("Please collect cash");
    }
    public void pinChange(int newPin) {
        pin = newPin;
        System.out.println("PIN updated");
    }
    public void miniStatement() {
        int size = transactions.size();
        
        if (size == 0) {
            System.out.println("No transactions yet");
            return;
        }
        int start = Math.max(0, size - 6);
        for (int i = start; i < size; i++) {
            System.out.println(transactions.get(i));
        }
    }
}