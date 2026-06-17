// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int l = sc.nextInt();

        for(int i=u; i<l; i++){
            boolean isprime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i+" is prime number");
            }
        }
    }
}