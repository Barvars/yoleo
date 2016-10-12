package com.wind.yoleo.repository;

import com.wind.yoleo.common.model.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderMapper extends Mapper<Order> {
}