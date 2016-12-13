package com.tiger.kxz.dao;

import com.tiger.kxz.entity.Orders;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/13.
 */
@Repository
public interface OrdersMapper {

    Orders selectByPrimarykey(String id);
}

