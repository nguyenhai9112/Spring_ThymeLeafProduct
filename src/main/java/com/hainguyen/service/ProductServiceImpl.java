package com.hainguyen.service;

import com.hainguyen.model.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Products> products;

    static {
        products = new HashMap<>();
        products.put(1, new Products(1, "Adidas Ultra Boost 1 ", "Day la nhung doi giay rat dep",
                500000, 100, "Giay cao got"));
        products.put(2, new Products(2, "Adidas Ultra Boost 2", "Day la nhung doi giay rat dep",
                600000, 90, "Giay boot"));
        products.put(3, new Products(3, "Adidas Ultra Boost 3", "Day la nhung doi giay rat dep",
                700000, 80, "Giay the thao"));
        products.put(4, new Products(4, "Adidas Ultra Boost 4", "Day la nhung doi giay rat dep",
                800000, 70, "Giay vai"));
        products.put(5, new Products(5, "Adidas Ultra Boost 5", "Day la nhung doi giay rat dep",
                900000, 60, "Giay da"));
    }

    @Override
    public List<Products> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Products product) {
        products.put(product.getId(), product);
    }

    @Override
    public Products findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Products product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
