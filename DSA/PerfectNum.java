// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PerfectNum {
    public static void main(String[] args) {
        int num = 10;
        int sum =0;

        for (int i=1; i<num; i++){
            if(num%i==0){
                sum= sum+i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        if(num!=sum){
            System.out.println("Not Perfect num");
        }else{
            System.out.println("Perfect num");
        }
    }
}
