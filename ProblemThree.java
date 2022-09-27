import java.util.Scanner;
public class ProblemThree {
    int age;
    double cgpa;
    String name,department,section;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter your age");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Enter you department name");
        String Department = in.nextLine();
        System.out.println("enter your secton");
        String section = in.nextLine();
        System.out.println("Enter you cgpa");
        double cgpa = in.nextDouble();
        System.out.println("your name is " +name);
        System.out.println("your age is "+age);
        System.out.println("You department name is" +Department);
        System.out.println("your secton is "+section);
        System.out.println("Your cgpa is " +cgpa);


    }
}
