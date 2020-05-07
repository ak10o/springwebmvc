package com.home.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@RequestMapping("/showForm")
	public String showForm(){
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "welcome";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersion(@RequestParam("studentName") String name, Model model){
		
		//String name = request.getParameter("studentName");
		
		name = name.toUpperCase() + " Yo";
		
		model.addAttribute("message", name);
		
		return "welcome";
	}
}

