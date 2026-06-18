import java.util.Scanner;

class DigitMasking{
    public static void main(String args[]){
        String cardNumber = "12345678987654321";

        String mask = " ";
        String maskChar = "*";

        mask = mask+maskChar.repeat(cardNumber.length())+cardNumber.substring(cardNumber.length() - 4);
        System.out.println(mask);
    }
}