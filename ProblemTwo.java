import java.util.*;
public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = Math.PI*r*r;
        System.out.printf("Area of a circle is %.2f",area);
    }
}
