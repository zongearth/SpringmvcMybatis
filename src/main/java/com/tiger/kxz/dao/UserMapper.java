package com.tiger.kxz.dao;

import com.tiger.kxz.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}