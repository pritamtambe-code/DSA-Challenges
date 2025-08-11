package String;

public class Check_palindrome {
    public static void main(String[] args) {
        String name1 = "abcBa";
        String name = name1.toLowerCase();
        String Reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            Reverse = Reverse + name.charAt(i);
        }

        if (name.equals(Reverse)) {
            System.out.println("String is Planindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
