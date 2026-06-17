// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class IncrementCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);


        System.out.println("Enter years of experience: ");
        int exp = sc.nextInt();

        System.out.println("Enter your income: ");
        int inc = sc.nextInt();

        if(exp>5){
            int incAm = (inc*15)/100;
            inc = inc+incAm;
            System.out.println(inc);
        }else{
            int incAm = (inc*10)/100;
            inc = inc+incAm;
            System.out.println(inc);
        }
    }
}