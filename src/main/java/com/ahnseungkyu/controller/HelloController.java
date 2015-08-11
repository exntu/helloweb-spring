package com.ahnseungkyu.controller;

//import javax.inject.Inject;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.ahnseungkyu.common.MessageUtil;

@Controller
public class HelloController {

	@Autowired
    private MessageUtil messageUtil;	
	Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping( value={"/hello"}, method={RequestMethod.GET} )
	public ModelAndView menuView(
			HttpServletRequest request,
			HttpServletResponse response ) throws Exception {

		ModelAndView model = new ModelAndView();
		
		model.setViewName("/jsppath/hello");
		
		model.addObject("message", messageUtil.getMessage("message.common.hello"));
		
		return model;
	}
	
	@RequestMapping( value={"/login"}, method={RequestMethod.GET} )
	public ModelAndView loginView(
			HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		
		String forwardUrl = "";
		
		Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
		if (flashMap != null) {
			forwardUrl = (String) flashMap.get("_forwardUrl");
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("userId", null);
		
		ModelAndView model = new ModelAndView();
		
		// JSP포워드
		model.setViewName("/login");
		
		// 데이터
		model.addObject("_forwardUrl", forwardUrl);
		
		return model;
	}
}
