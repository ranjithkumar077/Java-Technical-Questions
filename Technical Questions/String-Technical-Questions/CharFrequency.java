//10. Character Frequency in a String
//Write a program to count the frequency of each character in a given string.
import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
       char target= sc.next().charAt(0);
        sc.close();
        int frequency = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                frequency++;
            }
        }
        System.out.println("Frequency of '" + target + "' in the string: " + frequency);
    }
}
