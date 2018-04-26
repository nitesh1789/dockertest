package com.example.demo.service;


import com.example.demo.model.login;


public interface Loginservice {
public boolean storelogindetail(String username,String password);
public login getuserdata(String username);

}
