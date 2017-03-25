package com.homestay.controller;

import com.alibaba.fastjson.JSONObject;
import com.homestay.entity.User;
import com.homestay.repository.UserInfoRepository;
import com.homestay.repository.UserRepository;
import com.homestay.service.UserInfoService;
import com.homestay.service.UserService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserInfoRepository userInfoRepository;
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

   /* @RequestMapping(value = "regCheck",method = RequestMethod.POST)
    public String userRegist(HttpServletRequest request){
        try {
            String jsonBody = IOUtils.toString(request.getInputStream(),"utf-8");
            JSONObject form = JSONObject.parseObject();
            User user = new User();
            user.setAccount(form.);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}
