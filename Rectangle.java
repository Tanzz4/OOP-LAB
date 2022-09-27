/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area.

 */
import java.util.*;

public class Rectangle {
    public static int Area(int x,int y)
    {
        return x*y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a=4;
//        int b = 5;
//        int area = Area(4,5);
        System.out.println("the area is "+Area(4,5));
        System.out.println("the area is "+Area(5,8));
    }
}
