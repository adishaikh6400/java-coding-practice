import java.util.Arrays;

class CountFrequency{
    static void main(String[] args) {

        String input = "aaaabbbccdaaaaz";
        String ans = " ";
        int count = 1;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                count++;
            }else {
               sb.append(input.charAt(i)+ " " +count);

                count = 1;
            }
        }
        System.out.println(sb.append(input.charAt(input.length() - 1)).append(count));

    }
}