//20. Replace all vowels in a given string with a specified character(*).
import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String replaced = str.replaceAll("[AEIOUaeiou]", "*");
        System.out.println("String after replacing vowels: " + replaced);
    }
}
//Output:
// Enter a string: Hello World 
// String after replacing vowels: H*ll* W*rld
//Enter a string: i am ranjith kumar 
//String after replacing vowels: * *m r*nj*th k*m*r
//Explanation:
// This program replaces all vowels in the input string with the asterisk (*) character. It uses the replaceAll() method with a regular expression that matches both uppercase and lowercase vowels.
//  The modified string is then printed to the console. 



//now i replace the all constant with Special characters 
