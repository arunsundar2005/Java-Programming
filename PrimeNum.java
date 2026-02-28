import java.util.*;
public class PrimeNum {
    /*
    Write a Java program to print all prime numbers from 1 to N.
    A prime number is a number greater than 1 that has no divisors other than 1 and itself.

    Sample Input: Enter the value of N: 20

    Sample Output: Prime numbers till 20: 2 3 5 7 11 13 17 19
    */


    public static boolean isPrime(int x)
    {
        // how to find prime number
        // create a loop to run from 2 to x-1
        // if divisible by atleast any one number then not a prime

        if(x==0)
        {
            return false;
        }

        if(x==1)
        {
            return false;
        }

        for(int i=2; i<= x-1; i++)
        {
            // % -> returns the remainder after division.
            // != Not equal
            if(x % i == 0) // divisibilty condition
            // 2 % 10 = 0 == 0 - True - Enters If body
            {
                return false; // return False and exit the FUNCTION
            }
            
        }


        /*
        
        x = 3
        i =2

        3 % 2==0 : Fasle
        i++
        i= 3, but acc to condiotn i< = x-1 => i<=2
        so i cannot become 3 -> Loop stops
        return True

        */
        return true;
    }

    public static void main(String[] args)
    {
        // user -> input max N
        Scanner sc = new Scanner(System.in); // Scanner obkect Initialization
        // sc -> object name given by programmer
        // Class_name obj_name = new Class_name()
        // new -> keyword
        // Class_name() -> Constructer of class
        System.out.println("Enter the Ending Number");
        int N = sc.nextInt(); // input of Integer
        // String = Sc.nextLine();
        System.out.println("The Prime Number starting from 1 to " + N + " are :");
        for(int i =1; i<=N; i++) // for loop 
        {
            if(isPrime(i)) // i -> isPrime() = x
            {
                System.out.println(i);
            }
        }
    }
}
