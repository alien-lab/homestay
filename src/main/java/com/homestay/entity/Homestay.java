package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_homestay",schema = "homestay")
public class Homestay {
    private long homestay_id;
    private long user_id;
    private String homestay_name;
    private String address;
    private String thumbnail;
    private String introduction;

    public Homestay() {
    }

    public Homestay(long user_id, String homestay_name, String address, String thumbnail, String introduction) {
        this.user_id = user_id;
        this.homestay_name = homestay_name;
        this.address = address;
        this.thumbnail = thumbnail;
        this.introduction = introduction;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "homestay_id")
    public long getHomestay_id() {
        return homestay_id;
    }

    public void setHomestay_id(long homestay_id) {
        this.homestay_id = homestay_id;
    }
    @Basic
    @Column(name = "user_id")
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
    @Basic
    @Column(name = "homestay_name")
    public String getHomestay_name() {
        return homestay_name;
    }

    public void setHomestay_name(String homestay_name) {
        this.homestay_name = homestay_name;
    }
    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Basic
    @Column(name = "thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Homestay{" +
                "homestay_id=" + homestay_id +
                ", user_id=" + user_id +
                ", homestay_name='" + homestay_name + '\'' +
                ", address='" + address + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
