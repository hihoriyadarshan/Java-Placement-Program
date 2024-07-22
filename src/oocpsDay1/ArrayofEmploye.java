package oocpsDay1;

public class ArrayofEmploye {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Alice", 101, 70000);
        employees[1] = new Employee("Bob", 102, 75000);
        employees[2] = new Employee("Charlie", 103, 80000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
