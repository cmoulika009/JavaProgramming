package com.sring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//In this class we try to do same Request Mapping "initialForm" for method
//This will throw an error Ambiguous Method as same mapping is done in HelloWorldCOntroller
//This can be avoided by adding RequestMapping for Controller
@Controller
public class AmbiguosMappingController {

	@RequestMapping("/initialForm")
	public String getAmbMethod() {
		return "hello";
	}

}
