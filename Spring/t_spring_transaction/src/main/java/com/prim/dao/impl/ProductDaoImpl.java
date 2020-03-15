package com.prim.dao.impl;

import com.prim.dao.ProductDao;
import com.prim.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    public void insert(Product order) {

    }

    public void update(Product order) {

    }

    public void delete(String id) {

    }

    public Product findOne(String id) {
        return null;
    }

    public List<Product> findAll() {
        return null;
    }
}
