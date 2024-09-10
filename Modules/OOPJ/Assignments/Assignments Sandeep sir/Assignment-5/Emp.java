package Ass_5_sir;

import java.util.*;

class Employee{
	
	 private static int totalEmployee = 0; 
	    private static double totalSalaryExpense = 0;  
	    private int Id;
	    private String name;
	    private double salary;

	    public Employee(int Id, String name, double salary) {
	        this.Id = Id;
	        this.name = name;
	        this.salary = salary;
	        totalEmployee++;
	        totalSalaryExpense += salary;
	    }

	 
	    public static int getTotalEmployees() {
	        return totalEmployee;
	    }

	    public static void applyRaise(double percentage) {
	        totalSalaryExpense = 0;  
	        for (Employee emp : employeeList) {
	            emp.salary += emp.salary * (percentage / 100);
	            totalSalaryExpense += emp.salary;
	        }
	    }

	    public static double calculateTotalSalaryExpense() {
	        return totalSalaryExpense;
	    }

	    // Non-static methods
	    public void updateSalary(double newSalary) {
	        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
	        this.salary = newSalary;
	    }

	    @Override
	    public String toString() {
	        return "Employee[ID=" + Id + ", Name=" + name + ", Salary=" + salary + "]";
	    }

	    // List of employees
	    private static List<Employee> employeeList = new ArrayList<>();

	    public static void addEmployee(Employee emp) {
	        employeeList.add(emp);
	    }
	}


public class Emp {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Shraddha Sakhare", 50000);
        Employee emp2 = new Employee(2, "Sharddha Mitkari", 60000);
        Employee.addEmployee(emp1);
        Employee.addEmployee(emp2);

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: ₹" + Employee.calculateTotalSalaryExpense());

        Employee.applyRaise(10);  // Apply 10% raise to all employees
        System.out.println("Total Salary Expense after raise: ₹" + Employee.calculateTotalSalaryExpense());

        emp1.updateSalary(55000);  // Update salary of employee 1
        System.out.println("Updated Salary Expense: ₹" + Employee.calculateTotalSalaryExpense());

        // Print Employee Details
        System.out.println(emp1);
        System.out.println(emp2);
	}

}




/*
 * Design and implement a class named 
Employee
 String
 . 
class. 
to manage employee data for a company. 
The class should include fields to keep track of the total number of employees and the 
total salary expense, as well as individual employee details such as their ID, name, and 
salary. 
The class should have methods to: 
 
 
Retrieve the total number of employees (
 getTotalEmployees()
 Apply a percentage raise to the salary of all employees (
 ) 
applyRaise(double 
percentage)
  
) 
Calculate the total salary expense, including any raises 
(
 calculateTotalSalaryExpense()
  
) 
Update the salary of an individual employee (
 updateSalary(double 
newSalary)
 )
 */
