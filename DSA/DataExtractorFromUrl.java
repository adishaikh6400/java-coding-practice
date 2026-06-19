import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DataExtractor{
    static void main(String[] args) {

        String url = "www.google.com?id=101&name=xyz";
        String url2 = "www.google.com ? id=102 & name=abc";
        String ext = " ";

        Pattern pattern = Pattern.compile("([a-zA-Z]+)=([^&]+)");
        Matcher matcher = pattern.matcher(url);
        Matcher matcher2 = pattern.matcher(url2);

        while(matcher.find()){
            System.out.println(matcher.group(0));
        }

        while(matcher2.find()){
            System.out.println(matcher2.group(0));
        }

    }
}