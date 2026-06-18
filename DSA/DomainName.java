import java.util.Scanner;

class DomainName
{
    public static void main(String[] args)
    {
        String domain = "adishaikh@masstech.in";
        String email = "";

        email = email+domain.substring(domain.indexOf("@"));
        System.out.println(email);

    }
}