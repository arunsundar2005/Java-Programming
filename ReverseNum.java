import java.util.*;
public class ReverseNum {

    /*
    
    Problem Statement:
    Write a Java program to reverse a given integer number using loops.

    Sample Input: Enter a number: 12345

    Sample Output: Reversed number: 54321
    
    */




    // Create a main function - Get input and reverse it
    
    // Scanner obj = new Scanner


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number to be reversed"); 
        int num = sc.nextInt(); // num = 658

        // when to use for loop -> when you know the numebr of times loop must run
        // when you dont know -> while loop

        // break-condition : num = 0 or num < 0

        while(num > 0)  
        {
            System.out.print(num%10);
            num = num / 10;
        }


        /*
        
        Dry-run

        num = 658
        while(658 > 0) True -enter loop
        print(658%10)-> 8
        num = num /10
        num = 658 / 10
        num = 65

        2nd iteration

        num=65
        conditon => (65>0) - true enter loop
        print(num % 10) -> 5
        num = num /10
        num = 65 / 10
        num = 6

        3rd iteration

        condition (num>0)
        (6>0) - true enter loop
        print(num % 10) 
        since num < 10 the modulo(%) operator returns num itself
        prints 6

        num = num /10
        num = 6/10

        Since num < 10 division operator (/) returns 0
        num = 0;


        4thh iteration
        condittion(num>0) (0>0)) - False Loop stops 




        o/p
        856

        
        Things to remember
        % operator return the num if the num is less than the divisor
        / operator return zero if the num is less than the devisor
        */

    }

}
