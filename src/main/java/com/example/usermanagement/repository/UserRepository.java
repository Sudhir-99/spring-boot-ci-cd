
package com.example.usermanagement.repository;

import com.example.usermanagement.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public List<User> findAll() {
        System.out.println("findAll users called");
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(String id) {
        return Optional.ofNullable(users.get(id));
    }

    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public void deleteById(String id) {
        users.remove(id);
    }
}
