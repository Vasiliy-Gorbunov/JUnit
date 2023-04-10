package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void shouldCheckLoginEmailNotNull() {
        String login = "JohnConnor";
        String email = "johnconnor@gmail.com";
        User expected = new User(login, email);
        assertNotNull(expected.getEmail(), expected.getLogin());
    }

    @Test
    public void shouldCheckUserCreated() {
        User expected = new User();
        assertNotNull(expected);
    }

    @Test
    public void shouldCheckEmailIsCorrect() {
        String login1 = "JohnConnor";
        String email1 = "johnconnor@gmail.com";
        User expected1 = new User(login1, email1);
        String login2 = "JohnConnor";
        String email2 = "johnconnorgmail.com";
        User expected2 = new User(login2, email2);
        String login3 = "JohnConnor";
        String email3 = "johnconnor@gmailcom";
        User expected3 = new User(login3, email3);
        assertEquals(expected1.getEmail(), "johnconnor@gmail.com");
        assertNull(expected2.getEmail());
        assertNull(expected3.getEmail());
    }

    @Test
    public void shouldCheckWhatLoginAndEmailIsNotSame() {
        String login = "johnconnor@gmail.com";
        String email = "johnconnor@gmail.com";
        User expected = new User(login, email);
        assertNull(expected.getLogin(), expected.getEmail());
    }
}
