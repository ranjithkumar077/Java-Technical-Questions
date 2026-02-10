//24. Concatenate Two Strings
//Java Program to concatenate two strings

import java.util.Scanner;
public class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        sc.close();
        String result=s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: "+ result);
    }
}
//Output
//Enter First string:
//hello
//Enter second string:
//world
//Concatenated String: hello world
//Enter First string:
// i am 
// Enter second string:
// Ranjith kumar
// Concatenated String: i am  Ranjith kumar
//Explanation: The program takes two strings as input from the user and uses the concat() method to concatenate them with a space in between. The result is then printed to the console.
//Time Complexity: O(n + m), where n and m are the lengths of the two strings being concatenated.
//Space Complexity: O(n + m), as a new string is created to hold the concaten