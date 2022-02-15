package com.zsc.orderservice.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 商品订单实体类
 */
@Getter
@Setter
@ToString
public class ProductOrder {
    /**
     * 主键
     */
    private int id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 订单流水号
     */
    private String tradeNo;
    /**
     * 价格，以分位单位
     */
    private int price;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;

}