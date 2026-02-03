//18.print all substrings of a string
import java.util.Scanner;
public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println("All substrings of the given string are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
//Output:
// Enter a string: apple
// All substrings of the given string are:
// a
// ap
// app
// appl
// apple
// p
// pp
// ppl
// pple
// p
// pl
// ple
// l
// le
// e
//now i want print string in reverse order of substrings
// import java.util.Scanner;  
// public class Substrings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         sc.close();

//         System.out.println("All substrings of the given string in reverse order are:");
//         for (int i = str.length(); i > 0; i--) {
//             for (int j = 0; j <= str.length() - i; j++) {
//                 System.out.println(str.substring(j, j + i));
//             }
//         }
//     }
// }
//Output:
// Enter a string: apple
// All substrings of the given string in reverse order are:
// apple
// appl
// pple
// ppl 
// pl
// le
// a
// p
// p
// l
// e
//Explanation:
// This program generates and prints all substrings of a given string in reverse order of their lengths
// It uses nested loops to create substrings starting from the longest to the shortest and prints each substring to the console.



//mow i want to print sunbstring of 2 length only
// import java.util.Scanner;
// public class Substrings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         sc.close();

//         System.out.println("All substrings of length 2 are:");
//         for (int i = 0; i < str.length() - 1; i++) {
//             System.out.println(str.substring(i, i + 2));
//         }
//     }
// }
//Output:
// Enter a string: apple
// All substrings of length 2 are:
// ap
// pp

