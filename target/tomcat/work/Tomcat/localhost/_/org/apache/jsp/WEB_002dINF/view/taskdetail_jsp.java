/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-25 04:11:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.app.model.Customer;
import com.app.model.Task;
import com.app.dao.ItemDAO;
import java.util.Date;
import com.app.model.Itempic;
import java.util.List;
import javafx.scene.control.Alert;
import java.util.ArrayList;
import java.text.*;
import com.app.model.Item;
import com.app.model.Comment;

public final class taskdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Task Detail</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css1/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js/js.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js/payfor.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/admin/js/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/admin/js/layer/extend/layer.ext.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/admin/css/matrix-style2.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--webupload  -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fex.baidu.com/webuploader/css/bootstrap-theme.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fex.baidu.com/webuploader/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fex.baidu.com/webuploader/css/syntax.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/admin/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fex.baidu.com/webuploader/css/style.css\">   \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/admin/js/webuploader/js/webuploader.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/admin/js/webuploader/js/webuploader.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/customer/js/zhonglin.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css/shopping-mall-index.css\" />\r\n");
      out.write("<script src=\"/customer/js/jquery.knob.min.js\"></script>\r\n");
      out.write("<script src=\"/customer/js/jquery.ba-throttle-debounce.min.js\"></script>\r\n");
      out.write("<script src=\"/customer/js/jquery.redcountdown.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- \t<link rel=\"stylesheet\" href=\"/admin/css/matrix-media.css\" /> -->\r\n");
      out.write("<!-- \t<link href=\"/admin/css/font-awesome.css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("<!-- \t<link rel=\"stylesheet\" type=\"text/css\" href=\"/customer/css/shopping-mall-index.css\" /> -->\r\n");
      out.write("<!--     <link href=\"admin/js/editor/themes/default/css/umeditor.css\" type=\"text/css\" rel=\"stylesheet\"> -->\r\n");
      out.write("<!--     <script language=\"javascript\" src=\"http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js\"></script> -->\t\r\n");
      out.write("<!-- \t<link rel=\"stylesheet\" href=\"/admin/css/bootstrap-responsive.min.css\" /> -->\r\n");
      out.write("<!-- <link type=\"text/css\" href=\"/customer/css/css.css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var uploader = WebUploader.create({\r\n");
      out.write("\r\n");
      out.write("    // swf文件路径\r\n");
      out.write("    swf: BASE_URL + '/admin/js/webuploader/js/Uploader.swf',\r\n");
      out.write("\r\n");
      out.write("    // 文件接收服务端。\r\n");
      out.write("    server: '/upload/add',\r\n");
      out.write("\r\n");
      out.write("    // 选择文件的按钮。可选。\r\n");
      out.write("    // 内部根据当前运行是创建，可能是input元素，也可能是flash.\r\n");
      out.write("    pick: '#picker',\r\n");
      out.write("\r\n");
      out.write("    // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！\r\n");
      out.write("    resize: false\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//当有文件被添加进队列的时候\r\n");
      out.write("uploader.on( 'fileQueued', function( file ) {\r\n");
      out.write("    $list.append( '<div id=\"' + file.id + '\" class=\"item\">' +\r\n");
      out.write("        '<h4 class=\"info\">' + file.name + '</h4>' +\r\n");
      out.write("        '<p class=\"state\">等待上传...</p>' +\r\n");
      out.write("    '</div>' );\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//文件上传过程中创建进度条实时显示。\r\n");
      out.write("uploader.on( 'uploadProgress', function( file, percentage ) {\r\n");
      out.write("    var $li = $( '#'+file.id ),\r\n");
      out.write("        $percent = $li.find('.progress .progress-bar');\r\n");
      out.write("\r\n");
      out.write("    // 避免重复创建\r\n");
      out.write("    if ( !$percent.length ) {\r\n");
      out.write("        $percent = $('<div class=\"progress progress-striped active\">' +\r\n");
      out.write("          '<div class=\"progress-bar\" role=\"progressbar\" style=\"width: 0%\">' +\r\n");
      out.write("          '</div>' +\r\n");
      out.write("        '</div>').appendTo( $li ).find('.progress-bar');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $li.find('p.state').text('上传中');\r\n");
      out.write("\r\n");
      out.write("    $percent.css( 'width', percentage * 100 + '%' );\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("uploader.on( 'uploadSuccess', function( file ) {\r\n");
      out.write("    $( '#'+file.id ).find('p.state').text('已上传');\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("uploader.on( 'uploadError', function( file ) {\r\n");
      out.write("    $( '#'+file.id ).find('p.state').text('上传出错');\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("uploader.on( 'uploadComplete', function( file ) {\r\n");
      out.write("    $( '#'+file.id ).find('.progress').fadeOut();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function changerecid(reid,name){\r\n");
      out.write("\t$(\"#reid\").val(reid);\r\n");
      out.write("\t$(\"#cancelreid\").html(\"取消\");\r\n");
      out.write("\t$(\"#rename\").html(name);\r\n");
      out.write("\t$(\"#huifu\").html(\"回复\");\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deletecomment(id){\r\n");
      out.write("\r\n");
      out.write("\t$(\"#comm_\"+id).remove();\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype:'post',//可选get\r\n");
      out.write("\t\turl:\"/deletecomment\",//这里就是servlet访问的URL\r\n");
      out.write("\t\tdata: {id:id}, \r\n");
      out.write("\t\tdataType:\"text\",\t\r\n");
      out.write("\t\tsuccess:function(msg){\r\n");
      out.write("\t\t//这里是ajax提交成功后，程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！\r\n");
      out.write("\t\t\tif(msg==\"success\"){\r\n");
      out.write("\t\t\t \tlayer.msg('消息删除成功',{time:1000});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t layer.msg('不能回复自己的消息',{time:1000});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(){\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function cancelreid(){\r\n");
      out.write("\t$(\"#reid\").val(\"-1\");\r\n");
      out.write("\t$(\"#cancelreid\").html(\"\");\r\n");
      out.write("\t$(\"#rename\").html(\"\");\r\n");
      out.write("\t$(\"#huifu\").html(\"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t /* $(\"span[id^='detailprice_']\").each(function(){\r\n");
      out.write("\t\t\talert($(this).attr(\"class\"));\r\n");
      out.write("\t });   */\r\n");
      out.write("\t \r\n");
      out.write("\t  $.get(\"/comment\",{action:\"all\",date:new Date()},function(mess){})\r\n");
      out.write("\t  \t\t\t\r\n");
      out.write("\t  $(\"#sendcomment\").click(function(){\r\n");
      out.write("\t\t  text=$(\"#commenttext\").val();\r\n");
      out.write("\t\t  length=text.length\r\n");
      out.write("\t\t  if(length==\"0\"){\r\n");
      out.write("\t\t\t  layer.msg('请输入留言内容',{time:1000});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype:'post',//可选get\r\n");
      out.write("\t\t\t\t\t\turl:\"/sendcomment\",//这里就是servlet访问的URL\r\n");
      out.write("\t\t\t\t\t\tdata: {comment:text,taskid:window.location.href,reid:$(\"#reid\").val()}, \r\n");
      out.write("\t\t\t\t\t\tdataType:\"text\",\t\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(msg){\r\n");
      out.write("\t\t\t\t\t\t//这里是ajax提交成功后，程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！\r\n");
      out.write("\t\t\t\t\t\t\tif(msg==\"success\"){\r\n");
      out.write("\t\t\t\t\t\t\t \tlayer.msg('成功发送',{time:1000});\r\n");
      out.write("\t\t\t\t\t\t\t \twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t \t$(\"#commenttext\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#reid\").val(\"-1\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#cancelreid\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#rename\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#huifu\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t}else if(msg==\"nologin\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t layer.msg('请先登录',{time:1000});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\t layer.msg('不能回复自己的消息',{time:1000});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t  })\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t  $(\"#comment\").click(function(){\r\n");
      out.write("          $(\"div.buydlList\").css(\"display\",\"none\");\r\n");
      out.write("          $(\"div.commentList\").css(\"display\",\"block\");\r\n");
      out.write("\t  })\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" ");
Task task=(Task)request.getAttribute("task"); 
 List<Customer> customers=(List<Customer>)request.getAttribute("customers");
 
      out.write("\r\n");
      out.write(" <div id=\"content\" style=\"position: relative; left: 0px;\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-title\"><span class=\"icon\"><i class=\"icon-bookmark\"></i></span>\r\n");
      out.write("          \t\t\t</div> \r\n");
      out.write("\t\t\t\t\t<div class=\"widget-content nopadding\">\r\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" action=\"upload/save\" id=\"form\" name=\"form\" class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t            <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t              <label class=\"control-label\"><strong>Title:</strong></label>\r\n");
      out.write("\t\t\t\t              <div class=\"controls\">\r\n");
      out.write("\t\t\t\t               ");
      out.print(task.getTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t                ");
      out.write("   </div>\r\n");
      out.write("\t\t\t\t              <label class=\"control-label\"><strong>Newcomer:</strong></label>\r\n");
      out.write("\t\t\t\t              <div class=\"controls\">\r\n");
      out.write("\t\t\t\t              \t\t<p>");
for(Customer a : customers){ 
							  		if(a.getId()==task.getStudentid()){
							  			out.print(a.getUsername());
							  			break;
							  			
							  		}} 
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t              <label class=\"control-label\"><strong>Approver :</strong></label>\r\n");
      out.write("\t\t\t\t              <div class=\"controls\">\r\n");
      out.write("\t\t\t\t              \t");
for(Customer a : customers){ 
							  		if(a.getId()==task.getTeacherid()){
							  			out.print(a.getUsername());
							  			break;
							  			
							  		}} 
      out.write("\r\n");
      out.write("\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t           \r\n");
      out.write("\t\t\t\t              <label class=\"control-label\"><strong>Deadline:</strong></label>\r\n");
      out.write("\t\t\t\t              <div class=\"controls\">\r\n");
      out.write("\t\t\t\t              \t ");
out.print((task.getDeadline().getYear()+1900)+"-"+(task.getDeadline().getMonth()+1)+"-"+task.getDeadline().getDate()); 
      out.write("\r\n");
      out.write("\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t                 \r\n");
      out.write("\t\t\t\t              <label class=\"control-label\"><strong>Content:</strong></label>\r\n");
      out.write("\t\t\t\t              <div class=\"controls\">\r\n");
      out.write("\t\t\t\t                ");
      out.print(task.getContent() );
      out.write("\r\n");
      out.write("\t\t\t\t              </div>    \r\n");
      out.write("\t\t\t\t            \r\n");
      out.write("\t\t\t\t          \r\n");
      out.write("\t\t\t\t            </form>\r\n");
      out.write("          \t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \t<input type=\"file\" name=\"...\" size=\"15\" input enctype=\"multipart/form-data\" >  <br/> <button id=\"ctlBtn\" >开始上传</button> -->\r\n");
      out.write("  <div class=\"buyDtl2\" style=\"position:relative;left:-350px;\">\r\n");
      out.write(" <div class=\"dt-if2-r f-r\" style=\"width:968px;\">\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("                <ul class=\"if2-tit2\" style=\"width:966px;\">\r\n");
      out.write("                   \r\n");
      out.write("                    <li com-det=\"dt1\"><a href=\"JavaScript:;\">留言");
      out.write("</a></li>                 \r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </ul> \r\n");
      out.write("                <div style=\"border:1px solid #DBDBDB;\" com-det-show=\"dt1\">\r\n");
      out.write("                \t<div class=\"buydlList\" >\r\n");
      out.write("\t\t\t\t\t ");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div><!--buydlList/-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div com-det-show=\"dt1\">\r\n");
      out.write("                       <div class=\"commentList\" style=\"display:none\">\t\t\t\t\t  \t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t   </div><!--commentList/-->\r\n");
      out.write("                \t");
      out.write("\r\n");
      out.write("                \t<dl class=\"if2-r-box2\" >\r\n");
      out.write("                \t\r\n");
      out.write("                   \r\n");
      out.write("                    <div style=\"clear:both;\"/>\r\n");
      out.write("                </dl>\r\n");
      out.write("                \t<div class=\"if2-r-box3\">\r\n");
      out.write("                \t");
      out.write("\r\n");
      out.write("                    <div>\r\n");
      out.write("                    ");
  
                        
                     
					  /* 	for(Comment com:ItemComment){ */
						 	List<Comment> comments=(List<Comment>)request.getAttribute("comments"); 
						 	List<String> names=(List<String>)request.getAttribute("names"); 
						 	List<String> renames=(List<String>)request.getAttribute("renames"); 
						 	Long cid=(Long)session.getAttribute("cid");
						 

						 	int countofname=-1;
						 	int countofrename=0;
					  for(Comment comment:comments){
						 	 countofname++;
					  	 		
						  
      out.write("\t\t\t\t\t           \r\n");
      out.write("\t\t\t\t\t       <dl id=\"comm_");
out.print(comment.getId()); 
      out.write("\" class=\"comm\">               \t\r\n");
      out.write("\t                          <dd>                   \r\n");
      out.write("\t                        \t\r\n");
      out.write("\t                            <p style=\"display:inline\" class=\"b3-p1\">");
out.print(names.get(countofname)); 
	                            					if(comment.getRecid()!=-1)
	                            						{out.print("   回复        "+renames.get(countofrename));
	                            						 countofrename++;}
      out.write("</p>\r\n");
      out.write("\t                              <p style=\"display:inline;position:absolute;left:1200px;\" class=\"b3-p1\">\r\n");
      out.write("\t                           \t\t\t<a  href=\"javascript:changerecid(");
      out.print(comment.getCid());
      out.write(',');
      out.write('\'');
      out.print(names.get(countofname));
      out.write("')\">回复</a>   \r\n");
      out.write("\t                           \t\t\t<a style=\"display:");
if(cid!=null){if(cid==comment.getCid()){out.print("");}else{out.print("none");}}else{out.print("none");} 
      out.write("\"  href=\"javascript:deletecomment(");
out.print(comment.getId()); 
      out.write(")\">删除</a>\r\n");
      out.write("\t                            <p  style=\"position:relative;left:20px;\">");
 /* String[] time=(com.getTime()).toString().split(" ");  */  out.print(comment.getContent());
      out.write("</p>\r\n");
      out.write("\t                         \t <span href=\"#\" style=\"font-size:14px;position:relative;left:700px;\">\r\n");
      out.write("\t                            ");
/* String name=new CommentDAO().findUsernameByCid(com.getCId());
	                            String changeName="";
	                            if(name.substring(1,name.length()-1) !=null&&name.substring(1,name.length()-1) !=""){
	                            	String changeStr="";
	                            	for(i=1;i<name.length()-1;i++){
	                 			    changeStr = changeStr+"*";
	                 		      }
	                  		    changeName=name.substring(0,1)+changeStr+name.substring(name.length()-1,name.length());     
	                            }
	                            else{
	                            	changeName=name;
	                            } */
	                 		    out.print(comment.getTime().toString().split("\\.")[0]);
      out.write("</span>\r\n");
      out.write("\t                         \t<p style=\"display: none\" class=\"score\">");
out.print("分数"); 
      out.write("</p>\r\n");
      out.write("\t                          </dd>\r\n");
      out.write("\t            \t\t\t<div style=\"clear:both;\"></div>\r\n");
      out.write("\t                        </dl>\r\n");
      out.write("\t\t\t\t\t\t");

					  	}
					  
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t</div>\r\n");
      out.write(" \r\n");
      out.write(" </div><!--buyinfo/-->\r\n");
      out.write("      <br/><br/><br/><br/>\r\n");
      out.write("   <p style=\"display:inline;font-size:15px\">发送留言</p>\r\n");
      out.write("\r\n");
      out.write("   <br/>\r\n");
      out.write("   <p style=\"display:inline;font-size:15px\" id=\"huifu\" ></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <p style=\"display:inline;font-size: 15px\" id=\"rename\" ></p>&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"cancelreid\" style=\"display:inline;font-size: 15px\" href=\"javascript:cancelreid()\"></a>\r\n");
      out.write("   \t\t\t<input style=\"display:none\" id=\"reid\" value=\"\"></input>\r\n");
      out.write("\t\t\t\t\t  <textarea name=\"commenttext\" id=\"commenttext\" style=\"width:950px;height:80px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t   <div class=\"search f-r\" style=\"position:relative;left:350px; \" >       \r\n");
      out.write("            <div class=\"srh\">\r\n");
      out.write("                <button type=\"button\" id=\"sendcomment\" class=\"f-r\">发送留言</button>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("     <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\r\n");
      out.write(" <div style=\"position:relative;left:-200px;\">\r\n");
      out.write("<!--  <object type=\"text/x-scriptlet\"  data=\"/footer.html\" width=1349 height=300  ></object>  -->\r\n");
      out.write(" </div>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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