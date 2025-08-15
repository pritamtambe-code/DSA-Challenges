package String;

public class Count_Character_In_String {
    public static void main(String[] args) {

        String name = "Pritam";
        int count = 0;
        for(int i = 0;i<name.length();i++){

            count++;
        }
        System.out.println("There are total "+count+ " character in "+name);
    }
}
