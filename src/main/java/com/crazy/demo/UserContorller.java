/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.crazy.demo;

import com.crazy.service.UserService;
import com.crazy.service.impl.UserServiceImpl;

/**
 * @author Administrator
 * @date 2021/7/16 18:09
 */
public class UserContorller {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
