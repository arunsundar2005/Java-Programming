// import java.util.Scanner; // Imported Scanner class
import java.util.*; // IMports all classes from java.util | * -> all

public class calculator {
    
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int sub(int a, int b)
    {
        return a-b;
    }

    public static int mult(int a, int b)
    {
        return a*b;
    }


    public static int divide(int a, int b)
    {
        return a/b;
    }

    public static void main(String[] args) 
    { // args -> Array which contains string values
        
        int a = 0;
        int b = 0;
        // float x = 3.14f;
        // float y = 2.25f;

        // Input from user.

        // Import Scanner
        // Scanner -> Used to get input (Class)
        // Scanner Initialize ( Create a object for it)
        // use that to get input.
        
        Scanner reader = new Scanner(System.in); // object -> reader

        System.out.println("Enter a");
        a = reader.nextInt(); //int input
        System.out.println("Enter b");
        b = reader.nextInt(); //int input


        reader.close();

        // In Python input("Text")


        // calling the functions
        System.out.println("Addition = " + add(a,b));
        System.out.println("Sibtraction = " + sub(a,b));
        System.out.println("Multiplication = " + mult(a,b));
        System.out.println("Division = " + divide(a,b));

    }


}
