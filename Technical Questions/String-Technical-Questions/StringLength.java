// 7. Count the length of a string without using length() method
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        int length = 0;
        for (char _ : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of the string: " + length);
    }
}
