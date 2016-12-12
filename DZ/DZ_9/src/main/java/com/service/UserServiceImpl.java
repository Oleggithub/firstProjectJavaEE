package com.service;

/**
 * Created by b_nop on 10.12.2016.
 */
import com.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("Nirowka777");

        return user;
    }

}