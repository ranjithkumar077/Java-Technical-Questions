//2. Palindrome string 
// problem :Write a program to check whether a given string is a palindrome or not.


import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("The "+str+" is a Palindrome");
        } else {
            System.out.println("The "+str+" is not a Palindrome");
        }
    }
}
