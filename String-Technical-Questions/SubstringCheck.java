//check if a string is a substring of substring

public class SubstringCheck {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        boolean isSubstring = str1.contains(str2);
        System.out.println("Is \"" + str2 + "\" a substring of \"" + str1 + "\"? " + isSubstring);
    }
}