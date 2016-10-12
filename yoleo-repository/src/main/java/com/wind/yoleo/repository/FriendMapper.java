package com.wind.yoleo.repository;

import com.wind.yoleo.common.model.Friend;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface FriendMapper extends Mapper<Friend> {
}