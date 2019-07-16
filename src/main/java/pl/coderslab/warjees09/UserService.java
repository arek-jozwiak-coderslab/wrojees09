package pl.coderslab.warjees09;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}
