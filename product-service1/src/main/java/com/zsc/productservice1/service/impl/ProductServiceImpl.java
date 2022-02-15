package com.zsc.productservice1.service.impl;


import com.zsc.productservice1.entity.Product;
import com.zsc.productservice1.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName：ProductServiceImpl
 * @Description：ProductService实现类
 * @Author：chenyb
 * @Date：2020/11/1 8:47 下午
 * @Versiion：1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    //初始化内存商品数据。模拟数据库中存储的商品
    private static final Map<Integer, Product> daoMap = new HashMap<>();

    @Value("${server.port}")
    private String port;
    static {
        for (int i = 0; i < 5; i++) {
            daoMap.put(i, new Product(i + "", "iphone_" + i, 1000 * i, 10));
        }
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> values = daoMap.values();
        return new ArrayList<>(values);
    }

    @Override
    public Product findById(int id) {
        Product product = daoMap.get(id);
        product.setName(product.getName()+"_"+port);
        return product;
    }
}