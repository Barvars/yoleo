package com.wind.yoleo.common.model;

import javax.persistence.*;

@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 帖子id
     */
    @Column(name = "post_id")
    private Long postId;

    /**
     * 费用
     */
    private Integer cost;

    @Column(name = "create_time")
    private Integer createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取帖子id
     *
     * @return post_id - 帖子id
     */
    public Long getPostId() {
        return postId;
    }

    /**
     * 设置帖子id
     *
     * @param postId 帖子id
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     * 获取费用
     *
     * @return cost - 费用
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * 设置费用
     *
     * @param cost 费用
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}