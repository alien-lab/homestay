package com.homestay.service;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */

import com.homestay.entity.User;
import com.homestay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //新增一个用户
    public User addUser(User user){
        if (user!=null){
            return userRepository.save(user);
        }else {
            return null;
        }
    }
    //删除一个用户
    public boolean deleteUser(Long user_id){
        try {
            userRepository.delete(user_id);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    //修改用户信息
    public User updateUser(User user){
        try {
            user=userRepository.save(user);
            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //
    public User findUser(String account){
        return  userRepository.findByAccount(account);
    }
    //
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
