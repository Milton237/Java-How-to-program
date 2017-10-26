/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee emp1 = new Employee("Ndi", "Milton", 5000.5);
        Employee emp2 = new Employee("Jato", "Mark", 7500.5);
        System.out.printf("Employee first name: %s%n Employee last name: %s%n Employee salary: %.2f%n", emp1.getFirstName(),emp1.getLastName(), emp1.getSalary());
        System.out.printf("Employee first name: %s%n Employee last name: %s%n Employee salary: %.2f%n", emp2.getFirstName(),emp2.getLastName(), emp2.getSalary());
        double raise1 = ((10 / 100) * emp1.getSalary()) ;
        double raise2 = ((10 / 100) * emp2.getSalary());
        emp1.setSalary(raise1);
        emp2.setSalary(raise2);
        System.out.println("New employee details afte salary increase....");
        System.out.printf("Employee first name: %s%n Employee last name: %s%n Employee salary: %.2f%n", emp1.getFirstName(),emp1.getLastName(), emp1.getSalary());
        System.out.printf("Employee first name: %s%n Employee last name: %s%n Employee salary: %.2f%n", emp2.getFirstName(),emp2.getLastName(), emp2.getSalary());
    }
}
