class UrlConverter{
    static void main(String[] args) {
        String name = "Hometown Village Foods";
        String url = " ";
        url = url +name.replace(" ", "/");
        System.out.println(url);
    }
}