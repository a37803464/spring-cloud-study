package com.zsc.orderservice.service.impl;

import com.zsc.orderservice.entity.ProductOrder;
import com.zsc.orderservice.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName：ProductOrderServiceImpl
 * @Description：产品订单实现类
 * @Author：chenyb
 * @Date：2020/11/2 11:34 下午
 * @Versiion：1.0
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 下单接口
     * @param userId 用户id
     * @param productId 产品id
     * @return
     */
    @Override
    public ProductOrder save(int userId, int productId) {
        Object obj=productId;
        //get方式
        Object forObject = restTemplate.getForObject("http://product-service/api/v1/product/findById?id=" + productId, Object.class);
        //post方式
//        Map<String,String> map=new HashMap<>();
//        map.put("id","1");
//        String s = restTemplate.postForObject("http://product-service/api/v1/product/test", map, String.class);
//        System.out.println(s);
        System.out.println(forObject);
        //获取商品详情
        ProductOrder productOrder=new ProductOrder();
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId+"");
        return productOrder;
    }
}