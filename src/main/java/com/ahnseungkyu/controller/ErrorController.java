package com.ahnseungkyu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ahnseungkyu.common.MessageUtil;

@Controller
public class ErrorController {
	
	@Autowired
    private MessageUtil messageUtil;
	
	Logger logger = LoggerFactory.getLogger(ErrorController.class);

	@RequestMapping( value={"/error"}, method={RequestMethod.GET} )
	public ModelAndView errorView(
			HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		
		ModelAndView model = new ModelAndView();
		
		// JSP
		model.setViewName("/error/error");
		
		return model;
	}
	
	@RequestMapping( value={"/error/404"}, method={RequestMethod.GET} )
	public ModelAndView error404View(
			HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		
		ModelAndView model = new ModelAndView();
		
		// JSP
		model.setViewName("/error/error_404");
		
		return model;
	}
	
	@RequestMapping( value={"/error/401"}, method={RequestMethod.GET} )
	public ModelAndView error401View(
			HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		
		ModelAndView model = new ModelAndView();
		
		// JSP
		model.setViewName("/error/error_404");
		
		return model;
	}

}
