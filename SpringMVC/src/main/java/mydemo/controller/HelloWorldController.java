package mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")   //if any request is coming it will be handle by this class
public class HelloWorldController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView sayHello() {
		//model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return new ModelAndView("welcome","greeting", "Hello World from Spring  MVC");
		
	}
	
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring  4 MVC");
		return "welcome1";
		
	}

}
