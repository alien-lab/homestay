package com.homestay.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 慧慧姐 on 2017/3/13.
 */
@Entity
@Table(name = "t_userinfo",schema = "homestay")
public class UserInfo {
    private long id;
    private String account;
    private String nickname;
    private String head;
    private int sex;
    private long credit;
    private String mail;
    private String phone;
    private Date regist_time;
    private Date birthday;

    public UserInfo() {
    }

    public UserInfo(String account, String nickname, String head, int sex, long credit, String mail, String phone, Date regist_time, Date birthday) {
        this.account = account;
        this.nickname = nickname;
        this.head = head;
        this.sex = sex;
        this.credit = credit;
        this.mail = mail;
        this.phone = phone;
        this.regist_time = regist_time;
        this.birthday = birthday;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Basic
    @Column(name = "head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
    @Basic
    @Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    @Basic
    @Column(name = "credit")
    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }
    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
    @Column(name = "regist_time")
    public Date getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(Date regist_time) {
        this.regist_time = regist_time;
    }
    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", sex=" + sex +
                ", credit=" + credit +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", regist_time=" + regist_time +
                ", birthday=" + birthday +
                '}';
    }

}
