//12 . First non-repeated character in a string
//Write a program to find the first non-repeated character in a given string.
import java.util.Scanner;
public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }
        // System.out.println("All characters are repeated.");
    }
}
