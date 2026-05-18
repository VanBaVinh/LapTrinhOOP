public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nguyễn Văn A", 10000000);
        Employee e2 = new Employee("Trần Thị B", 12000000);
        Employee e3 = new Employee("Lê Văn C", 15000000);

        System.out.println("=== Danh sách nhân viên ===");
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        System.out.println("ID e1: " + e1.getId());
        System.out.println("ID e2: " + e2.getId());
        System.out.println("ID e3: " + e3.getId());

        System.out.println("\n=== Thống kê công ty ===");
        System.out.println("Tổng số nhân viên: " +
                Employee.getEmployeeCount());
        System.out.println("Tổng lương: " +
                Employee.getTotalSalary());
        System.out.println("Lương trung bình: " +
                Employee.getAverageSalary());

        System.out.println("\n=== Sau khi tăng lương cho e2 ===");
        e2.setSalary(18000000);

        System.out.println("Lương mới của e2: " + e2.getSalary());
        System.out.println("Tổng lương mới: " +
                Employee.getTotalSalary());
        System.out.println("Lương trung bình mới: " +
                Employee.getAverageSalary());
    }
}