/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-11 07:35:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.findpassword;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class step_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>找回密码step1</title>\r\n");
      out.write("<link type=\"text/css\" href=\"customer/css/css.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"customer/css/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"customer/js/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"customer/js/js.js\"></script>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"customer/images/favicon.ico\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"admin/js/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"admin/js/layer/extend/layer.ext.js\"></script>\r\n");
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
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function finduser(){\r\n");
      out.write("\t$.getJSON(\"step_1\",{action:\"step_1\",input:$(\"#input\").val(),date:new Date()},function(data){\r\n");
      out.write("\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\talert(\"没有此账号\");\r\n");
      out.write("\t\t\tlayer.msg('没有此账号',{time:1000}); \r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tform.submit(); \r\n");
      out.write("\t\t\t//return true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("</div>\r\n");
      out.write("<form method=\"post\" action=\"jumpto2\"  name=\"form\">\r\n");
      out.write("<div class=\"password-con\">   \r\n");
      out.write("    \t<div class=\"psw psw2\">\r\n");
      out.write("    \t\t<p class=\"psw-p1\">账户</p>\r\n");
      out.write(" <input type=\"text\" placeholder=\"手机号/用户名/邮箱\"  style=\"width:315px;margin-right:-5px; \"id=\"input\" name=\"input\" />\r\n");
      out.write("<input type=\"hidden\" id=\"action\" name=\"action\" value=\"jumpto2\"  >\r\n");
      out.write("            <button  type=\"button\" value=\"确认\"  style=\"width:80px; height:47px;\" onclick=\"finduser()\">下一步</button>      \r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<object type=\"text/x-scriptlet\" style=\"position:fixed;bottom:0px;left:0px;\" data=\"/footer.html\" width=1349 height=300></object> \r\n");
      out.write("</body>\r\n");
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
