//11. Remove duplicate characters from a string
//Write a program to remove duplicate characters from a given string.



import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        String result="";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (result.indexOf(ch)==-1){
                result +=ch;
            }
        }
        System.out.println("removing duplicates: " + result);
}
}