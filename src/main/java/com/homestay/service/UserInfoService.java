package com.homestay.service;

import com.homestay.entity.UserInfo;
import com.homestay.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
@Service
public class UserInfoService {
    @Autowired
    UserInfoRepository userInfoRepository;

    //新增一条用户信息
    public UserInfo addUserInfo(UserInfo userInfo){
        if (userInfo!=null){
            return userInfoRepository.save(userInfo);
        }else {
            return null;
        }
    }

    //修改用户信息
    public UserInfo updateUserInfo(UserInfo userInfo){
        try {
            userInfo=userInfoRepository.save(userInfo);
            return userInfo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //根据账号查询用户信息
    public UserInfo findUserInfoByAccount(String account){
        return userInfoRepository.findUserInfoByAccount(account);
    }
}
