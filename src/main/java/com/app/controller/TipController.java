package com.app.controller;

import java.awt.print.Printable;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.app.model.Comment;
import com.app.model.Tag;
import com.app.model.Tip;
import com.app.model.User;
import com.app.model.Version;
import com.app.service.BaseService;
import com.app.service.TagService;
import com.app.service.TipService;
import com.app.service.VersionService;
import com.app.tools.JsonTreeData;
import com.app.tools.WordExcelToHtml;
import com.app.tools.XlsToHtml;
import com.app.tools.XwordToHtml;
import com.bea.xml.stream.samples.Parse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.corba.se.spi.orb.ParserData;

@Controller
public class TipController {
	
	
	@RequestMapping("/initdata")                 
	@ResponseBody
	public String initData(Model model,String username,String pwd,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		TipService tipService =(TipService)context.getBean("tipService");
		BaseService baseService =(BaseService)context.getBean("baseService");
		TagService tagService =(TagService)context.getBean("tagService");
		
		List<Tip> tips=tipService.findAllTip();
		List<Tag> tags=tagService.getTags();
		Map<Long, String> tagmap=new HashMap<Long, String>();
		for (Tag tag : tags) {
			tagmap.put(tag.getId(), tag.getcontent());
		}
		List<User> users=baseService.getAllUser();
		Map<Long, String> usermap=new HashMap<Long, String>();
		for (User user : users) {
			usermap.put(user.getId(), user.getname());
		}
		int size=tips.size();
		HashMap<String,Object> map=new HashMap<String, Object>();
		List<HashMap<String, Object>> datas=new ArrayList<HashMap<String,Object>>();
		for(Tip tip : tips){
			System.err.println(tip.getId());
			map=new HashMap<String, Object>();
			map.put("id", new String("")+tip.getId());
			map.put("title", new String("")+tip.getTitle());
			map.put("version", new String("")+tip.getVersion());
			map.put("owner", new String("")+usermap.get(tip.getUid()));
			String tagStr="";
			if(tip.getTag1id()!=0){
				tagStr=tagStr+tagmap.get(tip.getTag1id());
				if (tip.getTag2id()!=0) {
					tagStr=tagStr+","+tagmap.get(tip.getTag2id());
					if (tip.getTag3id()!=0) {
						tagStr=tagStr+","+tagmap.get(tip.getTag3id());
					}
				}
			}
			map.put("tags",tagStr);
			datas.add(map);
		}
		HashMap<String, Object> map2= new HashMap<String, Object>();
		map2.put("total", size);
		map2.put("rows", datas);
		Gson gson=new Gson();
		String data= gson.toJson(map2);
		return data;
	}
	

	@RequestMapping("/loaddata")                
	@ResponseBody
	public String loadData(Model model,String tags,String users,String searchtext,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		HashMap<String,Object> map=new HashMap<String, Object>();
		TipService tipService =(TipService)context.getBean("tipService");
		BaseService baseService =(BaseService)context.getBean("baseService");
		TagService tagService =(TagService)context.getBean("tagService");
		System.err.println(tags);
		System.err.println(users);
		System.err.println(searchtext);
		if(searchtext==null){
			searchtext="";
		}
		List<String> taglist=new ArrayList<String>();
		List<String> userlist=new ArrayList<String>();
		if(!tags.equals("-1")){
			String[] tagrow=tags.split(",");
			for (String string : tagrow) {
				taglist.add(string);
			}
		}
		if(!users.equals("-1")){
			String[] userrow=users.split(",");
			for (String string : userrow) {
				userlist.add(string);
			}
		}
		List<Tip> tips= tipService.Search(searchtext, userlist, taglist);
		List<Tag> alltags=tagService.getTags();
		Map<Long, String> tagmap=new HashMap<Long, String>();
		for (Tag tag : alltags) {
			tagmap.put(tag.getId(), tag.getcontent());
		}
		List<User> allusers=baseService.getAllUser();
		Map<Long, String> usermap=new HashMap<Long, String>();
		for (User user : allusers) {
			usermap.put(user.getId(), user.getname());
		}
		int size=tips.size();
		HashMap<String,Object> map1=new HashMap<String, Object>();
		List<HashMap<String, Object>> datas=new ArrayList<HashMap<String,Object>>();
		for(Tip tip : tips){
			System.err.println(tip.getId());
			map1=new HashMap<String, Object>();
			map1.put("id", new String("")+tip.getId());
			map1.put("title", new String("")+tip.getTitle());
			map1.put("version", new String("")+tip.getVersion());
			map1.put("owner", new String("")+usermap.get(tip.getUid()));
			String tagStr="";
			if(tip.getTag1id()!=0){
				tagStr=tagStr+tagmap.get(tip.getTag1id());
				if (tip.getTag2id()!=0) {
					tagStr=tagStr+","+tagmap.get(tip.getTag2id());
					if (tip.getTag3id()!=0) {
						tagStr=tagStr+","+tagmap.get(tip.getTag3id());
					}
				}
			}
			map1.put("tags",tagStr);
			datas.add(map1);
		}
		HashMap<String, Object> map2= new HashMap<String, Object>();
		map2.put("total", size);
		map2.put("rows", datas);
		Gson gson=new Gson();
		String data= gson.toJson(map2);
		return data;
	}
	
