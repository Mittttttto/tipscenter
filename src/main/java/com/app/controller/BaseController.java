package com.app.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Tag;
import com.app.model.User;
import com.app.service.BaseService;
import com.app.service.TagService;
import com.app.tools.JsonTreeData;
import com.google.gson.Gson;

@Controller
public class BaseController {
	//登录部分
	@RequestMapping("/index")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	public String index(Model model,String city,HttpSession session){  
		ApplicationContext context= null;
		return "index";	
	}
	
	
	
	
	@RequestMapping("/table")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	public String table(Model model,HttpSession session){  
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		TagService tagService =(TagService)context.getBean("tagService");
		BaseService baseService =(BaseService)context.getBean("baseService");
		List<Tag> tags= tagService.getTags();
		List<User> users=baseService.getAllUser();
		model.addAttribute("tags", tags);
		model.addAttribute("users", users);
		return "table";	
	}
	
	@RequestMapping("/checklogin")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	@ResponseBody
	public String checklogin(Model model,String username,String pwd,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		BaseService baseService =(BaseService)context.getBean("baseService");

	
		System.err.println(pwd);
		List<User> users =baseService.checklogin(username,pwd);
		if(users.size()==0){
			return "fail";
		}else {
			session.setAttribute("uid", users.get(0).getId());
			session.setAttribute("uname", users.get(0).getname());
			System.out.println("uid"+session.getAttribute("uid"));
			return username;
		}
	}
	
	@RequestMapping("/checkuser")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	@ResponseBody
	public String checkUser(HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		BaseService baseService =(BaseService)context.getBean("baseService");

		Long uid = (Long) session.getAttribute("uid");
		if (uid==null) {
			return "fail";
		}else {
			return "success";
		}
	}

	
	 

	
	
	@RequestMapping("/logout")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	@ResponseBody
	public String logout(HttpSession session){   
		session.removeAttribute("uid");
		session.removeAttribute("uname");
		return "success";
	}
	
	
	
}
