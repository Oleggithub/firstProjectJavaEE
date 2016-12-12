package com.dao;

/**
 * Created by b_nop on 12.12.2016.
 */

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("userDAO")
public class UserDAOImpl implements UserServiceDAO {
    private List<User> users = new ArrayList<User>(Arrays.asList(new User("xxx", 12), new User("yyy", 14)));

    public List<User> getAllAvailableUsers() {
        return users;
    }
}
