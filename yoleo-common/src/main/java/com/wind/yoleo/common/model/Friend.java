package com.wind.yoleo.common.model;

import javax.persistence.*;

@Table(name = "friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 好友uid
     */
    @Column(name = "friend_id")
    private Long friendId;

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
     * 获取好友uid
     *
     * @return friend_id - 好友uid
     */
    public Long getFriendId() {
        return friendId;
    }

    /**
     * 设置好友uid
     *
     * @param friendId 好友uid
     */
    public void setFriendId(Long friendId) {
        this.friendId = friendId;
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