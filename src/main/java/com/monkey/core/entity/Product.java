package com.monkey.core.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohejing
 * @since 2018-07-26
 */
@TableName("sale_product")
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    /**
     * key
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品名
     */
    private String productName;
    /**
     * 商品编号
     */
    private String productNum;
    /**
     * 商品类型
     */
    private String productType;
    /**
     * 默认价格
     */
    private BigDecimal price;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Product{" +
        "id=" + id +
        ", productName=" + productName +
        ", productNum=" + productNum +
        ", productType=" + productType +
        ", price=" + price +
        ", creationTime=" + creationTime +
        ", creatorUserId=" + creatorUserId +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
