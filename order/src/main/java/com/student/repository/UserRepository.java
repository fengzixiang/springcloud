package com.student.repository;

import com.student.entity.User;

import java.util.List;

public interface UserRepository {
    public User findById(long id);

}
