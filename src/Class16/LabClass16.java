package Class16;

import java.util.*;

public class LabClass16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // to create object of Scanner

        try {
            System.out.println("\nEnter your first name: ");
            String fName = input.next();

            System.out.println("\nEnter your last name: ");
            String lName = input.next();

            System.out.println("Enter your age in years (whole number): ");
            int age = input.nextInt();

            System.out.println("\nEntered data:\nName: " + fName + " " + lName + ", age = " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid date entered. Try again!");
        }







    }


        }




