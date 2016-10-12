package com.wind.yoleo.common.model;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {
    @Id
//    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String nick;

    private Boolean sex;

    private String phone;

    private String location;

    private Integer createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}