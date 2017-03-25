package com.homestay.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_message",schema = "homestay")
public class Message {
    private long message_id;
    private String message_from;
    private String message_to;
    private String message_content;
    private Timestamp message_time;

    public Message() {
    }

    public Message(String message_from, String message_to, String message_content, Timestamp message_time) {
        this.message_from = message_from;
        this.message_to = message_to;
        this.message_content = message_content;
        this.message_time = message_time;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "message_id")
    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }
    @Basic
    @Column(name = "message_from")
    public String getMessage_from() {
        return message_from;
    }

    public void setMessage_from(String message_from) {
        this.message_from = message_from;
    }
    @Basic
    @Column(name = "message_to")
    public String getMessage_to() {
        return message_to;
    }

    public void setMessage_to(String message_to) {
        this.message_to = message_to;
    }

    @Basic
    @Column(name = "message_content")
    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }
    @Basic
    @Column(name = "message_time")
    public Timestamp getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Timestamp message_time) {
        this.message_time = message_time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message_from='" + message_from + '\'' +
                ", message_to='" + message_to + '\'' +
                ", message_content='" + message_content + '\'' +
                ", message_time=" + message_time +
                '}';
    }
}
