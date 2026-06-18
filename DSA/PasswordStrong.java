class PasswordStrong{
    static void main(String[] args) {


        String pass = "ad2isjDjddn";

        boolean hasNum = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

//        for(int i=0;i<pass.length()-1;i++) {
//            char ch = pass.charAt(i);

        for(char ch: pass.toCharArray()){
            if(Character.isDigit(ch))
                hasNum = true;

            if(Character.isUpperCase(ch))
                hasUpper = true;

            if(Character.isLowerCase(ch))
                hasLower = true;

            if(!Character.isLetterOrDigit(ch))
                hasSpecial = true;

        }

        if(pass.length()>=8 && hasNum && hasUpper && hasLower && hasSpecial) {
            System.out.println("Your password is Strong");
        }else if (hasNum && hasUpper && hasLower) {

            System.out.println("Your password is Medium");
        }else{
            System.out.println("Your password is Weak");
        }

    }
}
