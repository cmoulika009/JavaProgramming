package com.sring.mvc;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Spring along with Component scan it also looks for Controller
//As Controller inherits from Component
//@RequestMapping for controller acts as Parent Mapping and resolves ambiguity
//if there are same method mappings

@Controller
@RequestMapping("/welcome")
public class HomeWorldController {

	// Need Controller method to show initial HTML form
	@RequestMapping("/initialForm")
	public String showMyPage() {
		// return view name as spring automatically adds suffix and prefix
		// defined in xml
		return "home";
	}

	// Need Controller method to show processed HTML form
	@RequestMapping("/processForm")
	public String processMyPage() {
		// return view name as spring automatically adds suffix and prefix
		// defined in xml
		return "hello";
	}

	// New controller method to read form data
	@RequestMapping("/processFormData")
	public String getFormDate(HttpServletRequest request, Model model) {

		// read request parameter from HTML form data
		String stdName = request.getParameter("studentName");

		stdName = stdName.toUpperCase();

		String result = "Welcome to my page" + stdName;

		// add message to model
		model.addAttribute("message", result);
		return "hello";
	}

	// New controller method to read form data using @RequestParan

	@RequestMapping("/processReqParamFormData")
	public String getRequestParamFormDate(@RequestParam("studentName") String stdName, Model model) {

		stdName = stdName.toUpperCase();

		String result = "Welcome to my page " + stdName;

		// add message to model
		model.addAttribute("message", result);
		return "hello";
	}
}
