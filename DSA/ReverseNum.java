// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;



class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Demo d = new Demo();
        System.out.println(d.countNum(num));
        System.out.println(d.calSum(num));
        System.out.println(d.rev(num));
    }
}

class Demo{

    public int countNum(int num){
        int count = 0;
        int i = 0;
        while(i<num){
            num = num/10;
            count++;

        }
        return count;
    }


    public int calSum(int num){
        int sum = 0;
        int x = 0;
        int i = 0;
        while(i<num){
            x = num%10;
            sum = sum+x;
            num=num/10;
        }
        return sum;
    }

    public int rev(int num){
        int i=0;
        int rev = 0;
        while(i<num){
            int dig =num%10;
            rev = rev*10 + dig;
            System.out.println(rev);
            num = num/10;


        }
        return rev;
    }
}