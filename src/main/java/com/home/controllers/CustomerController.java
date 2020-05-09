package com.home.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	/**
	 * It pre-process all the web request coming into our controller class.
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {

		// remove leading and trailing whitespace.If the entire string is white space
		// then it will trim it down to null since the flag is set to true.
		StringTrimmerEditor trimEditor = new StringTrimmerEditor(true);

		// Every string class applies the trimEditor.
		binder.registerCustomEditor(String.class, trimEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer-form";
	}

	/**
	 * @Valid - it tells the spring to validate the customer object. Performs
	 *        Validation rules on customer object.
	 * @BindingResult - Spring will store the result of validation in this
	 *                attribute.
	 * 
	 * @param customer the customer
	 * @param result   the result
	 * @return view
	 */
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {

		
		System.out.println(customer.getLastName());
		
		System.out.println("Binding result " + result);
		
		if (result.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
