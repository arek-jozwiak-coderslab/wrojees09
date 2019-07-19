package pl.coderslab.warjees09.auth;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}
