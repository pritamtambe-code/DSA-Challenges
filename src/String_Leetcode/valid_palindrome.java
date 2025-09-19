package String_Leetcode;

public class valid_palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";


        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z]", "");

        int i = 0;
        int j = s1.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}
