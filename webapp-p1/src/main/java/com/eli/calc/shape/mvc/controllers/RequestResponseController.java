package com.eli.calc.shape.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestResponseController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcomeTheSlash() {

    	System.err.println("\n\n\nWelcome: The / (slash) ; Index page\n\n\n");

		return new ModelAndView("/index","message","Slash Index Page: dynamic message from Controller");
	}


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView welcomeTheIndex() {

    	System.err.println("\n\n\nWelcome2: The /index Index page\n\n\n");

		return new ModelAndView("/index","message","Index Index Page: dynamic message from Controller");
	}


	@RequestMapping(value="/pending",method=RequestMethod.GET)
	public ModelAndView pending() {

    	System.err.println("\n\n\nPending\n\n\n");

		return new ModelAndView("/pending","message","Pending Requests Page: message from Controller");

	}


}
