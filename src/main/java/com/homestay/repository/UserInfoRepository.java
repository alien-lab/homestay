package com.homestay.repository;

import com.homestay.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{
    UserInfo findUserInfoByAccount(String account);
}
