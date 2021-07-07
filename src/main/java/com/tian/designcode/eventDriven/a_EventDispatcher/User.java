package com.tian.designcode.eventDriven.a_EventDispatcher;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 20:16
 */
/**
 * This {@link User} class is a basic pojo used to demonstrate user data sent along with
 * the {@link UserCreatedEvent} and {@link UserUpdatedEvent} events.
 */
public class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
