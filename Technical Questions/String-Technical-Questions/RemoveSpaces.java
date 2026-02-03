import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Space separated words  :  ");
        String str=sc.nextLine();
        sc.close();
        
        String nospaceStr = str.replaceAll(" ", "");
        System.out.println("String without Spaces : " + nospaceStr);
    }
}