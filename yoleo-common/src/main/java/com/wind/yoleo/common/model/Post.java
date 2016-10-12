package com.wind.yoleo.common.model;

import javax.persistence.*;

@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 发帖人
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 描述
     */
    private String description;

    /**
     * 付费内容
     */
    @Column(name = "private_detail")
    private String privateDetail;

    /**
     * 单价。单位为分
     */
    private Integer price;

    /**
     * 总价值
     */
    private Long value;

    /**
     * 贬数量
     */
    private Integer attack;

    /**
     * 赞数量
     */
    private Integer support;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发帖人
     *
     * @return user_id - 发帖人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置发帖人
     *
     * @param userId 发帖人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取付费内容
     *
     * @return private_detail - 付费内容
     */
    public String getPrivateDetail() {
        return privateDetail;
    }

    /**
     * 设置付费内容
     *
     * @param privateDetail 付费内容
     */
    public void setPrivateDetail(String privateDetail) {
        this.privateDetail = privateDetail;
    }

    /**
     * 获取单价。单位为分
     *
     * @return price - 单价。单位为分
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置单价。单位为分
     *
     * @param price 单价。单位为分
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取总价值
     *
     * @return value - 总价值
     */
    public Long getValue() {
        return value;
    }

    /**
     * 设置总价值
     *
     * @param value 总价值
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * 获取贬数量
     *
     * @return attack - 贬数量
     */
    public Integer getAttack() {
        return attack;
    }

    /**
     * 设置贬数量
     *
     * @param attack 贬数量
     */
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    /**
     * 获取赞数量
     *
     * @return support - 赞数量
     */
    public Integer getSupport() {
        return support;
    }

    /**
     * 设置赞数量
     *
     * @param support 赞数量
     */
    public void setSupport(Integer support) {
        this.support = support;
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