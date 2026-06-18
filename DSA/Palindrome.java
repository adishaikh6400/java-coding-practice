import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("\"" + s + "\" palindrome? " + isPalindrome(s));

    }

    public static boolean isPalindrome(String s){

        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

