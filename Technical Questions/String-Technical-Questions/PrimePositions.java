//Print Characters at prime number Positions in a String
//Java Program to print characters at prime number positions in a string
import java.util.Scanner;
public class PrimePositions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        sc.close();
        System.out.println("Characters at prime number positions:");
        for (int i=2;i<str.length();i++){
            if (isPrime(i)){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//Output
//Enter a string:
//hello world
//Characters at prime number positions:
//l o
//Explanation: The program defines a method isPrime() to check if a number is prime.
//It then iterates through the string starting from index 2 (the third character) and checks if the index is a prime number.
//If it is, the character at that index is printed to the console.
//Time Complexity: O(n√m), where n is the length of the string and m is the maximum index being checked for primality.
//Space Complexity: O(1), as no additional space is used that grows with input size.
