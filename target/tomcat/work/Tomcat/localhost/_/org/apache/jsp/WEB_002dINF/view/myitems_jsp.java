/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-09 15:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.app.dao.ItemDAO;
import com.app.dao.ContactDAO;
import java.text.SimpleDateFormat;
import com.app.model.Item;
import com.app.model.Order;
import com.app.model.Contact;
import java.util.*;

public final class myitems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/title.jsp", Long.valueOf(1468077832255L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>我的宝贝</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css1/style.css\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/customer/images/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css1/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js1/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js1/zhonglin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/admin/js/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/admin/js/layer/extend/layer.ext.js\"></script>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!-- <html xmlns=\"http://www.w3.org/1999/xhtml\"> -->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<link type=\"text/css\" href=\"main/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"main/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script src=\"main/js/jquery.SuperSlide.2.1.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"main/js/public.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("/* \r\n");
      out.write("function check1(){\r\n");
      out.write("\talert(\"123\");\r\n");
      out.write("    var cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar username=\"mao\";\r\n");
      out.write("\tvar score=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.score}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write(" \tif(username!=null&&username!=\" \"){\r\n");
      out.write(" \t\r\n");
      out.write("\t\t$(\"#tetleUsername\").css('display','inline');\r\n");
      out.write("\t\t$(\"#tetleUsername\").html('您好！'+username+'&nbsp&nbsp');\r\n");
      out.write("\t\t$(\"#uid\").html(cid);\r\n");
      out.write("\t\t$(\"#reg\").css('display','none');\r\n");
      out.write("\t\t$(\"#welcome\").css('display','none');\r\n");
      out.write("\t\t$(\"#login\").css('display','none');\r\n");
      out.write("\t\t$(\"#exit\").css('display','inline');\r\n");
      out.write("\t} \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\talert(\"12\");\r\n");
      out.write("}) */\r\n");
      out.write("/* function exit(){\r\n");
      out.write("\t$.get(\"/customer/handle\",{action:\"exit\",date:new Date()},function(mess){\r\n");
      out.write("\t\tif(mess==\"success\"){\t\t\t\r\n");
      out.write("\t\t \twindow.location = \"title.jsp\";\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\t\r\n");
      out.write("} */\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--顶部top-->\r\n");
      out.write("<div class=\"topMenu\">\r\n");
      out.write("  <div class=\"indexCont\">\r\n");
      out.write("    <ul class=\"fl tW tL\" style=\"width:320px;\">\r\n");
      out.write("\r\n");
      out.write("       <li class=\"b1\" id=\"welcome\">Welcome</li>\r\n");
      out.write("       <li class=\"b1\" id=\"tetleUsername\" style=\"display:none\"></li>\r\n");
      out.write("       ");
String uname=(String)session.getAttribute("uname"); 
      out.write("\r\n");
      out.write("       <li class=\"b2\"><a href=\"/login\" id=\"login\" style=\"color:#FD7306;margin-left:0px; display:");
if(uname!=null){out.print("none");}
      out.write("\">登录</a> \r\n");
      out.write("       ");
if(uname!=null) out.print(uname); 
      out.write("\r\n");
      out.write("       <li id=\"exit\" style=\"margin-left:2px;display:");
if(uname==null) out.print("none"); 
      out.write(";\"><a href='/logout'>注销</a></li>\r\n");
      out.write(" \r\n");
      out.write("    </ul>\r\n");
      out.write("    <div  class=\"fr\">\r\n");
      out.write("      <ul style=\"float:right;\" id=\"tMenu\" class=\"tW tmCont\">\r\n");
      out.write("        <li> <strong class=\"\"><a href=\"/orderlist\">首页</a></strong> </li>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\t\r\n");
      out.write("\t$(\"#submitsearch\").click(function(){\r\n");
      out.write("\t\t$(\"#searchtext\").val($(\"#inputtext\").val());\r\n");
      out.write("\t\tform4.submit();\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function dropmyitem(i){\r\n");
      out.write("\t$.get(\"/myitemsdrop\",{id:i},function(mess){\r\n");
      out.write("\t\t\t//request.getRequestDispatcher(\"customer/regSuccess.jsp\").forward(request, response);\r\n");
      out.write("\t\t\tif(mess==\"success\"){\t\t\t\r\n");
      out.write("\t\t\t\tlayer.msg('成功下架',{time:1000});\r\n");
      out.write("\t\t\t\t$(\"#state_\"+i).html(\"下架\");\r\n");
      out.write("\t\t\t\t$(\"#drop_\"+i).html(\" \");s\r\n");
      out.write("\t\t\t}else if(mess==\"fail\"){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* \tfunction turnPage() {\r\n");
      out.write("\t\tvar currentPage=$(\"#textPage\").val()\r\n");
      out.write("\t\tvar id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.cId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"/corder\",\r\n");
      out.write("\t\t\tdata:{\"action\":\"myOrder\",\"currentPage\":currentPage,\"id\":id},\r\n");
      out.write("\t\t\tsuccess:function(){},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\talert(\" \")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t} */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("   <form name=\"form4\" id=\"form4\" method=\"post\" action=\"/search\">\r\n");
      out.write("       <input id=\"action\" type=\"hidden\" name=\"action\" value=\"fuzzy\"/>\r\n");
      out.write("       <input id=\"searchtext\" type=\"hidden\" name=\"searchtext\" value=");
out.print("\""+request.getAttribute("searchtext")+"\"");  
      out.write("/>\r\n");
      out.write("       <!-- <input type=\"hidden\" id=\"brand\" name=\"brand\" value=\"\" /> -->\r\n");
      out.write("      </form>\r\n");
      out.write("    <!--logo search 开始-->\r\n");
      out.write("    <div class=\"hd-info1 w1200\">\r\n");
      out.write("    \t<div class=\"logo f-l\">\r\n");
      out.write("        \t<h1><a href=\"/customer/index.jsp\" title=\"\"><img src=\"/customer/images/logo.png\" /></a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search f-r\" style=\"margin-left:475px;\">\r\n");
      out.write("        \t<ul class=\"sp\" style=\"margin-bottom:0;\">\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"srh\">\r\n");
      out.write("            \t<div class=\"ipt f-l\">\r\n");
      out.write("                \t<input id=\"inputtext\" type=\"text\" placeholder=\"搜索商品...\" ss-search-show=\"sp\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <button id=\"submitsearch\" class=\"f-r\">搜 索</button>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <!--内容开始-->\r\n");
      out.write("    <div class=\"personal w1200\">\r\n");
      out.write("    \t<div class=\"personal-left f-l\">\r\n");
      out.write("        \t<div class=\"personal-l-tit\">\r\n");
      out.write("            \t<h3>个人中心</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write(" \t\t\t<li class=\"per-li8\"><a href=\"/orderlist\">我的订单<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li10\"><a href=\"/myitems\">我的宝贝<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li3\"><a href=\"/mycomment\">我的消息<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li3\"><a href=\"/mytalks\">我的聊天<span>></span></a></li>       \r\n");
      out.write("            \t<li class=\"per-li6\"><a href=\"/contactedit\">管理收货地址<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li3\"><a href=\"/changepwd\">修改密码<span>></span></a></li>     \r\n");
      out.write("            </ul>\r\n");
      out.write("       \t</div>\r\n");
      out.write("        <div class=\"purchase-records f-r\">\r\n");
      out.write("        \t<div class=\"pr-tit\">\r\n");
      out.write("            \t<P class=\"pr-p1\">宝贝</P>           \r\n");
      out.write("            \t<P class=\"pr-p2\">&nbsp;&nbsp;&nbsp;&nbsp;城市</P>\r\n");
      out.write("            \t<P class=\"pr-p3\">&nbsp;&nbsp;状态</P>\r\n");
      out.write("            \t<P class=\"pr-p4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价格</P>\r\n");
      out.write("            \t           \r\n");
      out.write("            \t<P class=\"pr-p6\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易操作</P>\r\n");
      out.write("            </div>\r\n");
      out.write("\t        ");
Object totalPageStr=request.getAttribute("totalPages");
	        if(totalPageStr!=null){
	        int totalPages=Integer.parseInt(String.valueOf(totalPageStr));
	        int currentPage=Integer.parseInt(String.valueOf(request.getAttribute("currentPage")));
	       /*  long cId=Integer.parseInt(String.valueOf(request.getAttribute("cId"))); */
	        SimpleDateFormat sdate=new SimpleDateFormat("yyyy-MM-dd");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
List<Item> itemList=(List<Item>)request.getAttribute("itemList");
			
			
      out.write("\r\n");
      out.write("\t\t\t");
if(totalPages>0){
      out.write("\t\t\r\n");
      out.write("\t\t\t\t");
for(Item item:itemList){
      out.write("\r\n");
      out.write("\t\t\t\t\t");

					/* ContactDAO contactDAO= new ContactDAO();
					Contact contact=contactDAO.findById(order.getContactid());  */
					  
						
						int state= item.getState();
						
					
      out.write("\r\n");
      out.write("\t\t\t<div class=pr-info>\r\n");
      out.write("\t\t\t\t<div class=\"pr-tit2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" value=\"\" name=\"hobby\"></input>\t\r\n");
      out.write("\t\t\t\t\t<p class=\"pr-p1\">上架时间：</p>\t\r\n");
      out.write("\t\t\t\t\t<p class=\"pr-p2\">");
 out.print(sdate.format(item.getTime()));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"pr-p2\"></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"pr-con\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pr-con-tu f-l\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/buyinfo?id=");
      out.print(item.getId() );
      out.write("\"><img src=\"");
      out.print(item.getPicurl() );
      out.write("\" width=\"80px\" height=\"80px\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"pr-con-bt f-l\" href=\"/buyinfo?id=");
      out.print(item.getId() );
      out.write('"');
      out.write('>');
out.print(item.getName());
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"pr-con-sz1 f-l\">\r\n");
      out.write("\t\t\t\t\t\t<span style=\"font-size:12px;\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
out.print(item.getCity());
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p id=\"state_");
      out.print(item.getId() );
      out.write("\" class=\"pr-con-sl f-l\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t ");

						 	if(state==1){
							      if((item.getCounttime()*24*60*60*1000+item.getTime().getTime()-new Date().getTime())<0){
							    	  state=4;
							      }
							      }
						 	switch(state){
						 	case 0: out.print("在售");break;
						 	case 1: out.print("竞拍中");break;
						 	case 2: out.print("已售");break;
						 	case 3: out.print("下架");break;
						 	case 4: out.print("流拍");break;
						 	case 5: Long cid= (Long)session.getAttribute("cid");  
						 		 		out.print("待支付");
			
						 			break;
						 			
						 	}
						 	
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"pr-con-yf f-l\">\r\n");
      out.write("\t\t\t\t\t\t<p>");
out.print(item.getNowprice());
      out.write("</p><p>");

							 Long cid= (Long)session.getAttribute("cid");
							 if(item.getCounttime()!=0){
								 
							/*  
							 if(state==1||state==5){
								 if(cid==item.getHolderid()){
									 out.print("(您为最高价)");
								 }else{
									 out.print("(有人出价高于您)");
								 }
							 } */
							 }
						
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pr-con-pj f-l\">\r\n");
      out.write("\t\t\t\t\t");
if(true){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a id=\"drop_");
      out.print(item.getId() );
      out.write("\" href=\"javascript:dropmyitem(");
      out.print(item.getId() );
      out.write(')');
      out.write('"');
      out.write('>');
if(state==1||state==0||state==5){out.print("下架"); } 
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<else>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("            <!--分页-->\r\n");
      out.write("            <div class=\"paging\">\r\n");
      out.write("            \t<div class=\"pag-left f-l\">\r\n");
      out.write("                \t<a href=\"/myitems?currentPage=");
out.print(currentPage==1?1:currentPage-1); 
      out.write("\" class=\"about left-r f-l\"><</a>\r\n");
      out.write("                    <ul class=\"left-m f-l\">\r\n");
      out.write("                    ");
if(totalPages<=8){
      out.write("\r\n");
      out.write("                    \t");
for(int i=1;i<=totalPages;i++){
                    		if(i==currentPage){
      out.write("\r\n");
      out.write("                    \t<li class=\"current\"><a href=\"#\">");
out.print(i); 
      out.write("</a></li>\r\n");
      out.write("                    \t\t");
}else{
      out.write("\r\n");
      out.write("                    \t<li><a href=\"/myitems?currentPage=");
out.print(i); 
      out.write('"');
      out.write('>');
out.print(i); 
      out.write("</a></li>                     \r\n");
      out.write("                        ");
}}}else{
      out.write("\r\n");
      out.write("                       \t\t ");
int startPage=1;
                       		 if(currentPage>=5){
                       			 if(currentPage+3<=totalPages){
	                       			 startPage=currentPage-4;
                       			 }else{
                       				 startPage=totalPages-7;
                       			 }
                       		 }
      out.write("\r\n");
      out.write("                        \t");
for(int i=0;i<=7;i++){
                        		if(startPage+i==currentPage){
      out.write("\r\n");
      out.write("                        \t\t\t<li class=\"current\"><a href=\"#\">");
out.print(currentPage);
      out.write("</a></li>\r\n");
      out.write("                        \t  ");
}else{
      out.write("\r\n");
      out.write("                        \t\t\t<li><a href=\"/myitems?currentPage=");
out.print(startPage+i); 
      out.write('"');
      out.write('>');
out.print(startPage+i); 
      out.write("</a></li>                      \t\t \r\n");
      out.write("                       \t");
}}}
      out.write("\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                \t<a href=\"/myitems?currentPage=");
out.print(currentPage==totalPages?totalPages:currentPage+1); 
      out.write("\" class=\"about left-l f-l\"></a>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("      \t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write(" <object type=\"text/x-scriptlet\"  data=\"/footer.html\" width=1349 height=300></object> \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
