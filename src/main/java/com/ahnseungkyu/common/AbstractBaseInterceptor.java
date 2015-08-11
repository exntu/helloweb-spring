package com.ahnseungkyu.common;

import java.io.PrintWriter;

//import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.StringUtils;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.ahnseungkyu.common.MessageUtil;

public class AbstractBaseInterceptor extends HandlerInterceptorAdapter {

	@Autowired
    private MessageUtil messageUtil;
	
	Logger logger = LoggerFactory.getLogger(AbstractBaseInterceptor.class);
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		
		if( userId == null ){
			notLoginProccess(request, response);
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if( modelAndView == null
			|| (modelAndView.getViewName().indexOf("jsppath") == -1) ){
			
			return;
		}
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		
		modelAndView.addObject("_loginInfo", userId);
		if( modelAndView.getViewName().indexOf("jsppath") != -1 ){

		}
		else{
			throw new Exception("AbstractBaseInterceptor.java => postHandle : JSP 경로가 올바르지 않음");
		}
	}

	@SuppressWarnings("unchecked")
	private void notLoginProccess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 서비스(Ajax) 접속이라면 LOGIN코드 반환
		if( isService(request) ){
			
			// 인코딩
			response.setCharacterEncoding("UTF-8");
			
			// Header
			response.setContentType("application/json");
			
			// Data
			JSONObject data = new JSONObject();
			
			// Data Add => Code
			data.put("CODE", "HELLO");
			
			// Data Add => Message
			data.put("MESSAGE", messageUtil.getMessage("message.common.hello"));
			logger.debug("MESSAGE = %s", messageUtil.getMessage("message.common.hello"));
			
			// Print
			PrintWriter out = response.getWriter();
			out.print(data);
		} else{
			addRedirectAttr(request.getServletPath(), request, response);
			response.sendRedirect(request.getContextPath() + "/hello");
		}
	}

	private void addRedirectAttr(String uri, HttpServletRequest request, HttpServletResponse response){
		
		// create a flashmap
		FlashMap flashMap = new FlashMap();

		// store the message
		flashMap.put("_forwardUrl", uri);

		// create a flashmapMapManger with `request`
		FlashMapManager flashMapManager = RequestContextUtils.getFlashMapManager(request);

		// save the flash map data in session with falshMapManager
		flashMapManager.saveOutputFlashMap(flashMap, request, response);
	}
	
	private boolean isService(HttpServletRequest request){
		
		String url = request.getServletPath();
		return url.indexOf("/service/") != -1 ? true : false;
	}
}
