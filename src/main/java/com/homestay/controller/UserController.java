package com.homestay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.homestay.db.ExecResult;
import com.homestay.entity.User;
import com.homestay.entity.UserInfo;
import com.homestay.service.UserInfoService;
import com.homestay.service.UserService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "regCheck",method = RequestMethod.POST)
    public String userRegist(HttpServletRequest request){
        try {
            String jsonBody = IOUtils.toString(request.getInputStream(),"utf-8");
            JSONObject form = JSONObject.parseObject(jsonBody);
            User user = new User();
            user.setAccount(form.getString("account"));
            user.setPassword(form.getString("password"));
            UserInfo userInfo = new UserInfo();
            userInfo.setAccount(form.getString("account"));
            userInfo.setNickname(form.getString("nickname"));

            User user_check = userService.findUser(form.getString("account"));
            UserInfo userInfo_check = userInfoService.findUserInfoByAccount(form.getString("account"));
            if (userInfo_check == null && user_check == null){
                User result_user = userService.addUser(user);
                UserInfo result_userInfo = userInfoService.addUserInfo(userInfo);
                if (result_userInfo == null && result_user == null){
                    return new ExecResult(false,"添加用户信息失败").toString();
                }else {
                    ExecResult er=new ExecResult();
                    er.setResult(true);
                    er.setData((JSON)JSON.toJSON(result_user));
                    return er.toString();
                }
            }else {
                return new ExecResult(false,"已经存在此用户名").toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ExecResult(false,"添加用户出现异常").toString();
        }
    }

    @RequestMapping(value = "/loginCheck",method= RequestMethod.POST)
    public String loginCheck(HttpServletRequest request){
        try{
            String input= IOUtils.toString(request.getInputStream(),"utf-8");
            JSONObject param= JSON.parseObject(input);
            String account=param.getString("loginname");
            String password=param.getString("password");
            User user = userService.findUser(account);
            if(user==null){
                return new ExecResult(false,"登录用户不存在").toString();
            }else{
                if(user.getPassword().equals(password)){//登录成功
                    ExecResult er=new ExecResult();
                    er.setResult(true);
                    er.setData((JSON)JSON.toJSON(user));
                    return er.toString();
                }else{
                    return new ExecResult(false,"用户名或密码错误").toString();
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return new ExecResult(false,"登录发生异常").toString();
        }
    }

}
