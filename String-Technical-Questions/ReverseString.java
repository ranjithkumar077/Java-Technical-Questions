// 1 a . Reverse a String
// Problem: Write a java program to Reverse a string 
// INPUT:
// Hello
// Output :
// elloH
import java.util.Scanner;
public class ReverseString{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str =sc.nextLine();
        sc.close();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev +=str.charAt(i);

        }
        System.out.println("Reversed String : "+rev);
    }
}