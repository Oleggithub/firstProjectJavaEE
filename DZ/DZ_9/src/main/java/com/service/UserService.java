package com.service;

import com.entity.User;

/**
 * Created by b_nop on 10.12.2016.
 */
public interface UserService {
    User getUser(String login);
}
