
public class Main {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("1234567890", "Nguyễn Văn A", 1000000);

        System.out.println("=== Thông tin ban đầu ===");
        account.displayInfo();


        account.deposit(500000);


        account.deposit(-100000);


        account.withdraw(300000);


        account.withdraw(5000000);


        account.withdraw(-200000);


        account.setOwnerName("Trần Văn B");


        account.setOwnerName("   ");

        System.out.println("=== Thông tin cuối cùng ===");
        account.displayInfo();
    }
}