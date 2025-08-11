package String;

public class Reverse_string {
    public static void main(String[] args) {

        String name = "Pritam";
        String Reverse ="";
        for(int i = name.length()-1;i>=0;i--){

            Reverse = Reverse + name.charAt(i);
        }
        System.out.println(Reverse);
    }
}
