package pl.coderslab.tdd.a_Dzien_1.c_TDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {
    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        userRepository = new UserRepository();
    }

    @Test
    public void givenUserData_whenCreateUser_thenShouldBeAdded() {
        //given
        User user = new User(1, "arek", "jozwiak");
        //when
        userRepository.createNewUser(user);
        //then
        assertEquals(1, userRepository.getSize());

    }

    @Test
    public void givenUser_whenEditUser_thenShouldBeChanged() {
        //given
        User user = new User(1, "arek", "jozwiak");
        User userChanged = new User(1, "marek", "kowalski");
        //when
        userRepository.editUser(1, userChanged);
        //then
        assertNotEquals(user, userRepository.getUser(1));

    }

    @Test
    public void givenUserId_whenDeleteUser_thenShouldBeDeleted() {
        //given
        userRepository.createNewUser(new User(1,"a", "b"));
        int id = 1;
        //when
        userRepository.deleteUser(1);
        //then
        assertNull(userRepository.getUser(1));

    }

}