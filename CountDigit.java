
import java.util.*;

public class CountDigit {

    /*
    Problem Statement:
    Write a Java program to count the number of digits in a given integer.

    Sample Input: Enter a number: 987654

    Sample Output: Number of digits: 6
    */
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be digit counted");
        int x = sc.nextInt();

        int c = 0;

        while(x > 0)
        {
            c++;
            x = x /10;
        }


        System.out.println("The number of digits in the input number is " + c);
    }
}
