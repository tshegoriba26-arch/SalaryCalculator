/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarycalculator;

/**
 *
 * @author tsheg
 */
import java.util.Scanner;

public class SalaryCalculator {
    // Constants
    private static final double TAX_RATE = 0.15;
    private static final double HOURLY_RATE = 10.0;
    
    // Instance variables
    private int hoursWorked;
    private double salary;
    private double tax;
    private double netSalary;

    // Scanner for user input
    private final Scanner scanner;

    public SalaryCalculator() {
        scanner = new Scanner(System.in);
    }

    // Method to calculate salary without overtime
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }

    // Method to calculate tax
    public double calculateTax(double salary) {
        return salary * TAX_RATE;
    }

    // Method overloading: calculate salary with overtime
    public double calculateSalary(int regularHours, int overtimeHours) {
        double regularPay = regularHours * HOURLY_RATE;
        double overtimePay = overtimeHours * (HOURLY_RATE * 1.5);
        return regularPay + overtimePay;
    }

    // Method to get user input
    public void getUserInput() {
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = scanner.nextInt();
    }

    // Method to calculate and display results
    public void calculateAndDisplayResults() {
        // Calculate salary
        salary = calculateSalary(hoursWorked);
        
        // Calculate tax
        tax = calculateTax(salary);
        
        // Calculate net salary
        netSalary = salary - tax;

        // Display results
        System.out.println("\nSalary Calculation Results:");
        System.out.printf("Salary before tax: $%.2f\n", salary);
        System.out.printf("Tax deducted: $%.2f\n", tax);
        System.out.printf("Net salary after tax: $%.2f\n", netSalary);
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.getUserInput();
        calculator.calculateAndDisplayResults();
    }
}

