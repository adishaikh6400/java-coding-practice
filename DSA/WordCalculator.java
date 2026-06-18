class WordCalculator{
    static void main(String[] args) {

        String comment = "You are Awesome";
        int count = 0;

        String arr[] = comment.split(" ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            count++;
        }
        System.out.println(count);
    }
}