//27. Find the Largest Word in a sentence
//Java Program to find the largest word in a string
import java.util.Scanner;
public class LargestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        sc.close();
        String[] words=sentence.split(" ");
        String largestWord="";
        for (String word:words){
            if (word.length()>largestWord.length()){
                largestWord=word;
            }
        }
        System.out.println("The largest word is: "+ largestWord);
    }
}
