import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TokenValidate{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of tokens: ");
        String token = sc.nextLine();

        Pattern p = Pattern.compile("^[A-Za-z]{3}-\\d{4}-[A-Za-z]{3}$");
        Matcher m = p.matcher(token);
        if(m.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}