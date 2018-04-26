package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.login;
import com.example.demo.service.Loginservice;



@RestController
public class LoginController {

	@Autowired
	Loginservice loginservice;
	
	
	
	@RequestMapping("/homepage")
	 public String home() {
	  return "home";
	 }
	
	/*@RequestMapping(value="/first/{username}/{password}",method = RequestMethod.POST)
	@PostMapping("/first/{username}/{password}")
	@ResponseBody
	 public boolean userdata(@PathVariable("username") String username,@PathVariable("password") String password) {
		boolean temp = loginservice.storelogindetail(username,password);
		
	    return temp;
	 }*/
	
	
	@RequestMapping(value="/first/{username}/{password}",method = RequestMethod.POST)
	/*@PostMapping("/first/{username}/{password}")*/
	@ResponseBody
	 public boolean userdata(@PathVariable("username") String username,@PathVariable("password") String password) {
		System.out.println("hello");
		boolean temp = loginservice.storelogindetail(username,password);
		
	    return temp;
	 }
	
	
	 @GetMapping(value="/first/{username}")
	 public login userdata(@PathVariable("username") String username) {
		login Userdetails = loginservice.getuserdata(username);
		return Userdetails;
		
		
	 }
}
