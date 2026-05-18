package FunctionalErrorHandling_2;

public class Main {

    public static void main(String[] args) {

        AuthService auth = new AuthService();

        test(auth, "max@stud.uni-regensburg.de", "1234");
        test(auth, "max@stud.uni-regensburg.de", "wrong");
        test(auth, "unknown@stud.uni-regensburg.de", "1234");
        test(auth, "lara@stud.uni-regensburg.de", "abcd");
    }

    private static void test(AuthService auth, String email, String password) {

    }
}