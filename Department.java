/*
Write a java code for following UML. Create two objects of the Department Class, take the
values as input and display the information.
 */


import java.util.*;
public class Department {
    String dept_name , faculty;
    int dept_code;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Department department1 = new Department();
        System.out.println("Enter your department name ");
        department1.dept_name = input.nextLine();
        System.out.println("Enter your facultly name ");
        department1.faculty = input.nextLine();
        System.out.println("Enter your department code ");
        department1.dept_code = input.nextInt();
        input.nextLine();

        Department department2 = new Department();
        System.out.println("Enter your department name ");
        department2.dept_name = input.nextLine();
        System.out.println("Enter your facultly name ");
        department2.faculty = input.nextLine();
        System.out.println("Enter your department code ");
        department2.dept_code = input.nextInt();


        System.out.println("Your department name is "+department1.dept_name);
        System.out.println("Your faculty name is "+department1.faculty);
        System.out.println("Your department code is "+department1.dept_code);

        System.out.println("Your department name is "+department2.dept_name);
        System.out.println("Your faculty name is "+department2.faculty);
        System.out.println("Your department code is "+department2.dept_code);

    }
}
