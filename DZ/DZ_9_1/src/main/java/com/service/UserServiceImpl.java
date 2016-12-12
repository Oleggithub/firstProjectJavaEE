package com.service;

/**
 * Created by b_nop on 12.12.2016.
 */

import com.dao.UserServiceDAO;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceDAO userDAO;

    public List<User> getAllAvailableUsers() {
        return userDAO. getAllAvailableUsers();
    }

    public UserServiceDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserServiceDAO userDAO) {
        this.userDAO = userDAO;
    }
}
