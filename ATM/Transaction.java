import java.time.LocalDateTime;
public class Transaction {
    String type;
    int amount;
    LocalDateTime time;
    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }
    public String toString() {
        return type + " : " + amount + " : " + time;
    }
}