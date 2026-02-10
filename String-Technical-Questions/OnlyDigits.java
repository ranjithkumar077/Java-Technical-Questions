//14 . check if the string contains only digits
import java.util.Scanner;
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close(); 

        boolean isOnlyDigits = str.matches("[0-9]+"); //for only digits
        //boolean isOnlyDigits = str.matches("[a-zA-Z]+"); // for only alphabets
        System.out.println("String contains only digits: " + isOnlyDigits);
    }

}
