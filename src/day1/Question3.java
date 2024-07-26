package day1;

// Check if the string is palindrome or not.

public class Question3 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]", "");
        cleanedStr = cleanedStr.toLowerCase();
        int start = 0;
        int end = cleanedStr.length() - 1;
        return stringPalindrome(cleanedStr, start, end);
    }

    static boolean stringPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return stringPalindrome(str, start + 1, end - 1);
    }
}
