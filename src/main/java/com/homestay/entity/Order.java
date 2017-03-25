package com.homestay.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_order",schema = "homestay")
public class Order {
    private long order_id;
    private long homestay_id;
    private String account;
    private String username;
    private String phone;
    private Date check_in_time;
    private Date check_out_time;
    private int order_status;
    private int room_price;
    private int total_price;
    private Timestamp order_time;

    public Order() {
    }

    public Order(long homestay_id, String account, String username, String phone, Date check_in_time, Date check_out_time, int order_status, int room_price, int total_price, Timestamp order_time) {
        this.homestay_id = homestay_id;
        this.account = account;
        this.username = username;
        this.phone = phone;
        this.check_in_time = check_in_time;
        this.check_out_time = check_out_time;
        this.order_status = order_status;
        this.room_price = room_price;
        this.total_price = total_price;
        this.order_time = order_time;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "order_id")
    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }
    @Basic
    @Column(name = "homestay_id")
    public long getHomestay_id() {
        return homestay_id;
    }

    public void setHomestay_id(long homestay_id) {
        this.homestay_id = homestay_id;
    }
    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Basic
    @Column(name = "check_in_time")
    public Date getCheck_in_time() {
        return check_in_time;
    }

    public void setCheck_in_time(Date check_in_time) {
        this.check_in_time = check_in_time;
    }
    @Basic
    @Column(name = "check_out_time")
    public Date getCheck_out_time() {
        return check_out_time;
    }

    public void setCheck_out_time(Date check_out_time) {
        this.check_out_time = check_out_time;
    }
    @Basic
    @Column(name = "order_status")
    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }
    @Basic
    @Column(name = "room_price")
    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }
    @Basic
    @Column(name = "total_price")
    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
    @Basic
    @Column(name = "order_time")
    public Timestamp getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Timestamp order_time) {
        this.order_time = order_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", homestay_id=" + homestay_id +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", check_in_time=" + check_in_time +
                ", check_out_time=" + check_out_time +
                ", order_status=" + order_status +
                ", room_price=" + room_price +
                ", total_price=" + total_price +
                ", order_time=" + order_time +
                '}';
    }
}
