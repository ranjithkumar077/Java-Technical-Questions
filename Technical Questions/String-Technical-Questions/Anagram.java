// 4 - Anagram
// 4 - Write a program to check if two strings are anagrams of each other.


import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = sc.nextLine();
        sc.close();

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if (Arrays.equals(arr1, arr2)) {
        System.out.println("OUTPUT : The strings are anagrams.");
    } else {
        System.out.println("OUTPUT : The strings are not anagrams.");
    }
}
}