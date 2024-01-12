package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.logging.Logger;


@Controller
public class DemoController {
	Logger log=Logger.getAnonymousLogger();
	//response -> 2. physical response 
		@RequestMapping("/")
		public ModelAndView defaultpage(HttpServletRequest request,HttpServletResponse response) {
			log.info("entered into the / request");
			ModelAndView mv=new ModelAndView();	
			mv.setViewName("index.jsp");
			log.info("went to index.jsp page ");
			return mv;
			
		}

	
	
	@RequestMapping("/sum")
	public ModelAndView displaySum(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("result", res);
		return mv;
		
	}
	
	
	
	@RequestMapping("/sub")
	public ModelAndView displaySub(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("result", res);
		return mv;
		
	}
	
}
