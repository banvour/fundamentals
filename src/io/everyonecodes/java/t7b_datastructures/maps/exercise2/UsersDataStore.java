package io.everyonecodes.java.t7b_datastructures.maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UsersDataStore {

    private Map<String, User> users;

    public UsersDataStore() {
        this.users = new HashMap<>();
        users.put("username", new User("username", "password"));
    }

    public Optional<User> getUserByUsername(String username) {
        return Optional.ofNullable(users.get(username));
    }
}
