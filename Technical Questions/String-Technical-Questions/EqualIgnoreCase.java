//26.check if Two Strings are Equal Ignoring Case
//Java Program to check if two strings are equal ignoring case
import java.util.Scanner;
public class EqualIgnoreCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        sc.close();
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("The strings are equal ignoring case.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
//explanation: The program takes two strings as input from the user and uses the equalsIgnoreCase() method to compare them while ignoring case differences.
//  It then prints whether the strings are equal or not.