public class BankAccount {
    // 1. Thuộc tính private
    private String accountNumber;   // Số tài khoản
    private String ownerName;       // Tên chủ tài khoản
    private double balance;         // Số dư

    BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            System.out.println("Cảnh báo: Số dư không được âm. Đặt số dư = 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getOwnerName() {
        return ownerName;
    }

    double getBalance() {
        return balance;
    }

    void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.trim().isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Lỗi: Tên chủ tài khoản không hợp lệ.");
        }
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công: " + amount);
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền rút phải lớn hơn 0.");
        } else if (amount > balance) {
            System.out.println("Lỗi: Số dư không đủ.");
        } else {
            balance -= amount;
            System.out.println("Rút thành công: " + amount);
        }
    }


    void displayInfo() {
        String maskedAccount;

        if (accountNumber.length() >= 4) {
            String last4 = accountNumber.substring(accountNumber.length() - 4);
            maskedAccount = "****" + last4;
        } else {
            maskedAccount = "****" + accountNumber;
        }

        System.out.println("Số tài khoản: " + maskedAccount);
        System.out.println("Chủ tài khoản: " + ownerName);
        System.out.println("Số dư: " + balance);
        System.out.println();
    }
}