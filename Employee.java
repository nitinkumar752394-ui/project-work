import java.util.Scanner;

public class Employee {

    int id;
    String name;
    int age;
    String department;
    double salary;

    Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, department, salary);

        emp.displayEmployee();

        sc.close();
    }
}