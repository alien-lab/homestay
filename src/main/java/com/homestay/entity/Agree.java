package com.homestay.entity;

import javax.persistence.*;

/**
 * Created by 慧慧姐 on 2017/3/22.
 */
@Entity
@Table(name = "t_agree",schema = "homestay")
public class Agree {
    private long agree_id;
    private long article_id;
    private String account;

    public Agree() {
    }

    public Agree(long article_id, String account) {
        this.article_id = article_id;
        this.account = account;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "agree_id")
    public long getAgree_id() {
        return agree_id;
    }

    public void setAgree_id(long agree_id) {
        this.agree_id = agree_id;
    }
    @Basic
    @Column(name ="article_id" )
    public long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }
    @Basic
    @Column(name ="account" )
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Agree{" +
                "agree_id=" + agree_id +
                ", article_id=" + article_id +
                ", account='" + account + '\'' +
                '}';
    }
}
