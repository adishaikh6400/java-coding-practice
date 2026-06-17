// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class TrailingZero {
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,0,7,0,4,7,0};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i;j--){
                if(arr[i]==0 && arr[j]!=0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}