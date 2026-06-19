class FindLatestVersion {
    public static void main(String[] args) {

        String str1 = "12.1.10";
        String str2 = "12.1.12";

        String[] a = str1.split("\\.");
        String[] b = str2.split("\\.");

        int max = Math.max(a.length, b.length);

        for (int i = 0; i < max; i++) {

            int num1 = (i < a.length) ? Integer.parseInt(a[i]) : 0;
            int num2 = (i < b.length) ? Integer.parseInt(b[i]) : 0;

            if (num1 > num2) {
                System.out.println("Latest Version: " + str1);
                return;
            }

            if (num2 > num1) {
                System.out.println("Latest Version: " + str2);
                return;
            }
        }

        System.out.println("Both versions are same");
    }
}