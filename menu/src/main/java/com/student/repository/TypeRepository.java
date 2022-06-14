package com.student.repository;

import com.student.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TypeRepository {
    public Type findById(long id);
    public List<Type> findAll();
}
