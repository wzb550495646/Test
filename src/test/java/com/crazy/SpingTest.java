/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.crazy;

import com.crazy.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2021/7/16 14:18
 */
public class SpingTest {

    @Test
    //c测试
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userdao1 = (UserDao) app.getBean("userDao" );

        UserDao userdao2 = (UserDao) app.getBean("userDao" );

        System.out.println(userdao1);
        System.out.println(userdao2);

        ((ClassPathXmlApplicationContext)app).close();
    }

}
