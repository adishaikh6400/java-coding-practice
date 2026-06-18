import java.util.Arrays;

class LongestWord{
    static void main(String[] args) {
        String str = "While reviewing the system logs, the administrator discovered that " +
                "the access token ABC-1234-XYZ had" +
                " expired and needed to be regenerated before the deployment could continue";

        String words[] = str.split(" ");
        String word1 = "";

        for(String word:words){
            if(word.length()>word1.length()){
                word1 = word;
            }
        }

        System.out.println(word1);
        System.out.println(word1.length());

    }
}