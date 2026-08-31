package com.Ranjana.SpringBoot2_Learning.service;

import com.Ranjana.SpringBoot2_Learning.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private PwdService pwdService;
    private IUserDao userDao;
    private EmailService emailService;

//    public UserService() {
//        System.out.println("0 params constructor");
//    }

    //Constructor Injection
//    @Autowired
    public UserService(PwdService pwdService, IUserDao userDao, EmailService emailService) {
        this.pwdService = pwdService;
        this.userDao = userDao;
        this.emailService = emailService;
        System.out.println("args - UserService constructor");
    }

//Setter Injection
//    @Autowired
//    public void setPwdService(PwdService pwdService) {
//        this.pwdService = pwdService;
//    }
//
//    @Autowired
//    public void setUserDao(IUserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Autowired
//    public void setEmailService(EmailService emailService) {
//        this.emailService = emailService;
//    }

    public boolean registerUser(String name, String email, String pwd){
        String encryptPwd  = pwdService.encryptPws(pwd);
        boolean isSaved = userDao.saveUser(name,email,encryptPwd);
        if(isSaved){
          boolean isSent =  emailService.sendEmail(email,"test subject","test message");
            if(isSent){
                System.out.println("User has been saved successfully");
            }
        }
        return isSaved;
    }
}
