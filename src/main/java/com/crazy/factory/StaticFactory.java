/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.crazy.factory;

import com.crazy.dao.UserDao;
import com.crazy.dao.impl.UserDaoImpl;

/**
 * @author Administrator
 * @date 2021/7/16 17:50
 */
public class StaticFactory {

    public  static UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
