package com.gmail.qwertygoog.Project.furniture.dao;

import com.gmail.qwertygoog.Project.furniture.service.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface OrderRepository extends CrudRepository<Order,Integer> {
}
