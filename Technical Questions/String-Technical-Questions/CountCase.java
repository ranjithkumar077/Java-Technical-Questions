//16 .Count uppercase and lowercase letters in a string
import java.util.Scanner;
public class CountCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);
    }
}
