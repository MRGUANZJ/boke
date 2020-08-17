package com.zhijie.demo.service.impl;

import com.zhijie.demo.Mapper.UserRepository;
import com.zhijie.demo.Util.MD5Utils;
import com.zhijie.demo.entiry.User;
import com.zhijie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: zhijie
 * @Date: 2020/08/15/15:45
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserRepository userRepository;

    //验证用户名
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));

        return user;
    }
}
