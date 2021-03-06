package com.zwq.pojo;



import com.zwq.commons.util.DateFormatUtil;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * created by zwq on 2018/5/6
 */
public class Order implements Serializable {

    private Integer id;
    private User user;
    private Instant creatTime;
    private String code;
    private Integer sum;
    private List<OrderItem> orderItems;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Instant getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Instant creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreatTimeStr() {
        return DateFormatUtil.dateFormat(creatTime);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", user:" + user +
                ", creatTime:" + creatTime +
                ", code:" + code +
                ", sum:" + sum +
                ", orderItems:" + orderItems +
                '}';
    }
}
