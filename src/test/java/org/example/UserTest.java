package org.example;

import org.example.exceptions.InvalidUserDataException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void shouldCheckLoginIsValid() throws InvalidUserDataException {
        String login = "JohnConnor";
        String email = "johnconnor@gmail.com";
        User actual = new User(login, email);
        assertEquals("JohnConnor", actual.getLogin());
    }

    @Test
    public void shouldCheckEmailIsValid() throws InvalidUserDataException {
        String login = "JohnConnor";
        String email = "johnconnor@gmail.com";
        User actual = new User(login, email);
        assertEquals("johnconnor@gmail.com", actual.getEmail());
    }

    @Test
    public void shouldCheckUserCreated() {
        User actual = new User();
        assertNull(actual.getLogin());
        assertNull(actual.getEmail());
    }

    @Test
    public void shouldCheckEmailIsCorrect() throws InvalidUserDataException {
        String login = "JohnConnor";
        String email1 = "johnconnor@gmail.com";
        User actual1 = new User(login, email1);
        String email2 = "johnconnorgmail.com";
        String email3 = "johnconnor@gmailcom";
        assertEquals(actual1.getEmail(), "johnconnor@gmail.com");
        assertThrows(InvalidUserDataException.class, () ->  new User(login, email2));
        assertThrows(InvalidUserDataException.class, () ->  new User(login, email3));
    }

    @Test
    public void shouldCheckWhatLoginAndEmailIsNotSame() {
        String login = "johnconnor@gmail.com";
        String email = "johnconnor@gmail.com";
        assertThrows(InvalidUserDataException.class, () ->  new User(login, email));
    }
}
