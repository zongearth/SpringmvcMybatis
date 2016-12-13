package com.tiger.kxz.controller;

import com.tiger.kxz.dao.OrdersMapper;
import com.tiger.kxz.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/12/13.
 */
@Controller
@RequestMapping("/testController")
public class TestController {

    @Autowired
    private OrdersMapper ordersMapper;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(){
        String id = "I0000025";
        Orders orders = ordersMapper.selectByPrimarykey(id);
        System.out.println(orders.getORDER_NO() + orders.getGEN_INSTTU_CODE());
        return "index";
    }

}
