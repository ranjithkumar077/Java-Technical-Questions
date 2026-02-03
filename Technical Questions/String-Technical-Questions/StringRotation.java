//17. Check if a string is a rotation of another string
//Write a program to check if one string is a rotation of another string.
import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = sc.nextLine();
        sc.close();

        if (str1.length() == str2.length()&& (str1 + str1).contains(str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
//OUTPUT:Enter the first String : abcd
// Enter the second String : cdab
// Rotation