package com.lcb.springcloud.learning.po;

import java.util.Date;

public class Order {
    private Integer id;
    private String orderName;
    private String orderCode;
    private Date orderTime;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Order(Integer id, String orderName, String orderCode, Date orderTime, Date createTime, String createUser, Date updateTime, String updateUser) {
        this.id = id;
        this.orderName = orderName;
        this.orderCode = orderCode;
        this.orderTime = orderTime;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("id=").append(id);
        sb.append(", orderName='").append(orderName).append('\'');
        sb.append(", orderCode='").append(orderCode).append('\'');
        sb.append(", orderTime=").append(orderTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser='").append(updateUser).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
