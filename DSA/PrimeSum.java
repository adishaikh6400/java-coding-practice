// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class PrimeSum {
    public static void main(String[] args) {
        int arr[] = {11,13,15,22,50,19};
        int n= arr.length;
        int sum = 0;

        ArrayList<Integer> primes = new ArrayList<>();

        for(int num : arr){
            if(isPrime(num)){
                primes.add(num);
            }
        }

        System.out.println(primes);
        System.out.println(Sum(primes));


    }


    public static boolean isPrime(int num){
        int arr[] = {11,13,15,22,50,19};
        int n= arr.length;

        for(int i=2; i<n; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }

    public static int Sum(ArrayList<Integer> primes){
        int sum = 0;

        for(int x: primes){
            sum = sum+x;
        }
        return sum;
    }
}
