package com.homestay.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_comment",schema = "homestay")
public class Comment {
    private long comment_id;
    private long homestay_id;
    private String account;
    private String content;
    private Timestamp comment_time;

    public Comment() {
    }

    public Comment(long homestay_id, String account, String content, Timestamp comment_time) {
        this.homestay_id = homestay_id;
        this.account = account;
        this.content = content;
        this.comment_time = comment_time;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "comment_id")
    public long getComment_id() {
        return comment_id;
    }

    public void setComment_id(long comment_id) {
        this.comment_id = comment_id;
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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Basic
    @Column(name = "comment_time")
    public Timestamp getComment_time() {
        return comment_time;
    }

    public void setComment_time(Timestamp comment_time) {
        this.comment_time = comment_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", homestay_id=" + homestay_id +
                ", account='" + account + '\'' +
                ", content='" + content + '\'' +
                ", comment_time=" + comment_time +
                '}';
    }
}
