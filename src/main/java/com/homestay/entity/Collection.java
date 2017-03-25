package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_collection",schema = "homestay")
public class Collection {
    private long collection_id;
    private long article_id;
    private String account;

    public Collection() {
    }

    public Collection(long article_id, String account) {
        this.article_id = article_id;
        this.account = account;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "collection_id")
    public long getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(long collection_id) {
        this.collection_id = collection_id;
    }
    @Basic
    @Column(name = "article_id")
    public long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }
    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collection_id=" + collection_id +
                ", article_id=" + article_id +
                ", account='" + account + '\'' +
                '}';
    }
}
