package com.dao;

import com.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by b_nop on 15.12.2016.
 */
public class MockUserDao {
    private Map<Long, User> users = new HashMap<Long, User>();
    private AtomicLong sequence = new AtomicLong(0);

    public MockUserDao() {
        saveUser(new User("Oleg", "Oleg Mir", "olegmirpost@gmail.com", new Date(), true));
        saveUser(new User("Oleg1", "Oleg Mir1", "olegmirpost1@gmail.com", new Date(), true));
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());
    }

    public User findUserById(Long id) {
        return users.get(id);
    }

    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(sequence.getAndIncrement());
        }
        users.put(user.getId(), user);
        return user;
    }
}
