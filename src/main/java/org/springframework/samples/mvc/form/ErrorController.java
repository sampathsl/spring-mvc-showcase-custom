package org.springframework.samples.mvc.form;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	
	@ExceptionHandler(HttpSessionRequiredException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason="The session has expired")
	public ModelAndView handleSessionExpired(){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public ModelAndView getErrorPage() {
		return new ModelAndView("error");
	}
	
	@RequestMapping(value="/error",method=RequestMethod.POST)
	public String postErrorPage() {
		return "redirect:/error";
	}
	
}
