package com.app.controller;

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
import com.app.model.User;
import com.app.service.BaseService;
import com.app.service.TagService;
import com.app.tools.JsonTreeData;
import com.google.gson.Gson;

@Controller
public class TagController {

	@RequestMapping("/checknewtag")                   //id参数改为name 访问路径http://localhost:8080/b/hello?name=123
	@ResponseBody
	public String checknewTag(Model model,String newtag,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		TagService tagService =(TagService)context.getBean("tagService");
		if(tagService.checkNewTag(newtag)){
			return String.valueOf(tagService.getTagbyContent(newtag).getId());
		}else {
			return "fail";
		}
	}
	
	
	
	
}
