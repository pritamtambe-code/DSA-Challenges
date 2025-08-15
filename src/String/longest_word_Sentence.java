package String;


public class longest_word_Sentence {
    public static void main(String[] args) {
            String sentence = "Java Developer Is Love and Springboot is turu love ";
            String[] words = sentence.split(" ");
            String longest = "";

            for (String  word : words) {
                if(word.length()>longest.length()){
                    longest = word;
                }

            }
            System.out.println(longest);
        }
    }

