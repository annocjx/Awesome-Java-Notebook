package com.prim.dao.impl;

import com.prim.dao.OrderDao;
import com.prim.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Order order) {
        jdbcTemplate.update("insert into `order` values(?,?,?,?,?,?,?,?,?,?,?)",
                order.getId(), order.getPid(), order.getNumber(), order.getPrice(), order.getCreateTime()
                , order.getSendTime(), order.getConfirmTime(), order.getConsignee(),
                order.getPhone(), order.getAddress(), order.getStatus());
    }

    public void update(Order order) {
//        jdbcTemplate.update("update `order` set ")
    }

    public void delete(String id) {

    }

    public Order findOne(String id) {
        return null;
    }

    public List<Order> findAll() {
        return null;
    }
}
