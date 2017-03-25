package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/13.
 */
@Entity
@Table(name = "t_roomimage",schema = "homestay")
public class RoomImage {
    private long roomimage_id;
    private long room_id;
    private String room_image;

    public RoomImage() {
    }

    public RoomImage(long room_id, String room_image) {
        this.room_id = room_id;
        this.room_image = room_image;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "roomimage_id")
    public long getRoomimage_id() {
        return roomimage_id;
    }

    public void setRoomimage_id(long roomimage_id) {
        this.roomimage_id = roomimage_id;
    }

    @Basic
    @Column(name = "room_id")
    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public String getRoom_image() {
        return room_image;
    }
    @Basic
    @Column(name = "room_image")
    public void setRoom_image(String room_image) {
        this.room_image = room_image;
    }

    @Override
    public String toString() {
        return "RoomImage{" +
                "roomimage_id=" + roomimage_id +
                ", room_id=" + room_id +
                ", room_image='" + room_image + '\'' +
                '}';
    }
}
