import java.util.Scanner;

class ReverseString2{
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reverseString(s));

    }

    public static String reverseString(String s){

        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;

    }
}