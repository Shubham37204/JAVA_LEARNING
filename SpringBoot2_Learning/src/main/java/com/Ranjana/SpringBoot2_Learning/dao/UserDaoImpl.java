package com.Ranjana.SpringBoot2_Learning.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository  //user for database logic
public class UserDaoImpl implements IUserDao{

    @Override
    public boolean saveUser(String uname, String email, String pwd) {
        System.out.println("Record inserted in DB");
        return true;
    }
}
