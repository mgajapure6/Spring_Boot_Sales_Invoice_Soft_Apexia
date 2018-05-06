package com.apexia.common.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apexia.common.beans.UserMaster;
import com.apexia.common.repositories.UserRepository;

@Controller
public class CommonController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value= {"/","/login","/signin"}, method=RequestMethod.GET)
	public String showLogin(HttpServletRequest request, HttpServletResponse response) {
		if(request.getSession().getAttribute("user")==null) {
			return "common/Login";
		}else {
			return "redirect:/SalesDashboard";
		}
	}
	
	@RequestMapping(value= {"/","/login","/signin"}, method=RequestMethod.POST)
	public @ResponseBody String processLogin(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserMaster userMaster = userRepository.findByUsernameAndPassword(username, password);
		if(userMaster==null) {
			return "Invalid Username Or Password ";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("user", userMaster);
			return "success";
		}
	}
	
	@RequestMapping(value= "/logout", method=RequestMethod.GET)
	public String processLogout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "redirect:/login";
	}
	
	@RequestMapping(value= "/index", method=RequestMethod.GET)
	public String showIndex(HttpServletRequest request, HttpServletResponse response) {
		if(request.getSession().getAttribute("user")==null) {
			return "redirect:/login";
		}else {
			return "common/index";
		}
	}
	
	@RequestMapping(value= "/loadJsp", method=RequestMethod.POST)
	public String loadJsp(HttpServletRequest request, HttpServletResponse response) {
		if(request.getSession().getAttribute("user")==null) {
			return "redirect:/login";
		}else {
			String jspUrl = request.getParameter("jspUrl");
			return "redirect:/"+jspUrl;
		}
	}
}
