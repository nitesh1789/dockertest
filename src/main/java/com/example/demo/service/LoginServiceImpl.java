package com.example.demo.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LoginRepository;

import com.example.demo.model.login;

@Service
public class LoginServiceImpl implements  Loginservice {

	
	@Autowired
	LoginRepository loginRepository;
	@Override
	public boolean storelogindetail(String username, String password) {
		
		List<login> list = loginRepository.findByname(username); 	
        if (list.size() > 0) {
           return false;
        } else {
        	login logintemp = new login();
        	logintemp.setUsername(username);
        	logintemp.setPassword(password);
        	loginRepository.save(logintemp);
        return true;
        }
		/*login tst = new login();
		tst.setUsername(username);
		tst.setPassword(password);
		System.out.println(tst.getUsername()+"--"+tst.getPassword());
		login logindata = loginRepository.save(tst);
		return logindata;*/
	}
	@Override
	public login getuserdata(String username) {
		login logindetail = null;
		List<login> logindetails = loginRepository.findByname(username);
		for (Iterator iterator = logindetails.iterator(); iterator.hasNext();) {
			logindetail = (login) iterator.next();
			
		}
		return logindetail;
	}

}
