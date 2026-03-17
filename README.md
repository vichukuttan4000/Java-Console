# 🏧 ATM Console Application (Java)

## 📌 About the Project

This is a console-based ATM simulation built using Java.
It replicates real-world ATM operations with both **User and Admin functionalities**, focusing on OOP design and system behavior.

---

## 🚀 Features

### 👤 User Features

* Login using Account Number & PIN
* Balance Check
* Deposit money (only multiples of ₹100)
* Withdraw money (only multiples of ₹100)
* Change PIN
* Mini Statement (last 6 transactions with timestamp)

---

### 👨‍💼 Admin Features

* Admin login (password protected)
* Refill ATM cash (CDM functionality)
* View total transactions
* View per-day transactions

---

## 💡 Additional Functionalities (Unique to this Project)

### 💰 ATM Cash Management

* Tracks available cash inside ATM
* Prevents withdrawal if ATM has insufficient cash
* Prevents deposit if ATM capacity is full

---

### 🧾 Transaction Tracking

* Stores every transaction with timestamp
* Displays last 6 transactions (mini statement)

---

### ⚠️ Smart Validations

* Denomination validation (₹100 multiples only)
* Insufficient account balance check
* ATM cash availability check
* Invalid PIN handling

---

### 🔄 Continuous Execution

* Program handles invalid input using exception handling
* Displays error message and continues execution without crashing

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* HashMap (account storage)
* ArrayList (transaction history)
* LocalDate & LocalDateTime
* Exception Handling

---

## 🗂️ Project Structure

```id="structure1"
AtmOops.java        → Main program & menu flow
ATMService.java     → ATM logic, cash handling, transaction tracking
Account.java        → Account details & operations
Transaction.java    → Transaction records
```

---

## ⚙️ How to Run

```id="run1"
javac *.java
java AtmOops
```

---

## 🧪 Sample Accounts

| Account No | PIN  | Balance |
| ---------- | ---- | ------- |
| 1          | 1234 | 1000    |
| 2          | 1234 | 5000    |
| 3          | 1234 | 8000    |

---

## ⚠️ Notes

* Console-based application (no database)
* Data stored using Java collections
* Focus on system logic and OOP

---

## 🔮 Future Improvements

* Database integration
* GUI interface
* Account lock after multiple wrong