	@RequestMapping(value="/tipdetail",produces = "text/plain;charset=UTF-8" )                   
	@ResponseBody
	public String tipDetail(Model model,String title,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		TipService tipService =(TipService)context.getBean("tipService");
		VersionService versionService =(VersionService)context.getBean("versionService");
		BaseService baseService =(BaseService)context.getBean("baseService");
		List<User> users=baseService.getAllUser();
		Map<Long, String> usermap=new HashMap<Long, String>();
		for (User user : users) {
			usermap.put(user.getId(), user.getname());
		}
		HashMap<String,Object> map=new HashMap<String, Object>();
		WordExcelToHtml toHtml=new WordExcelToHtml();
		System.err.println(title);
		Tip tip=tipService.findTipBytitle(title);
		String url=tip.getUrl();
		String fileExtName = url.substring(url.lastIndexOf(".")+1);
		String inputFile=(System.getProperty("user.dir")+url);
		List<Version> versions= versionService.findtipVersion(tip.getId());
		String head="";
		String username="";
		for (Version version : versions) {
			version.getUid();
			username=usermap.get(version.getUid());
			version.getComment();
			head=head+"<span>version: </span><span>"+version.getversion()+"&nbsp&nbsp&nbsp&nbsp</span><span>Upload Date: </span><span>"+(version.getTime().getYear()+1900)+"-"+(version.getTime().getMonth()+1)+"-"+version.getTime().getDate()+"&nbsp&nbsp&nbsp&nbsp</span><span>"+username+"&nbsp&nbsp&nbsp&nbsp</span><span>Comment: </span><span>"+version.getComment()+"</span>&nbsp&nbsp&nbsp&nbsp<a href='/downbyversion?version="+version.getId()+"' >Download</a></br>";
		}
		System.out.println(inputFile);
		System.out.println("fileExtName"+fileExtName);
		String html="";

		
		if(fileExtName.equals("doc")){
			try {
				html=toHtml.getWordAndStyle(inputFile);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(fileExtName.equals("docx")){
			try {
				XwordToHtml xwordToHtml=new XwordToHtml();
				html=xwordToHtml.docxToHtml(inputFile);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(fileExtName.equals("xls")||fileExtName.equals("xlsx")){
			XlsToHtml xlsToHtml=new XlsToHtml();
			html=xlsToHtml.gethtml(inputFile);

		}else if(fileExtName.equals("pdf")||fileExtName.equals("ppt")||fileExtName.equals("pptx")||fileExtName.equals("zip")||fileExtName.equals("tar")||fileExtName.equals("gz")||fileExtName.equals("rar")){
			html=html+"not support preview now";

		}else {
            try {
            InputStreamReader read = new InputStreamReader(new FileInputStream(inputFile));
            BufferedReader bufferedReader = new BufferedReader(read);
            String tempString = null;
	        while ((tempString = bufferedReader.readLine()) != null) {
				html =html+"<div>" +tempString+"</div>";
	            }
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
            //xhtmlConverter.convert(document, outputStreamWriter, options);
		}
		
		return head+html;
	}
	
	
	
	@RequestMapping(value="/remove",produces = "text/plain;charset=UTF-8" )                   
	@ResponseBody
	public String remove(Model model,String title,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		TipService tipService =(TipService)context.getBean("tipService");
		VersionService versionService =(VersionService)context.getBean("versionService");
		HashMap<String,Object> map=new HashMap<String, Object>();
		WordExcelToHtml toHtml=new WordExcelToHtml();
		System.err.println(title);
		Tip tip=tipService.findTipBytitle(title);
		Long uid= (Long) session.getAttribute("uid");
		System.err.println("uid="+uid);
		System.err.println("tipid"+tip.getId());
		int tipVerstion=tip.getVersion();
		if(uid==null||uid.equals("null")||uid.equals("")){
			return "noright";
		}
		if(uid!=tip.getUid()){
			return "noright";
		}
		if(tip.getState()!=0){
			return "fail";
		}
		if(tip.getVersion()==1){
			tip.setState(1);
			tipService.updateTip(tip);
			return "success";
		}else {
			tip.setVersion(tip.getVersion()-1);
			List<Version> versions=versionService.findtipVersion(tip.getId());
			for (Version version : versions) {
				if(version.getversion()==tipVerstion-1){
					tip.setUrl(version.getUrl());
					tip.setComment(version.getComment());
					tip.setUid(version.getUid());
					tipService.updateTip(tip);
				}
				if(version.getversion()==tipVerstion){
					versionService.deleteVersion(version);
				}
			}
			return "back";
		}
		

	}
	
	
	 @RequestMapping("/uploadnewtip")
	 @ResponseBody 
	    public String uploadNewTip(Model model,HttpServletRequest request,HttpSession session){
		 	ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
	        TipService tipService =(TipService)context.getBean("tipService");
	        VersionService versionService =(VersionService)context.getBean("versionService");
		 
		 	String title="";
		 	String tags="";
		 	String comment="";
		 	String url="";
		 	String fileExtName="";
		 	//得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
			System.err.println(new File(this.getClass().getResource("/").getPath()));
			String filePath = new File(this.getClass().getResource("/").getPath().replace("\\classes", "\\upload" )).toString();		
			String savePath = "";
			savePath =System.getProperty("user.dir")+"/upload";
	        //上传时生成的临时文件保存目
			File tmpFile = new File(savePath);   //这里写的不严谨  知识为了方便而已  正式请修改成savepath
	        if (!tmpFile.exists()) {
	            //创建临时目录
	            tmpFile.mkdirs();
	        }
	        String message = "";
	        try{
	            //使用Apache文件上传组件处理文件上传步骤：
	            //1、创建一个DiskFileItemFactory工厂
	            DiskFileItemFactory factory = new DiskFileItemFactory();
	            //设置工厂的缓冲区的大小，当上传的文件大小超过缓冲区的大小时，就会生成一个临时文件存放到指定的临时目录当中。
	            factory.setSizeThreshold(1024*100);//设置缓冲区的大小为100KB，如果不指定，那么缓冲区的大小默认是10KB
	            //设置上传时生成的临时文件的保存目录
	            factory.setRepository(tmpFile);
	            //2、创建一个文件上传解析器
	            ServletFileUpload upload = new ServletFileUpload(factory);
	            //监听文件上传进度
	            upload.setProgressListener(new ProgressListener(){
	                public void update(long pBytesRead, long pContentLength, int arg2) {
	                	System.out.println("文件大小为：" + pContentLength + ",当前已处理：" + pBytesRead);
	                }
	            });
	             //解决上传文件名的中文乱码
	            upload.setHeaderEncoding("UTF-8"); 
	            //3、判断提交上来的数据是否是上传表单的数据
	            if(ServletFileUpload.isMultipartContent(request)){
	            	System.err.println("jinru request");
	                //设置上传单个文件的大小的最大值，目前是设置为1024*1024字节，也就是1MB
	                upload.setFileSizeMax(1024*1024*10);
	                //设置上传文件总量的最大值，最大值=同时上传的多个文件的大小的最大值的和，目前设置为10MB
	                upload.setSizeMax(1024*1024*10);
	                //4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
	                List<FileItem> list = upload.parseRequest(new ServletRequestContext(request));
	                for(FileItem item1 : list){
	                	System.err.println("");
	                    //如果fileitem中封装的是普通输入项的数据
	                    if(item1.isFormField()){
	                        String name1 = item1.getFieldName();
	                        //解决普通输入项的数据的中文乱码问题
	                        String value = item1.getString("UTF-8");
	                        //value = new String(value.getBytes("iso8859-1"),"UTF-8");
	                        System.out.println(name1 + "=!!" + value);
	                        if(name1.equals("title")){
	                        	title=value;
	                        }else if (name1.equals("tags")) {
								tags=value;
							}else if(name1.equals("comment")){
	                        	comment=value;
	                        }
	                        if(tipService.findBytitle(title)!=-1){
	                        	return "repeat";
	                        }
	                    }
	                }
	                
	                
	                for(FileItem item1 : list){
	                	System.err.println("");
	                    //如果fileitem中封装的是普通输入项的数据
	                    if(item1.isFormField()){
	                        String name1 = item1.getFieldName();
	                        //解决普通输入项的数据的中文乱码问题
	                        String value = item1.getString("UTF-8");
	                        //value = new String(value.getBytes("iso8859-1"),"UTF-8");
	                        System.out.println(name1 + "=!!" + value);
	                        if(name1.equals("title")){
	                        	title=value;
	                        }else if (name1.equals("tags")) {
								tags=value;
							}else if(name1.equals("comment")){
	                        	comment=value;
	                        }
	                    }else{//如果fileitem中封装的是上传文件
	                        //得到上传的文件名称，
	                        String filename = item1.getName();
	                        //System.out.println(filename);
	                        if(filename==null || filename.trim().equals("")){
	                            continue;
	                        }
	                        //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
	                        //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
	                        filename = filename.substring(filename.lastIndexOf("/")+1);
	                        filename = filename.substring(filename.lastIndexOf("\\")+1);
	                        //得到上传文件的扩展名
	                        fileExtName = filename.substring(filename.lastIndexOf(".")+1);
	                        //如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
	                        //System.out.println("上传的文件的扩展名是："+fileExtName);
	                       /* if(!allowedTypes.contains(fileExtName)){
	                        	message = "格式不对，只能上传"+allowedTypes;
	                        }*/
	                        //获取item中的上传文件的输入流
	                        InputStream in = item1.getInputStream();
	                        //得到文件保存的名称
	                        String saveFilename =(filename);
	                        //得到文件的保存目录
	                       
	                        System.err.println("filename"+saveFilename);
	        
	                        //创建一个文件输出流
	                        savePath =System.getProperty("user.dir")+"/upload/"+title;
	            	        //上传时生成的临时文件保存目
	            			File savefile = new File(savePath);   //这里写的不严谨  知识为了方便而已  正式请修改成savepath
	            	        if (!savefile.exists()) {
	            	            //创建临时目录
	            	        	savefile.mkdirs();
	            	        }
	                        FileOutputStream fos = new FileOutputStream(savePath + "/[version1]" + saveFilename);
	                        url= "/upload/"+title+"/[version1]" + saveFilename;
	                        //创建一个缓冲区
	                        byte buffer[] = new byte[1024];
	                        //判断输入流中的数据是否已经读完的标识
	                        int len = 0;
	                        //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
	                        while((len=in.read(buffer))>0){
	                            //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "/" + filename)当中
	                            fos.write(buffer, 0, len);
	                        }
	                        //关闭输入流
	                        in.close();
	                        //关闭输出流
	                        System.out.println("compelte");
	                        fos.close();
	                        //删除处理文件上传时生成的临时文件
	                        item1.delete();
	                        message = "文件上传成功！";
	                        request.setAttribute("1", "1");
	                    }
	                }
	            }
	        }catch (FileUploadBase.FileSizeLimitExceededException e) {
	            //e.printStackTrace();
	            message = "单个文件超出最大值！！！";
	        }catch (FileUploadBase.SizeLimitExceededException e) {
	            //e.printStackTrace();
	            message = "上传文件的总的大小超出限制的最大值！！！";
	            return "haha";
	        }catch (Exception e) {
	            message = "文件上传失败！";
	        } finally {
	        	//request.setAttribute("message", message);
	        	//request.getRequestDispatcher("/admin/additems.jsp").forward(request, response);
	        }
	        //!文件上传
	        
	        System.out.println("title:"+title);	
		 	System.out.println("tags:"+tags);
		 	Long uid=(Long) session.getAttribute("uid");
		 	String[] taglist=tags.split(",");
		 	System.out.println(uid);
		 	Tip tip = new Tip();
		 	tip.setTitle(title);
		 	System.out.println("length"+taglist.length);
		 	for (int i = 0; i < (taglist.length); i++) {
		 		System.out.println(i);
				if (i==0) {
					tip.setTag1id(new Long(taglist[0]));
				}else if (i==1) {
					tip.setTag2id(new Long(taglist[1]));
				}else if (i==2) {
					tip.setTag3id(new Long(taglist[2]));
				}else {
					break;
				}
			}
		 	tip.setComment(comment);
	        tip.setVersion(1);
	        tip.setUid(uid);
	        tip.setState(0);
	        tip.setUrl(url);
	        String content="";
	        WordExcelToHtml toHtml=new WordExcelToHtml();
			
			
	        tipService.saveTip(tip);
	        Long tipid=tipService.findBytitle(title);
	        Version version= new Version();
	        version.setTime(new Date());
	        version.settipid(tipid);
	        version.setversion(1);
	        version.setUid(uid);
	        version.setUrl(url);;
	        version.setComment(comment);
	        versionService.saveVersion(version);
	        
	        
			return "success";
	    }
	 
	 @RequestMapping("/updatetip")
	 @ResponseBody 
	    public String updateTip(Model model,HttpServletRequest request,HttpSession session){
		 	ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
	        TipService tipService =(TipService)context.getBean("tipService");
	        VersionService versionService =(VersionService)context.getBean("versionService");
	        Tip tip =null;
		 	String title="";
		 	String comment="";
		 	String url="";
		 	String fileExtName="";
		 	//得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
			System.err.println(new File(this.getClass().getResource("/").getPath()));
			String filePath = new File(this.getClass().getResource("/").getPath().replace("\\classes", "\\upload" )).toString();		
			String savePath = "";
			savePath =System.getProperty("user.dir")+"/upload";
	        //上传时生成的临时文件保存目
			File tmpFile = new File(savePath);   //这里写的不严谨  知识为了方便而已  正式请修改成savepath
	        if (!tmpFile.exists()) {
	            //创建临时目录
	            tmpFile.mkdirs();
	        }
	        String message = "";
	        try{
	            //使用Apache文件上传组件处理文件上传步骤：
	            //1、创建一个DiskFileItemFactory工厂
	            DiskFileItemFactory factory = new DiskFileItemFactory();
	            //设置工厂的缓冲区的大小，当上传的文件大小超过缓冲区的大小时，就会生成一个临时文件存放到指定的临时目录当中。
	            factory.setSizeThreshold(1024*100);//设置缓冲区的大小为100KB，如果不指定，那么缓冲区的大小默认是10KB
	            //设置上传时生成的临时文件的保存目录
	            factory.setRepository(tmpFile);
	            //2、创建一个文件上传解析器
	            ServletFileUpload upload = new ServletFileUpload(factory);
	            //监听文件上传进度
	            upload.setProgressListener(new ProgressListener(){
	                public void update(long pBytesRead, long pContentLength, int arg2) {
	                	System.out.println("文件大小为：" + pContentLength + ",当前已处理：" + pBytesRead);
	                }
	            });
	             //解决上传文件名的中文乱码
	            upload.setHeaderEncoding("UTF-8"); 
	            //3、判断提交上来的数据是否是上传表单的数据
	            if(ServletFileUpload.isMultipartContent(request)){
	            	System.err.println("jinru request");
	                //设置上传单个文件的大小的最大值，目前是设置为1024*1024字节，也就是1MB
	                upload.setFileSizeMax(1024*1024*10);
	                //设置上传文件总量的最大值，最大值=同时上传的多个文件的大小的最大值的和，目前设置为10MB
	                upload.setSizeMax(1024*1024*10);
	                //4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
	                List<FileItem> list = upload.parseRequest(new ServletRequestContext(request));
	                for(FileItem item1 : list){
	                	System.err.println("");
	                    //如果fileitem中封装的是普通输入项的数据
	                    if(item1.isFormField()){
	                        String name1 = item1.getFieldName();
	                        //解决普通输入项的数据的中文乱码问题
	                        String value = item1.getString("UTF-8");
	                        //value = new String(value.getBytes("iso8859-1"),"UTF-8");
	                        System.out.println(name1 + "=!!" + value);
	                        if(name1.equals("title")){
	                        	title=value;
	                        	tip=tipService.findTipBytitle(title);
	                        }else if(name1.equals("comment")){
	                        	comment=value;
	                        }
	                       
	                    }
	                }
	                for(FileItem item1 : list){
	                	System.err.println("");
	                    //如果fileitem中封装的是普通输入项的数据
	                    if(item1.isFormField()){
	                        String name1 = item1.getFieldName();
	                        //解决普通输入项的数据的中文乱码问题
	                        String value = item1.getString("UTF-8");
	                        //value = new String(value.getBytes("iso8859-1"),"UTF-8");
	                        System.out.println(name1 + "=!!" + value);
	                        if(name1.equals("title")){
	                        	title=value;
	                        }else if(name1.equals("comment")){
	                        	comment=value;
	                        }
	                    }else{//如果fileitem中封装的是上传文件
	                        //得到上传的文件名称，
	                        String filename = item1.getName();
	                        //System.out.println(filename);
	                        if(filename==null || filename.trim().equals("")){
	                            continue;
	                        }
	                        //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
	                        //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
	                        filename = filename.substring(filename.lastIndexOf("/")+1);
	                        filename = filename.substring(filename.lastIndexOf("\\")+1);
	                        //得到上传文件的扩展名
	                        fileExtName = filename.substring(filename.lastIndexOf(".")+1);
	                        //如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
	                        //System.out.println("上传的文件的扩展名是："+fileExtName);
	                       /* if(!allowedTypes.contains(fileExtName)){
	                        	message = "格式不对，只能上传"+allowedTypes;
	                        }*/
	                        //获取item中的上传文件的输入流
	                        InputStream in = item1.getInputStream();
	                        //得到文件保存的名称
	                        String saveFilename =(filename);
	                        //得到文件的保存目录
	                        System.out.println("filename"+saveFilename);
	        
	                        //创建一个文件输出流
	                        savePath =System.getProperty("user.dir")+"/upload/"+title;
	            	        //上传时生成的临时文件保存目
	            			File savefile = new File(savePath);   //这里写的不严谨  知识为了方便而已  正式请修改成savepath
	            	        if (!savefile.exists()) {
	            	            //创建临时目录
	            	        	savefile.mkdirs();
	            	        }
	                        FileOutputStream fos = new FileOutputStream(savePath + "/[version"+(tip.getVersion()+1)+"]" + saveFilename);
	                        url= "/upload/"+title+"/[version"+(tip.getVersion()+1)+"]" + saveFilename;
	                        //创建一个缓冲区
	                        byte buffer[] = new byte[1024];
	                        //判断输入流中的数据是否已经读完的标识
	                        int len = 0;
	                        //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
	                        while((len=in.read(buffer))>0){
	                            //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "/" + filename)当中
	                            fos.write(buffer, 0, len);
	                        }
	                        //关闭输入流
	                        in.close();
	                        //关闭输出流
	                        System.out.println("compelte");
	                        fos.close();
	                        //删除处理文件上传时生成的临时文件
	                        item1.delete();
	                        message = "文件上传成功！";
	                        request.setAttribute("1", "1");
	                    }
	                }
	            }
	        }catch (FileUploadBase.FileSizeLimitExceededException e) {
	            //e.printStackTrace();
	            message = "单个文件超出最大值！！！";
	        }catch (FileUploadBase.SizeLimitExceededException e) {
	            //e.printStackTrace();
	            message = "上传文件的总的大小超出限制的最大值！！！";
	            return "haha";
	        }catch (Exception e) {
	            message = "文件上传失败！";
	        } finally {
	        	//request.setAttribute("message", message);
	        	//request.getRequestDispatcher("/admin/additems.jsp").forward(request, response);
	        }
	        //!文件上传
	        
	        System.out.println("title:"+title);	
	       
		 	Long uid=(Long) session.getAttribute("uid");
		 	System.out.println(uid);

		 	tip.setComment(comment);
	        tip.setVersion(tip.getVersion()+1);
	        tip.setUid(uid);
	        tip.setUrl(url);
			
			
	        tipService.updateTip(tip);
	        Long tipid=tip.getId();
	        Version version= new Version();
	        version.setTime(new Date());
	        version.settipid(tipid);
	        version.setversion(tip.getVersion());
	        version.setUid(uid);
	        version.setUrl(url);;
	        version.setComment(comment);
	        versionService.saveVersion(version);
			return "success";
	    }
	 

	/*@RequestMapping("/upload")                   
	@ResponseBody
	public String upLoad(Model model,String username,String pwd,HttpSession session){   
		ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
		HashMap<String,Object> map=new HashMap<String, Object>();
		WordExcelToHtml toHtml=new WordExcelToHtml();
		String inputFile=(System.getProperty("user.dir")+"\\upload\\abc.doc");
		System.out.println(inputFile);
		try {
			toHtml.getWordAndStyle(inputFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
	}*/
	

	  
	    @RequestMapping("download")    
	    public ResponseEntity<byte[]> download(String title) throws IOException {  
			ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
	    	TipService tipService =(TipService)context.getBean("tipService");
			
			System.err.println(title);
			Tip tip=tipService.findTipBytitle(title);
			String url=tip.getUrl();

	        String path=System.getProperty("user.dir")+url;  
	        File file=new File(path);  
	        String fileName = url.substring(url.lastIndexOf("/")+1);
	        HttpHeaders headers = new HttpHeaders();    
	        //String fileName=new String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题  
	        headers.setContentDispositionFormData("attachment", fileName);   
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
	        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
	                                          headers, HttpStatus.CREATED);    
	    }    
	    
	    
	    
	    @RequestMapping("/downbyversion")    
	    public ResponseEntity<byte[]> downloadByVersion(Long version) throws IOException {  
			ApplicationContext context= null;String os = System.getProperty("os.name");  if(os.toLowerCase().startsWith("win")){  context=new ClassPathXmlApplicationContext("file:"+"src/main/webapp/WEB-INF/mvc-config.xml");}else{context=new ClassPathXmlApplicationContext("file:/home/cpta/tomcat8/webapps/ROOT/WEB-INF/mvc-config.xml");}
	    	VersionService versionService =(VersionService)context.getBean("versionService");
			

			Version version2= versionService.findVersion(version);
			String url=version2.getUrl();

	        String path=System.getProperty("user.dir")+url;  
	        File file=new File(path);  
	        String fileName = url.substring(url.lastIndexOf("/")+1);
	        HttpHeaders headers = new HttpHeaders();    
	        //String fileName=new String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题  
	        headers.setContentDispositionFormData("attachment", fileName);   
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
	        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
	                                          headers, HttpStatus.CREATED);    
	    }    
 
	

	
}
