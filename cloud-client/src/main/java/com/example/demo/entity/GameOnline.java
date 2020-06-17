package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "game_online")
public class GameOnline {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 游戏id
     */
    @Column(name = "game_id")
    private String gameId;

    /**
     * 游戏次数
     */
    private Integer count;

    /**
     * 创建时间yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间yyyyMMdd
     */
    @Column(name = "update_date")
    private String updateDate;

    /**
     * 更新时间yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取游戏id
     *
     * @return game_id - 游戏id
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * 设置游戏id
     *
     * @param gameId 游戏id
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    /**
     * 获取游戏次数
     *
     * @return count - 游戏次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置游戏次数
     *
     * @param count 游戏次数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取创建时间yyyy-MM-dd HH:mm:ss
     *
     * @return create_time - 创建时间yyyy-MM-dd HH:mm:ss
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间yyyy-MM-dd HH:mm:ss
     *
     * @param createTime 创建时间yyyy-MM-dd HH:mm:ss
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间yyyyMMdd
     *
     * @return update_date - 更新时间yyyyMMdd
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间yyyyMMdd
     *
     * @param updateDate 更新时间yyyyMMdd
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新时间yyyy-MM-dd HH:mm:ss
     *
     * @return update_time - 更新时间yyyy-MM-dd HH:mm:ss
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间yyyy-MM-dd HH:mm:ss
     *
     * @param updateTime 更新时间yyyy-MM-dd HH:mm:ss
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}