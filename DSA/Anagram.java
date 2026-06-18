import java.util.Arrays;

class Anagram{
    static void main(String[] args) {

        String word1 = "jaz";
        String word2 = "zaj";

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1,char2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}