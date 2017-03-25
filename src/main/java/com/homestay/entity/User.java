package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/13.
 */
@Entity
@Table(name = "t_user",schema = "homestay")
public class User{
    private long user_id;
    private String account;
    private String password;
    private int status;

    public User() {
    }

    public User(String account, String password, int status) {
        this.account = account;
        this.password = password;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
