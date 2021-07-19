/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.crazy.dao.impl;

import com.crazy.dao.UserDao;

/**
 * @author Administrator
 * @date 2021/7/16 14:00
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl   创建");
    }

    public void userDaoInit(){
        System.out.println("初始化方法。。。。");
    }

    public void userDaoDesctory(){
        System.out.println("销毁化方法。。。。");
    }


    public void save() {
        System.out.println("save running");
    }
}
