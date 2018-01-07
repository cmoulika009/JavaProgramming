package com.sring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring along with Component scan it also looks for Controller
//As Controller inherits from Component
@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		// return view name as spring automatically adds suffix and prefix defined in xml
		return "main";
	}
}
