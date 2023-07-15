// This program demos keyboard input in scanner app use console class

import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        String name;
        int age;
        float salary;

        Scanner myScanner  = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = myScanner.next();

        System.out.print("Enter your age : ");
        age = myScanner.nextInt();

        System.out.print("Enter your salary : ");
        salary = myScanner.nextFloat();

        System.out.println("Name = " + name);        
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}
