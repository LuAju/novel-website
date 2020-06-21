package com.search.dao;

import com.search.entity.User;

public interface UserMapper {
    User findOneByLogin(String username);
}
