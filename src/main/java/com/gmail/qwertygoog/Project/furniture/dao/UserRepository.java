package com.gmail.qwertygoog.Project.furniture.dao;

import com.gmail.qwertygoog.Project.furniture.service.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    public User findByNameIgnoreCase(String name);

}
