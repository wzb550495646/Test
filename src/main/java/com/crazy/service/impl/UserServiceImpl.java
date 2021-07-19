/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.crazy.service.impl;

import com.crazy.dao.UserDao;
import com.crazy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2021/7/16 18:06
 */
public class UserServiceImpl implements UserService {
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userdao = (UserDao) app.getBean("userDao" );
        userdao.save();
    }
}
