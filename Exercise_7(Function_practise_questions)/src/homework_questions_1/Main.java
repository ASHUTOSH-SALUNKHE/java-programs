package homework_questions_1;
import java.util.*;

public class Main {

    // 1] Fibonacci Series
    public static void fib(int num1 , int num2 , int count , int max_count) {

        if(count >= max_count ) {
            return;
        }

        System.out.print(num1+ " ");

        int temp = num1 + num2;

        fib(num2 , temp , count+1 , max_count);
    }

    // 2] Even Odd
    public static void evenOdd(int num) {

        if(num % 2 == 0) {
            System.out.println(num + " is a Even Number");
        }
        else {
            System.out.println(num + " is a Odd Number");
        }
    }

    // 3] Reverse Number
    public static int reverseNo(int num) {

        int rev = 0;

        while(num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    // 4] Palindrome Number
    public static void checkPalindrome(int num) {

        int rev = reverseNo(num);

        if(num == rev) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is NOT Palindrome");
        }
    }

    // 5] Star Pattern
    public static void starPattern(int n) {

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 6] Prime Number
    public static void checkPrime(int num) {

        if(num <= 1) {
            System.out.println(num + " is NOT Prime");
            return;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println(num + " is NOT Prime");
                return;
            }
        }

        System.out.println(num + " is Prime");
    }

    public static void main(String[] args) {

        // 1] Fibonacci
        {
            int max_count = 10;
            System.out.print("Fibonacci Series => ");
            fib(0 , 1 , 0 , max_count);
        }

        // 2] Even Odd
        {
            System.out.print("\n\nEven or Odd => ");
            evenOdd(34);
        }

        // 3] Reverse Number
        {
            int rev = reverseNo(234243);
            System.out.println("\n\nReverse Number => " + rev);
        }

        // 4] Palindrome
        {
            checkPalindrome(121);
        }

        // 5] Star Pattern
        {
            System.out.println("\nStar Pattern => ");
            starPattern(5);
        }

        // 6] Prime Number
        {
            checkPrime(29);
        }
    }
}
