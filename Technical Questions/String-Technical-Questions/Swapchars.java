//9. Swap characters in a string
//Write a program to swap the first and last characters of a given string.




public class Swapchars {
    public static void main(String[] args) {
        String str = "apple";
        
        if (str.length ()>= 1) {
            String swappedStr = str.charAt(str.length() - 1) +
             str.substring(1, str.length() - 1) +
              str.charAt(0);
            System.out.println("Swapped String: " + swappedStr);

    }else {
        System.out.println(str);
    }
}
}