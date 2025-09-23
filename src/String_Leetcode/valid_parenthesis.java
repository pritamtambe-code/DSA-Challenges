package String_Leetcode;
import java.util.Stack;


public class valid_parenthesis {
    public static void main(String[] args) {
        String s = "{[()]}";

        Stack<Character>c = new Stack<>();

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                c.push(s.charAt(i));
            }else {
                char top = c.pop();
                if(s.charAt(i)==')'&& top!='('||
                        s.charAt(i)=='}'&& top!='{'||
                        s.charAt(i)==']'&& top!='['){
                    System.out.println("not valid");

                }


            }
        }
    }
}
