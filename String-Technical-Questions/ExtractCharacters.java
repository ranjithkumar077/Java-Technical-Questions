import java.util.Scanner;

public class ExtractCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        sc.close();

        String vowels = "";
        String consonants = "";
        String digits = "";
        String specialChar = "";

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                vowels += ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants += ch;
            }
            else if (ch >= '0' && ch <= '9') {
                digits += ch;
            }
            else if (ch != ' ') {
                specialChar += ch;
            }
        }

        System.out.println("\nExtracted Characters:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChar);
    }
}
