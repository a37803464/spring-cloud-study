package com.zsc.productservice1.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    /**
     * 内码
     */
    private String id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 价格，分为单位
     */
    private int price;
    /**
     * 库存
     */
    private int store;

    public Product(String id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }


}
