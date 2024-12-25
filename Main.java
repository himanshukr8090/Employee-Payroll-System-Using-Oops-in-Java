public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("vikas",1,70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Himanshu",2,50,200);


        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details");
        payrollSystem.displayEmployee();

        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(2);
        System.out.println();

        System.out.println("Remaining Employee");
        payrollSystem.displayEmployee();
    }
}