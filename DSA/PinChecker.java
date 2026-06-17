import java.util.Scanner;

class PinChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int input;
        int attempts = 0;

        do {
            System.out.println("Enter your PIN:");
            input = sc.nextInt();
            attempts++;

            if (input == pin) {
                System.out.println("Successful");
                break;
            } else {
                if (attempts < 4) {
                    System.out.println("Try Again");
                }
            }

        } while (attempts < 4);

        if (attempts == 4 && input != pin) {
            System.out.println("Account Locked");
        }
    }
}