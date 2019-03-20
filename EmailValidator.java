public class EmailValidator {
    public static void main(String[] args) {
        String mail = "rfcrrf@.com";
        boolean a = mail.contains("@") && mail.contains(".");
        boolean b = mail.length() > 6 && mail.length() < 15;
        boolean d = mail.endsWith(".com");
        boolean c = a && b && d;
        if (c) {
            System.out.println("This email is valid");
        } else {
            System.out.println("this email is invalid");
        }

    }

}

