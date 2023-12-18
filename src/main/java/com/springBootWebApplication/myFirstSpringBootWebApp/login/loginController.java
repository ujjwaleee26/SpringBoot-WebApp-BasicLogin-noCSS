package com.springBootWebApplication.myFirstSpringBootWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
//public class loginController 
//{
//	//Logger 
//	private Logger logger =LoggerFactory.getLogger(getClass());
//	@RequestMapping("login")
//	public String toLogin(@RequestParam String name,ModelMap model)
//	{
//		model.put("name",name);
//		//depending upon logging level, it prints and every log mode below it 
//		logger.debug("Request Param is {}",name);
//		logger.info("Request Param is {}",name);
//		logger.warn("Eras Tour coming");
//		//System.out.println("RequestParam is "+name); 
//		return "login";
//	}
//}

@Controller
public class loginController {
	private AuthenticationService authenticate;

	public loginController(AuthenticationService authenticate) {
		super();
		this.authenticate = authenticate;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String toLogin() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String toWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticate.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		} else {
			model.put("error_message", "Invalid Credentials");
			return "login";
		}

	}
}
