package com.czx.chapter02.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public Object login(){
		return "login";
	}
}
