package com.zhijie.demo.service;

import com.zhijie.demo.entiry.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: zhijie
 * @Date: 2020/08/15/15:45
 * @Description:
 */

public interface UserService {
    User checkUser(String username, String password);
}
