/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-22 08:07:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.app.model.Task;
import javax.annotation.Resource;
import com.app.dao.ItemDAO;
import com.app.model.Item;
import com.app.model.Comment;
import java.text.SimpleDateFormat;
import java.util.*;

public final class mytasks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/title.jsp", Long.valueOf(1470795891902L));
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
      out.write("<title>My Tasks</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css1/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css1/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js1/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js1/zhonglin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js1/echarts.min.js\"></script>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/customer/images/favicon.ico\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t $(\"#submitsearch\").click(function(){\r\n");
      out.write("\t\t\t$(\"#searchtext\").val($(\"#inputtext\").val());\r\n");
      out.write("\t\t\tform4.submit();\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!-- <html xmlns=\"http://www.w3.org/1999/xhtml\"> -->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>标题</title>\r\n");
      out.write("<link type=\"text/css\" href=\"main/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"main/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script src=\"main/js/jquery.SuperSlide.2.1.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"main/js/public.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
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
      out.write(";\"><a href='/logout'>logout</a></li>\r\n");
      out.write(" \r\n");
      out.write("    </ul>\r\n");
      out.write("    <div  class=\"fr\">\r\n");
      out.write("      <ul style=\"float:right;\" id=\"tMenu\" class=\"tW tmCont\">\r\n");
      out.write("        <li> <strong class=\"\"><a href=\"/mytasks\">Task Center</a></strong> </li>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <form name=\"form4\" id=\"form4\" method=\"post\" action=\"/search\">\r\n");
      out.write("       <input id=\"action\" type=\"hidden\" name=\"action\" value=\"fuzzy\"/>\r\n");
      out.write("       <input id=\"searchtext\" type=\"hidden\" name=\"searchtext\" value=");
out.print("\""+request.getAttribute("searchtext")+"\"");  
      out.write("/>\r\n");
      out.write("       <!-- <input type=\"hidden\" id=\"brand\" name=\"brand\" value=\"\" /> -->\r\n");
      out.write("      </form>\r\n");
      out.write("    \r\n");
      out.write("    <!--logo search 开始-->\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("    <!--内容开始-->\r\n");
      out.write("    <div class=\"personal w1200\">\r\n");
      out.write("    \t<div class=\"personal-left f-l\">\r\n");
      out.write("        \t<div class=\"personal-l-tit\">\r\n");
      out.write("            \t<h3>Task Center</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li6\"><a href=\"/mytasks\">MyTasks<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li10\"><a href=\"/approvetask\">ApproveTask<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li3\"><a href=\"/mycomment\">MyMessage<span>></span></a></li>\r\n");
      out.write(" \t\t\t\t<li class=\"per-li3\"><a href=\"/mytalks\">MyStudent<span>></span></a></li>       \r\n");
      out.write("            \t<li class=\"per-li3\"><a href=\"/changepwd\">ChangePassword<span>></span></a></li>       \r\n");
      out.write("           \t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("            \t<div class=\"member f-r\">\r\n");
      out.write("            <div class=\"mem-info1\">\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("                \t<h3>Choose State</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("              ");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                \r\n");
      out.write("            <div class=\"mem-info2\">\r\n");
      out.write("            \t\r\n");
      out.write("                <ul>\r\n");
      out.write("                \t<li class=\"current\" jfhq=\"qb\"><a href=\"JavaScript:;\">All</a></li>\r\n");
      out.write("                \t<li jfhq=\"gmsp\"><a href=\"JavaScript:;\">Deing Done</a></li>\r\n");
      out.write("                \t<li jfhq=\"hema\"><a href=\"JavaScript:;\">Done</a></li>\r\n");
      out.write("            \r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div></div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
List<Task> tasks = (List<Task>)(request.getAttribute("tasks"));
    	int num=0;
    	for(Task c:tasks){
    		if(c.getStage()>num){
    			num=c.getStage();
    		}
    	}
    	for(int i=0;i<num;i++){
    		int countOfDone=0;
    		int countOfBeingDone=0;
    		int countOfFail=0;
    		
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"member f-r\">\r\n");
      out.write("            <div class=\"mem-info1\">\r\n");
      out.write("            \t<div class=\"title\">\r\n");
      out.write("                \t<h3>Stage");
      out.print((i+1) );
      out.write("</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("              ");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                \r\n");
      out.write("            <div class=\"mem-info2\">\r\n");
      out.write("            \t\r\n");
      out.write("                <!-- <ul>\r\n");
      out.write("                \t<li class=\"current\" jfhq=\"qb\"><a href=\"JavaScript:;\">All</a></li>\r\n");
      out.write("                \t<li jfhq=\"gmsp\"><a href=\"JavaScript:;\">Deing Done</a></li>\r\n");
      out.write("                \t<li jfhq=\"hema\"><a href=\"JavaScript:;\">Done</a></li>\r\n");
      out.write("            \r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </ul> -->\r\n");
      out.write("                <div class=\"mem-con2\">\r\n");
      out.write("                \r\n");
      out.write("                \t");

                	
                		
                		
                	
                	for(Task c:tasks){
                		if(c.getState()==3){
                			continue;
                		}
                		if(c.getStage()!=(i+1)){
                			continue;
                		}
                	
				 	
                	/* for(ExpLog expLog:expList){
                		String type;
                		if(expLog.getType()==0){
                			type="减少  -"; */
                		
      out.write("\r\n");
      out.write("                \t<dl hpjf=\"");

                		if(c.getState()==0){
                			if(c.getDeadline().getTime()<new Date().getTime()){
                        		out.print("hema");
                        	}else{
                        		out.print("gmsp");
                        	}
                		}else{
                			out.print("hema");
                		}
                	
      out.write("\">                         \t\r\n");
      out.write("                        <dt>\r\n");
      out.write("                        \t<h3><a style=\"width:80px\" href=\"/taskdetail?id=");
out.print(c.getId());
      out.write('"');
      out.write('>');
out.print(c.getTitle());
      out.write("</a></h3>\r\n");
      out.write("                        \r\n");
      out.write("                     \r\n");
      out.write("                            <p>");
if(c.getContent().length()>20){
	                        		out.print(c.getContent().substring(0,19));
	                        	}else{
	                        		out.print(c.getContent());
	                        	} 
      out.write("</p>                           \r\n");
      out.write("                        </dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                           ");
if(c.getState()==1){
                       		out.print("Done");
                       		countOfDone++;
                       		}else if(c.getDeadline().getTime()<new Date().getTime()){
                        		out.print("Fail");
                        		countOfFail++;
                        	}else{
                            	if(c.getState()==0){
                        		out.print("Being Done");
                        		countOfBeingDone++;
                        		}
                        	}
      out.write("<span style=\"color:orange;\">");
out.print((c.getDeadline().getYear()+1900)+"-"+(c.getDeadline().getMonth()+1)+"-"+c.getDeadline().getDate());
      out.write("</span><span></span>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                 ");
      out.write("\r\n");
      out.write("                    \t");
      out.write("\r\n");
      out.write("                    \t\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("                  <div id=\"pie");
      out.print(i );
      out.write("\" style=\"width: 600px;height:400px;\"></div>\r\n");
      out.write("                   <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t        // 基于准备好的dom，初始化echarts实例\r\n");
      out.write("\t\t\t\t        var myChart = echarts.init(document.getElementById('pie");
      out.print(i );
      out.write("'));\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t        // 指定图表的配置项和数据\r\n");
      out.write("\t\t\t\t        option = {\r\n");
      out.write("\t\t\t\t    backgroundColor: '#fff',\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    title: {\r\n");
      out.write("\t\t\t\t        text: 'Stage ");
      out.print((i+1));
      out.write("',\r\n");
      out.write("\t\t\t\t        left: 'center',\r\n");
      out.write("\t\t\t\t        top: 20,\r\n");
      out.write("\t\t\t\t        textStyle: {\r\n");
      out.write("\t\t\t\t            color: '#ccc'\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    tooltip : {\r\n");
      out.write("\t\t\t\t        trigger: 'item',\r\n");
      out.write("\t\t\t\t        formatter: \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    visualMap: {\r\n");
      out.write("\t\t\t\t        show: false,\r\n");
      out.write("\t\t\t\t        min: 80,\r\n");
      out.write("\t\t\t\t        max: 600,\r\n");
      out.write("\t\t\t\t        inRange: {\r\n");
      out.write("\t\t\t\t            colorLightness: [0, 1]\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t    series : [\r\n");
      out.write("\t\t\t\t        {\r\n");
      out.write("\t\t\t\t            name:'Approved Rate',\r\n");
      out.write("\t\t\t\t            type:'pie',\r\n");
      out.write("\t\t\t\t            radius : '30%',\r\n");
      out.write("\t\t\t\t            center: ['50%', '50%'],\r\n");
      out.write("\t\t\t\t            data:[\r\n");
      out.write("\t\t\t\t                {value:");
      out.print(countOfDone);
      out.write(", name:'done'},\r\n");
      out.write("\t\t\t\t                {value:");
      out.print(countOfBeingDone);
      out.write(", name:'being done'},\r\n");
      out.write("\t\t\t\t                {value:");
      out.print(countOfFail);
      out.write(", name:'fail'},\r\n");
      out.write("\t\t\t\t                  ].sort(function (a, b) { return a.value - b.value}),\r\n");
      out.write("\t\t\t\t            roseType: 'angle',\r\n");
      out.write("\t\t\t\t            label: {\r\n");
      out.write("\t\t\t\t                normal: {\r\n");
      out.write("\t\t\t\t                    textStyle: {\r\n");
      out.write("\t\t\t\t                        color: 'rgba(0, 0, 0, 0.3)'\r\n");
      out.write("\t\t\t\t                    }\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            labelLine: {\r\n");
      out.write("\t\t\t\t                normal: {\r\n");
      out.write("\t\t\t\t                    lineStyle: {\r\n");
      out.write("\t\t\t\t                        color: 'rgba(0, 0, 0, 0.3)'\r\n");
      out.write("\t\t\t\t                    },\r\n");
      out.write("\t\t\t\t                    smooth: 0.2,\r\n");
      out.write("\t\t\t\t                    length: 10,\r\n");
      out.write("\t\t\t\t                    length2: 20\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            itemStyle: {\r\n");
      out.write("\t\t\t\t                normal: {\r\n");
      out.write("\t\t\t\t                    color: '#c23531',\r\n");
      out.write("\t\t\t\t                    shadowBlur: 200,\r\n");
      out.write("\t\t\t\t                    shadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            }\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t    ]\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t        // 使用刚指定的配置项和数据显示图表。\r\n");
      out.write("\t\t\t\t        myChart.setOption(option);\r\n");
      out.write("\t\t\t\t    </script>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
} 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<object type=\"text/x-scriptlet\"  data=\"/footer.html\" width=1349 height=300></object> \r\n");
      out.write("</html>\r\n");
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
