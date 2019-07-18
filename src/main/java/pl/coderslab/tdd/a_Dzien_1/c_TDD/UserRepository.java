package pl.coderslab.tdd.a_Dzien_1.c_TDD;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, User> users = new HashMap<>();

    public void createNewUser(User user) {
        users.put(user.getId(), user);
    }

    public int getSize() {
        return this.users.size();
    }

    public void editUser(int i, User userChanged) {
        this.users.put(i, userChanged);
    }

    public User getUser(int i) {
        return this.users.get(i);
    }

    public void deleteUser(int i) {
        this.users.remove(i);
    }
}
