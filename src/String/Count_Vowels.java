package String;

public class Count_Vowels {
    public static void main(String[] args) {

        String name = "pritam";
        int count = 0;
        for(int i = 0;i<name.length();i++){
            char character = name.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }
        System.out.println("There are total "+count+ " vowels in "+name);
    }
}
