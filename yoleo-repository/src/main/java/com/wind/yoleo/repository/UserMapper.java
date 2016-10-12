package com.wind.yoleo.repository;

import org.springframework.stereotype.Repository;

import com.wind.yoleo.common.model.User;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}