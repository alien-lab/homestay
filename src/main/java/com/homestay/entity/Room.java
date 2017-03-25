package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/13.
 */
@Entity
@Table(name = "t_room",schema = "homestay")
public class Room {
    private long room_id;
    private long homestay_id;
    private String room_name;
    private int room_status;
    private String thumbnail;
    private String introduction;

    public Room() {
    }

    public Room(long homestay_id, String room_name, int room_status, String thumbnail, String introduction) {
        this.homestay_id = homestay_id;
        this.room_name = room_name;
        this.room_status = room_status;
        this.thumbnail = thumbnail;
        this.introduction = introduction;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "room_id")
    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
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
    @Column(name = "room_name")
    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    @Basic
    @Column(name = "room_status")
    public int getRoom_status() {
        return room_status;
    }

    public void setRoom_status(int room_status) {
        this.room_status = room_status;
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


}
