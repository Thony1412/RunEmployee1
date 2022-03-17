
import java.util.*;
class RunEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        PartTimeEmployee ptEmployee = new PartTimeEmployee();

        System.out.println("Enter name: ");
        String name = scan.nextLine();

        System.out.println("Press F for Full Time or P for Part Time: ");
        String empType = scan.nextLine();

        if (empType.equals("F")) {
            ftEmployee.setName(name);

            System.out.println("Enter monthly salary: ");
            double salary = scan.nextDouble();

            ftEmployee.setMonthlySalary(salary);

            System.out.println("Name: " + ftEmployee.getName());
            System.out.println("Wage: " + ftEmployee.getMonthlySalary());
            return;
        }
        
        if (empType.equals("P")) {

            ptEmployee.setName(name);

            System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
            double rph = scan.nextDouble();
            int hw = scan.nextInt();

            ptEmployee.setWage(rph, hw);

            System.out.println("Name: " + ptEmployee.getName());
            System.out.println("Wage: " + ptEmployee.getWage());
            return;
        }

        System.out.println("You entered a wrong input! Please try again.");
    }
}

public class Employee {

    public static void main(String[] args) {
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PartTimeEmployee extends Employee {

    private double ratePerHour, wage;
    private int hoursWorked;

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = (this.ratePerHour * this.hoursWorked);
    }

    public double getWage() {
        return wage;
    }
}

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}