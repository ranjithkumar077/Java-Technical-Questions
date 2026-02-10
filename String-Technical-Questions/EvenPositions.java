//23. Print Characters at Even Positions in a String
//Java Program to print characters at even positions in a string
import java.util.Scanner;
public class EvenPositions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        sc.close();
        System.out.println("Characters at even positions:");
        for (int i=1;i<str.length();i+=2){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    
//Output
//Enter a string:
//hello world
//Characters at even positions:
//e o olr
//Explanation: The program iterates through the string starting from index 1 (the second character) and increments the index by 2 in each iteration to access characters at even positions (1, 3, 5, etc.). It prints these characters to the console.
//Time Complexity: O(n), where n is the length of the string.
//Space Complexity: O(1), as no additional space is used that grows with input size.
// does the zero is even position?
//Yes, in programming and computer science, indexing typically starts at 0. Therefore, the first character of a string is considered to be at index 0, which is an even position. Subsequent characters are indexed as follows: the second character is at index 1 (odd), the third character is at index 2 (even), and so on.
