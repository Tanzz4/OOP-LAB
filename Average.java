/*
 Print the average of three numbers entered by user by creating a class named 'Average' having
a method to calculate and print the average.
 */

import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = input.nextInt();
        System.out.println("Enter Second number");
        int b = input.nextInt();
        System.out.println("Enter third number");
        int c = input.nextInt();

        float avg = ((float) a+b+c)/3;

        System.out.println("The average is "+avg);
    }
}
