import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeMap staff = new EmployeeMap();
        staff.hireEmployee(new Employee("Марина", "Арбузова", 1, 100_000));
        staff.hireEmployee(new Employee("Михаил", "Басманов", 2, 30_000));
        staff.hireEmployee(new Employee("Арина", "Волкова", 5, 70_000));
        staff.hireEmployee(new Employee("Марат", "Галиуллин", 3, 250_000));
        staff.hireEmployee(new Employee("Мария", "Дерябина", 4, 50_000));
        staff.hireEmployee(new Employee("Тимофей", "Елистратов", 5, 35_000));
        staff.hireEmployee(new Employee("Анна", "Жигалова", 4, 65_000));
        staff.hireEmployee(new Employee("Артур", "Зайнуллин", 2, 25_000));
        staff.hireEmployee(new Employee("Иван", "Игнатьев", 3, 115_000));
        staff.hireEmployee(new Employee("Арина", "Котова", 4, 130_000));

        staff.showAllEmployees();

        System.out.println("Enter data to add new employee:");
        Scanner in = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = in.nextLine();
        System.out.print("Last name: ");
        String lastName = in.nextLine();

        System.out.print("Enter department number (1 - 5): ");
        int deptNo = Integer.parseInt(in.nextLine());
        while (deptNo < 1 || deptNo > 5) {
            System.out.print("You entered wrong department number. Try again (1 - 5): ");
            deptNo = in.nextInt();
        }
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(in.nextLine());

        staff.hireEmployee(new Employee(firstName, lastName, deptNo, salary));
        staff.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to fire? Emter the full name: ");
        String nameToWork = in.nextLine();
        staff.fireEmployee(nameToWork);
        staff.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to change salary? Emter the full name: ");
        nameToWork = in.nextLine();
        System.out.print("Enter new salary: ");
        salary = Double.parseDouble(in.nextLine());
        staff.changeSalary(nameToWork, salary);
        staff.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to move in another department? Emter the full name: ");
        nameToWork = in.nextLine();
        System.out.print("Enter new department (1 - 5): ");
        deptNo = Integer.parseInt(in.nextLine());
        staff.changeSalary(nameToWork, deptNo);
        staff.showAllEmployees();
        System.out.println("============================================");

        in.close();

        System.out.println("Employees by department");
        staff.showEmployeesByDept();
    }
}