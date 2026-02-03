//19. check if string Starts and Ends with same character
import java.util.Scanner;
public class StartEndSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("The string starts and ends with the same character.");
        } else {
            System.out.println("The string does not start and end with the same character.");
        }
    }
}
//Output:
// Enter a string: radar
// The string starts and ends with the same character.
// Enter a string: hello
// The string does not start and end with the same character.
//Explanation:
// This program checks if the first and last characters of a given string are the same. It reads a string from the user, compares the first and last characters using charAt(), and prints the appropriate message based on the comparison result.//Output:
