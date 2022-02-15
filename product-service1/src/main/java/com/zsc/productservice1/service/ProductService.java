package com.zsc.productservice1.service;

import com.zsc.productservice1.entity.Product;

import java.util.List;

/**
 * @ClassName：ProductService
 * @Description：商品service
 * @Author：chenyb
 * @Date：2020/11/1 8:45 下午
 * @Versiion：1.0
 */
public interface ProductService {
    /**
     * 商品列表
     * @return
     */
    List<Product> listProduct();

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Product findById(int id);
}