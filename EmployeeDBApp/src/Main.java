import dao.EmployeeDAO;
import java.util.List;
import java.util.Scanner;
import model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double sal = sc.nextDouble();
                    dao.addEmployee(new Employee(name, dept, sal));
                    break;
                case 2:
                    List<Employee> list = dao.getAllEmployees();
                    list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int idU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new dept: ");
                    String newDept = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    double newSal = sc.nextDouble();
                    dao.updateEmployee(new Employee(idU, newName, newDept, newSal));
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int idD = sc.nextInt();
                    dao.deleteEmployee(idD);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
