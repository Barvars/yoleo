package com.wind.yoleo.common.model;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 性别：0男、1女
     */
    private Boolean sex;

    /**
     * 电话
     */
    private String phone;

    /**
     * 位置
     */
    private String location;

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
     * 获取昵称
     *
     * @return nick - 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置昵称
     *
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取性别：0男、1女
     *
     * @return sex - 性别：0男、1女
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别：0男、1女
     *
     * @param sex 性别：0男、1女
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取位置
     *
     * @return location - 位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置位置
     *
     * @param location 位置
     */
    public void setLocation(String location) {
        this.location = location;
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