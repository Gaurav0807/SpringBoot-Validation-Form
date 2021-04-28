package com.start1.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.start1.entities.User;
import com.start1.helper.Message;

@Controller
public class User_Controller {
	
	@RequestMapping("/")
	public String showForm(User u,Model m)
	{
		m.addAttribute("user",new User());
		m.addAttribute("title","Validation Form");
		return "register";
	}

	@PostMapping("/")
	public String register(@Valid User user,BindingResult bindingResult ,Model m,HttpSession session)
	{
		if(bindingResult.hasErrors())
		{
			session.setAttribute("message", new Message("Something Went Wrong","danger"));
			return "register";
		}
		else {
			session.setAttribute("message", new Message("Your Contact is added !! Add more ","success"));
			m.addAttribute("message", "Registration successfully... ");
		return "register";
		}
	}
}
