//21. compare Two Strings Without Using Equals
//Java Program to compare two strings without using inbuilt functions
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First  strings:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        sc.close();
    boolean equal=true;
    if (s1.length()!=s2.length()){
        equal=false;
    } else {
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                equal=false;
                break;
            }
        }
    }
    System.out.println("Equals?="+ equal);
    }
}
//Output
//Enter First  strings:
//hello
//Enter second string:
//hello
//Equals?=true
// Enter First  strings:
// ranjith
// Enter second string:
// kumar
// Equals?=false
// //Explanation: The program compares two strings character by character after checking their lengths.
//If lengths differ, they are not equal. If lengths are the same, it checks each character for equality.


//Time Complexity: O(n), where n is the length of the strings being compared.
//Space Complexity: O(1), as no additional space is used that grows with input size.

// how to calculate time complexity and space complexity?
//Time Complexity: O(n), where n is the length of the strings being compared.
// This is because in the worst case, we may need to compare each character of both strings once.
//Space Complexity: O(1), as no additional space is used that grows with input size.