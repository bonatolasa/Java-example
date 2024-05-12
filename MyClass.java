
//A simple example to define and invoke a method in a Java class:
public class  MyClass{
    //Defining a no argument method
    public static void show(){
        System.out.println("Welcome to Java Programming");
    }
    //Defining a two argument method
    public static void add(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
        }
    public static void main(String[] args) {
        //Initializing variables
        int var1 = 10;
        int var2 = 20;
        System.out.println("This is Objects and Classes in Java");
        //Invoking methods
        show();
        System.out.println("Sum of gin=ven numbers is"+add(var1,var2));
    }
}