package com.wind.yoleo.repository;

import com.wind.yoleo.common.model.Post;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface PostMapper extends Mapper<Post> {
}