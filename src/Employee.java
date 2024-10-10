package src;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info () {
        System.out.println("Name " + name);
        System.out.println("Position " + position);
        System.out.println("Email " + email);
        System.out.println("Phone " + phone);
        System.out.println("Salary " + salary);
        System.out.println("Age " + age);
        System.out.println();
    }
    public static void main (String[]args) {
        Employee employee = new Employee(
                "Ivanov Ivan",
                "Manager",
                "erty@gmail.com",
                "356748578",
                5000,
                28
        );
        employee.info();

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Maximov Maxim", "Engineer", "maximov@gmail.com", "12345678", 25000, 32);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@gmail.com", "87654321", 30000, 28);
        employees[2] = new Employee("Sidorov Sidor", "Developer", "sidorov@gmail.com", "11223344", 27000, 30);
        employees[3] = new Employee("Smirnov Artem", "Designer", "smirnov@gmail.com", "44332211", 22000, 25);
        employees[4] = new Employee("Krylov Sergey", "Analyst", "krylov@gmail.com", "99887766", 32000, 35);

        for (Employee emp : employees) {
            emp.info();
        }
    }
}
