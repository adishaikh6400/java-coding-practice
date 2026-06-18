class EmailValidate{
    static void main(String[] args) {

        String email = "adishaikh6400@gmail.com";
        boolean valid = true;

        if(email.contains("@") && email.contains(".com") && email.indexOf(0)!='@') {
            valid = false;
        }
        else {
            valid = true;
        }
        if(valid) {
            System.out.println("Valid Email");
        }else  {
            System.out.println("Invalid Email");
        }
    }
}