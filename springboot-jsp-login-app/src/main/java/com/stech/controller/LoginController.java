package com.stech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value= "/login", method=RequestMethod.GET)
	public String viewLoginPage() {
		return "login";
	}
	
	
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public String welcomeoage(ModelMap model , @RequestParam String userId, @RequestParam String password) {
		if (userId.equals("admin07@yahoo.com") && password.equals("root")) {
			return "welcome";
		}
		model.put("error msg ", "plz provide the correctuserID and Password");
		return "login";
	}
}
