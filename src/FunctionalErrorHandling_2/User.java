package FunctionalErrorHandling_2;

public class User {

    String email;
    String password;
    boolean locked;

    public User(String email, String password, boolean locked) {
        this.email = email;
        this.password = password;
        this.locked = locked;
    }
}