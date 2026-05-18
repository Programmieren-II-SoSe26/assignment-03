package FunctionalErrorHandling_2;

import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = List.of(
            new User("max@stud.uni-regensburg.de", "1234", false),
            new User("lara@stud.uni-regensburg.de", "abcd", true),
            new User("tom@stud.uni-regenbsurg.de", "pass", false)
    );
}