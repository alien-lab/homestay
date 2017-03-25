package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_homestayimage",schema = "homestay")
public class HomestayImage {
    private long homestayimage_id;
    private long homestay_id;
    private String homestay_image;

    public HomestayImage() {
    }

    public HomestayImage(long homestay_id, String homestay_image) {
        this.homestay_id = homestay_id;
        this.homestay_image = homestay_image;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "homestayimage_id")
    public long getHomestayimage_id() {
        return homestayimage_id;
    }

    public void setHomestayimage_id(long homestayimage_id) {
        this.homestayimage_id = homestayimage_id;
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
    @Column(name = "homestay_image")
    public String getHomestay_image() {
        return homestay_image;
    }

    public void setHomestay_image(String homestay_image) {
        this.homestay_image = homestay_image;
    }

    @Override
    public String toString() {
        return "HomestayImage{" +
                "homestayimage_id=" + homestayimage_id +
                ", homestay_id=" + homestay_id +
                ", homestay_image='" + homestay_image + '\'' +
                '}';
    }
}
