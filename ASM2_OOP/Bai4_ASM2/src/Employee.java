public class Employee {

    private int id;
    private String name;
    private double salary;

    private static int employeeCount = 0;
    private static int nextId = 1000;

    public static String companyName = "TechCorp";

    private static double totalSalary = 0;


    Employee(String name, double salary) {
        this.id = nextId;
        nextId++;

        this.name = name;
        this.salary = salary;

        employeeCount++;
        totalSalary += salary;
    }


    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }


    void setName(String name) {
        this.name = name;
    }


    void setSalary(double newSalary) {
        totalSalary -= this.salary;

        this.salary = newSalary;

        totalSalary += this.salary;
    }


    static int getEmployeeCount() {
        return employeeCount;
    }

    static double getTotalSalary() {
        return totalSalary;
    }

    static double getAverageSalary() {
        if (employeeCount == 0) {
            return 0;
        }
        return totalSalary / employeeCount;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("Công ty: " + companyName);
        System.out.println();
    }
}