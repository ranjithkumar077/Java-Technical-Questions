// 6.Count words in a srtring 
// INPUT: "Hello World From Java"
// OUTPUT: 4

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello World From Java";
        String[] words = str.split(" ");
        System.out.println("Number of words in the string: " + words.length);
    }
}
