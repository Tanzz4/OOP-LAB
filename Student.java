/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
        the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
        Then print the information.*/


public class Student {
    String name;
    int roll_no;
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "John";
        st.roll_no = 2;
        System.out.println("Name is "+st.name);
        System.out.println("Roll no is "+st.roll_no);

    }
}
