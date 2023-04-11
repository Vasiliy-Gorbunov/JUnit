package org.example;

import org.example.exceptions.InvalidUserDataException;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) throws InvalidUserDataException {
        if (email.contains("@") && email.contains(".") && !login.equals(email)) {
            this.login = login;
            this.email = email;
        } else {
            throw new InvalidUserDataException("Введены некорректные данные!");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
