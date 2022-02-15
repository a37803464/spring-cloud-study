package com.zsc.productservice1.controller;


import com.zsc.productservice1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName：ProductController
 * @Description：商品
 * @Author：chenyb
 * @Date：2020/11/1 8:42 下午
 * @Versiion：1.0
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 商品列表
     *
     * @return
     */
    @PostMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    /**
     * 根据id查询商品
     *
     * @param id
     * @return
     */
    @GetMapping("findById")
    public Object findById(@RequestParam("id") int id) {
        return productService.findById(id);
    }
}