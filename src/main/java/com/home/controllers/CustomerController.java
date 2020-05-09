package com.home.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.model.Customer;
import com.home.model.Student;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	/**
	 * @Valid - it tells the spring to validate the customer object.
	 * Performs Validation rules on customer object.
	 * @BindingResult - Spring will store the result of validation in this attribute.
	 * 
	 * @param customer the customer
	 * @param result the result
	 * @return view
	 */
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult result) {
		
		if ( result.hasErrors()) {
			return "customer-form";
		}
		else {
		return "customer-confirmation";
		}
	}
}
