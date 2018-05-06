package com.apexia.dashboard.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="dashboard")
public class SalesDashboardController {
	
	@RequestMapping(value= "/SalesDashboard", method=RequestMethod.POST)
	public ModelAndView showSalesDashboard(HttpServletRequest request, HttpServletResponse response) {
		
		if(request.getSession().getAttribute("user")==null) {
			ModelAndView modelAndView =  new ModelAndView("redirect:/login");
			return modelAndView;
		}else {
			ModelAndView modelAndView =  new ModelAndView();
			modelAndView.setViewName("dashboard/SalesDashboard");
			return modelAndView;
		}
	}

}
