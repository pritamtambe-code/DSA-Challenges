package String;

public class Check_Palindrome_StringBuilder {
    public static void main(String[] args) {

        String name1=  "abcBaa";
        String name  = name1.toLowerCase();
        String Reverse = new StringBuilder(name).reverse().toString();

        if(name.equals(Reverse)){
            System.out.println("String is Planindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
