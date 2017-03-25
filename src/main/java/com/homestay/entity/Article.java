package com.homestay.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_article",schema = "homestay")
public class Article {
    private long article_id;
    private String article_name;
    private String article_content;
    private String account;
    private String thumbnail;
    private Timestamp article_time;
    private long reply;
    private long collection;
    private long agreed_number;

    public Article() {
    }

    public Article(String article_name, String article_content, String account, String thumbnail, Timestamp article_time, long reply, long collection, long agreed_number) {
        this.article_name = article_name;
        this.article_content = article_content;
        this.account = account;
        this.thumbnail = thumbnail;
        this.article_time = article_time;
        this.reply = reply;
        this.collection = collection;
        this.agreed_number = agreed_number;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "article_id")
    public long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }
    @Basic
    @Column(name = "article_name")
    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }
    @Basic
    @Column(name = "article_content")
    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
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
    @Column(name = "thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    @Basic
    @Column(name = "article_time")
    public Timestamp getArticle_time() {
        return article_time;
    }

    public void setArticle_time(Timestamp article_time) {
        this.article_time = article_time;
    }
    @Basic
    @Column(name = "reply")
    public long getReply() {
        return reply;
    }

    public void setReply(long reply) {
        this.reply = reply;
    }
    @Basic
    @Column(name = "collection")
    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
    }
    @Basic
    @Column(name = "agreed_number")
    public long getAgreed_number() {
        return agreed_number;
    }

    public void setAgreed_number(long agreed_number) {
        this.agreed_number = agreed_number;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_name='" + article_name + '\'' +
                ", article_content='" + article_content + '\'' +
                ", account='" + account + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", article_time=" + article_time +
                ", reply=" + reply +
                ", collection=" + collection +
                ", agreed_number=" + agreed_number +
                '}';
    }
}
