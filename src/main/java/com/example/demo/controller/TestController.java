package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 测试接口
 * </p>
 *
 * @author : longxinglin
 * @version : V1.0
 * @since : 2022/1/7 13:39
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public Object testApi(){
        Map stringHashMap = new HashMap<String,Object>(5);
        stringHashMap.put("code",200);
        stringHashMap.put("msg","成功");
        stringHashMap.put("data","恭喜，测试成功！");
        return stringHashMap;
    }
}
