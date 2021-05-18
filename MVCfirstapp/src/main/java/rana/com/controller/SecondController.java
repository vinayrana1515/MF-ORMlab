package rana.com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import rana.com.models.UserData;

@Controller
public class SecondController {

	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("user") UserData ud) {

	      System.out.println("Email: " + ud.getEmail());
	      System.out.println("First Name: " + ud.getName());

	      return "InfoPage";
	   }
	
}
