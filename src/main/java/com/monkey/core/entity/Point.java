package com.monkey.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohejing
 * @since 2018-07-26
 */
@TableName("sale_point")
public class Point extends Model<Point> {

    private static final long serialVersionUID = 1L;

    /**
     * key
     */
    private Integer id;
    /**
     * 点位名
     */
    private String pointName;
    /**
     * 地址
     */
    private String address;
    /**
     * i奥数
     */
    private String description;
    /**
     * 创建时间
     */
    private Date creationTime;
    /**
     * 创建人id
     */
    private Integer creatorUserId;
    /**
     * 软删除  
     */
    private Integer isDeleted;
    /**
     * x坐标
     */
    private String x;
    /**
     * y坐标
     */
    private String y;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Point{" +
        "id=" + id +
        ", pointName=" + pointName +
        ", address=" + address +
        ", description=" + description +
        ", creationTime=" + creationTime +
        ", creatorUserId=" + creatorUserId +
        ", isDeleted=" + isDeleted +
        ", x=" + x +
        ", y=" + y +
        "}";
    }
}
