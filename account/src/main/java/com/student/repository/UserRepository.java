package com.student.repository;

import com.student.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public User login(String username,String password);
}
