/*
Write a program to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
of rectangle are entered through keyboard.
 */
import java.util.*;
public class Area {
    public static void setDim(int a,int b)
    {
        System.out.println("The area is "+getArea(a,b));
    }
    public static int getArea(int x, int y)
    {
        return x*y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = input.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = input.nextInt();
        setDim(length,breadth);
    }
}
