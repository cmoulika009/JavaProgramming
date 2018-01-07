package com.spring.validations;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// Add InitBinder that trims whitespaces
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		// Defined in Spring API that is used to remove Whitespace
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		// For every String class trim the whitespace
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Customer theCust = new Customer();
		theModel.addAttribute("customer", theCust);
		return "customer-form";
	}

	// @Valid perform validation on customer object
	// BindingResult: results of validation are binded here
	// @ModelAttribute maps form data to object
	@RequestMapping("/processForm")
	public String displayCustDetails(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindResult) {

		if (theBindResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-display";
		}
	}
}
