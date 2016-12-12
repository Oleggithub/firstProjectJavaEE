package com.dao;

/**
 * Created by b_nop on 12.12.2016.
 */

import com.model.User;

import java.util.List;

public interface UserServiceDAO {
    List<User> getAllAvailableUsers();
}
