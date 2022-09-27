/*
Create a Person Class. Each person of this class will have name and age. Create two objects of
the Person Class, take input for each object, Set the values and display the information.
 */
import java.util.*;
public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person1 =new Person();
        System.out.println("Enter the name of person 1");
        person1.name = input.nextLine();
        System.out.println("Enter the age of person 1");
        person1.age = input.nextInt();
        input.nextLine();

        Person person2 = new Person();
        System.out.println("Enter the name of person 2");
        person2.name = input.nextLine();
        System.out.println("Enter the age of person 2");
        person2.age = input.nextInt();

        System.out.println("Person 1 name is " +person1.name);
        System.out.println("Person 1 name is " +person1.age);
        System.out.println("Person 1 name is " +person2.name);
        System.out.println("Person 1 name is " +person2.age);
    }
}
