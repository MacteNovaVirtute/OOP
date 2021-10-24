public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        EmployeeService employeeService = new EmployeeService(employeeFactory.generateEmployees(10));

        employeeService.printEmployees();
        System.out.println("- ID -");

        try {
            System.out.println(employeeService.getById(5).toString());
        } catch (NullPointerException e) {
            System.out.println("No such id");
        }

        System.out.println("- Name - ");
        System.out.println(employeeService.getByName(employeeService.employees[3].getName()));

        System.out.println(" - Sort By Name -");
        for (Employee employee : employeeService.sortByName()) {
            System.out.println(employee.toString());
        }

        System.out.println("- Sort by name and salary -");
        for (Employee employee : employeeService.sortByNameAndSalary()) {
            System.out.println(employee.toString());
        }

        System.out.println(" - Edit -");
        Employee editEmployee = new Employee(2, "NewEmployee", 30, 1000, "female");
        System.out.println(employeeService.edit(editEmployee));

        System.out.println("- Remove -");

        try {
            System.out.println(employeeService.remove(3));
        } catch (NullPointerException ex) {
            System.out.println("No such Id");
        }

        System.out.println("- Fee -");
        System.out.println(employeeService.calculateSalaryAndBonus());

        System.out.println("-  New Employee  -");
        Developer developer = new Developer(5, "New Developer", 100, 1000, "male", 1000);
        System.out.println(employeeService.employees.length);
        System.out.println();
        employeeService.add(developer);
        System.out.println();
        employeeService.printEmployees();
        System.out.println();
        System.out.println(employeeService.employees.length);
    }
}
