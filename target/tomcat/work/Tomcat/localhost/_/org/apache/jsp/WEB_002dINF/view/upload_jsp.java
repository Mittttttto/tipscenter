/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-03-21 09:37:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/title.jsp", Long.valueOf(1458391544829L));
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
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"js/jquery.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/uploader/webuploader.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/uploader/webuploader.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link href=\"js/ueditor/themes/default/css/ueditor.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"js/ueditor/ueditor.config.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"js/ueditor/ueditor.all.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ueditor/lang/zh-cn/zh-cn.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<title>文件上传</title>\r\n");
      out.write("<style>\r\n");
      out.write("a{text-decoration:none; color:#333; font-weight:bold;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<body>\r\n");
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
      out.write("function check1(){\r\n");
      out.write("    var cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar username='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\tvar score=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.score}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write(" \tif(username!=null&&username!=\" \"){\r\n");
      out.write(" \t\r\n");
      out.write("\t\t$(\"#tetleUsername\").css('display','inline');\r\n");
      out.write("\t\t$(\"#tetleUsername\").html('您好！'+username+'&nbsp&nbsp'+'积分余额:'+score);\r\n");
      out.write("\t\t$(\"#uid\").html(cid);\r\n");
      out.write("\t\t$(\"#reg\").css('display','none');\r\n");
      out.write("\t\t$(\"#welcome\").css('display','none');\r\n");
      out.write("\t\t$(\"#login\").css('display','none');\r\n");
      out.write("\t\t$(\"#exit\").css('display','inline');\r\n");
      out.write("\t} \r\n");
      out.write("}\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body onload=\"check1()\">\r\n");
      out.write("<!--顶部top-->\r\n");
      out.write("<div class=\"topMenu\">\r\n");
      out.write("  <div class=\"indexCont\">\r\n");
      out.write("    <ul class=\"fl tW tL\" style=\"width:320px;\">\r\n");
      out.write("\r\n");
      out.write("       <li class=\"b1\" id=\"welcome\">您好，欢迎来到赫马商城</li>\r\n");
      out.write("       <li class=\"b1\" id=\"tetleUsername\" style=\"display:none\"></li>\r\n");
      out.write("       <li class=\"b2\"><a href=\"/login.jsp\" id=\"login\" style=\"color:#FD7306;margin-left:0px;\">登录</a> \r\n");
      out.write("       <li id=\"exit\" style=\"margin-left:2px;display:none;\"><a href='/customer?action=logout'>注销</a></li>\r\n");
      out.write("  \t   <li id=\"reg\" style=\"margin-left:2px;\"><a href=\"/reg.jsp\" >注册</a></li>\r\n");
      out.write(" \r\n");
      out.write("    </ul>\r\n");
      out.write("    <div  class=\"fr\">\r\n");
      out.write("      <ul style=\"float:right;\" id=\"tMenu\" class=\"tW tmCont\">\r\n");
      out.write("       <li> <strong class=\"/customer/index.jsp\"><a href=\"/customer/index.jsp\">首页</a></strong></li>\r\n");
      out.write("        <li> <strong class=\"\"><a href=\"/customer?action=cuscenter\">个人中心</a></strong> </li>\r\n");
      out.write("        <li> <strong class=\"/citem?action=cart\"><a href=\"/citem?action=cart\">购物车</a></strong></li>\r\n");
      out.write("        <li> <strong><a href=\"/customer?action=question\">问题反馈</a></strong></li>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<h1>发布宝贝</h1>\r\n");
      out.write("<form action=\"/demo/me/upload\" method=\"post\" name=\"form1\">\r\n");
      out.write("<input type=\"text\" id=\"title\" name=\"title\" size=\"50\" placeholder=\"商品标题\"/><p></p><p></p>\r\n");
      out.write("<div id=\"uploader-demo\">\r\n");
      out.write("    <!--用来存放item-->\r\n");
      out.write("    <div id=\"fileList\" class=\"uploader-list\"></div>\r\n");
      out.write("    <div id=\"filePicker\">选择图片</div>\r\n");
      out.write("    <input type=\"hidden\" id=\"files\" name=\"files\">\r\n");
      out.write("</div>\r\n");
      out.write("<!--style给定宽度可以影响编辑器的最终宽度-->\r\n");
      out.write("<script type=\"text/plain\" id=\"myEditor\" style=\"width:1000px;height:240px;\">\r\n");
      out.write("    <p>这里我可以写一些输入提示</p>\r\n");
      out.write("</script>\r\n");
      out.write("<input type=\"hidden\" name=\"mainPic\" id=\"mainPic\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"save\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"content\" id=\"content\"/><p></p>\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"立即发布\" onclick=\"return checkForm()\"/>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- <button class=\"btn\" onclick=\"getContent()\">获得内容</button>&nbsp;\r\n");
      out.write("<button class=\"btn\" onclick=\"getPlainTxt()\">获得带格式的纯文本</button> -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkForm(){\r\n");
      out.write("\t\tgetContent();\r\n");
      out.write("\t\tif($('#title').val()==''){\r\n");
      out.write("\t\t\talert('请输入标题');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("    //实例化编辑器\r\n");
      out.write("    var um = UE.getEditor('myEditor', {\r\n");
      out.write("\t\ttoolbars : [ [ 'fullscreen', 'undo', 'redo', 'bold',\r\n");
      out.write("\t\t\t\t\t\t'fontfamily', 'fontsize', 'strikethrough',\r\n");
      out.write("\t\t\t\t\t\t'underline', 'link', 'forecolor', ] ],\r\n");
      out.write("\t\t\t\tinitialFrameHeight : 150,\r\n");
      out.write("\t\t\t\tautoHeightEnabled : true,\r\n");
      out.write("\t\t\t\telementPathEnabled : false,\r\n");
      out.write("\t\t\t\tautoFloatEnabled : true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction getContent() {\r\n");
      out.write("\t\t        var description = ue.getContent();\r\n");
      out.write("\t\t        $(\"#descript\").val(description);\r\n");
      out.write("\t\t    }  \r\n");
      out.write("  /*function getPlainTxt() {\r\n");
      out.write("        var arr = [];\r\n");
      out.write("        arr.push(\"使用editor.getPlainTxt()方法可以获得编辑器的带格式的纯文本内容\");\r\n");
      out.write("        arr.push(\"内容为：\");\r\n");
      out.write("        arr.push(UM.getEditor('myEditor').getPlainTxt());      \r\n");
      out.write("        alert(arr.join('\\n'))\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    function getText() {\r\n");
      out.write("        //当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容\r\n");
      out.write("        var range = UM.getEditor('myEditor').selection.getRange();\r\n");
      out.write("        range.select();\r\n");
      out.write("        var txt = UM.getEditor('myEditor').selection.getText();\r\n");
      out.write("        alert(txt)\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getContentTxt() {\r\n");
      out.write("        var arr = [];\r\n");
      out.write("        arr.push(\"使用editor.getContentTxt()方法可以获得编辑器的纯文本内容\");\r\n");
      out.write("        arr.push(\"编辑器的纯文本内容为：\");\r\n");
      out.write("        arr.push(UM.getEditor('myEditor').getContentTxt());\r\n");
      out.write("        alert(arr.join(\"\\n\"));\r\n");
      out.write("    } */\r\n");
      out.write("    function hasContent() {\r\n");
      out.write("        var arr = [];\r\n");
      out.write("        arr.push(\"使用editor.hasContents()方法判断编辑器里是否有内容\");\r\n");
      out.write("        arr.push(\"判断结果为：\");\r\n");
      out.write("        arr.push(UM.getEditor('myEditor').hasContents());\r\n");
      out.write("        alert(arr.join(\"\\n\"));\r\n");
      out.write("    }\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//图片上传demo\r\n");
      out.write("jQuery(function() {\r\n");
      out.write("    var $ = jQuery,\r\n");
      out.write("        $list = $('#fileList'),\r\n");
      out.write("        // 优化retina, 在retina下这个值是2\r\n");
      out.write("        ratio = window.devicePixelRatio || 1,\r\n");
      out.write("\r\n");
      out.write("        // 缩略图大小\r\n");
      out.write("        thumbnailWidth = 100 * ratio,\r\n");
      out.write("        thumbnailHeight = 100 * ratio,\r\n");
      out.write("\r\n");
      out.write("        // Web Uploader实例\r\n");
      out.write("        uploader;\r\n");
      out.write("\r\n");
      out.write("    // 初始化Web Uploader\r\n");
      out.write("    uploader = WebUploader.create({\r\n");
      out.write("\r\n");
      out.write("        // 自动上传。\r\n");
      out.write("        auto: true,\r\n");
      out.write("\r\n");
      out.write("        // swf文件路径\r\n");
      out.write("        swf: '/demo/js/Uploader.swf',\r\n");
      out.write("\r\n");
      out.write("        // 文件接收服务端。\r\n");
      out.write("        server: '/demo/me/upload?action=',\r\n");
      out.write("\r\n");
      out.write("        // 选择文件的按钮。可选。\r\n");
      out.write("        // 内部根据当前运行是创建，可能是input元素，也可能是flash.\r\n");
      out.write("        pick: '#filePicker',\r\n");
      out.write("\r\n");
      out.write("        // 只允许选择文件，可选。\r\n");
      out.write("        accept: {\r\n");
      out.write("            title: 'Images',\r\n");
      out.write("            extensions: 'gif,jpg,jpeg,bmp,png',\r\n");
      out.write("            mimeTypes: 'image/*'\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 当有文件添加进来的时候\r\n");
      out.write("    uploader.on( 'fileQueued', function( file ) {\r\n");
      out.write("    \tif($('.file-item').length>2) {alert('最多上传 三张图片');return;}\r\n");
      out.write("        var $li = $(\r\n");
      out.write("                '<div id=\"' + file.id + '\" class=\"file-item thumbnail\">' +\r\n");
      out.write("                    '<img>' +\r\n");
      out.write("                    '<div class=\"info\" style=\"display:none\">' + file.name + '</div>' +\r\n");
      out.write("                '</div>'\r\n");
      out.write("                ),\r\n");
      out.write("            $img = $li.find('img');\r\n");
      out.write("\r\n");
      out.write("        $list.append( $li );\r\n");
      out.write("\r\n");
      out.write("        // 创建缩略图\r\n");
      out.write("        uploader.makeThumb( file, function( error, src ) {\r\n");
      out.write("            if ( error ) {\r\n");
      out.write("                $img.replaceWith('<span>不能预览</span>');\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $img.attr( 'src', src );\r\n");
      out.write("        }, thumbnailWidth, thumbnailHeight );\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 文件上传过程中创建进度条实时显示。\r\n");
      out.write("    uploader.on( 'uploadProgress', function( file, percentage ) {\r\n");
      out.write("        var $li = $( '#'+file.id ),\r\n");
      out.write("            $percent = $li.find('.progress span');\r\n");
      out.write("\r\n");
      out.write("        // 避免重复创建\r\n");
      out.write("        if ( !$percent.length ) {\r\n");
      out.write("            $percent = $('<p class=\"progress\"><span></span></p>')\r\n");
      out.write("                    .appendTo( $li )\r\n");
      out.write("                    .find('span');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $percent.css( 'width', percentage * 100 + '%' );\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 文件上传成功，给item添加成功class, 用样式标记上传成功。\r\n");
      out.write("    uploader.on( 'uploadSuccess', function( file, response ) {\r\n");
      out.write("        $( '#'+file.id ).addClass('upload-state-done');\r\n");
      out.write("        var checked = \"\";\r\n");
      out.write("        if($('.file-item').length==1){\r\n");
      out.write("        \tchecked = 'checked=\"checked\"';\r\n");
      out.write("        \t$('#mainPic').val(file.name);\r\n");
      out.write("        };\r\n");
      out.write("        var str = '<a href=\"javascript:deleteFile(\\''+file.id+'\\',\\''+file.name+'\\')\">删除</a>'\r\n");
      out.write("        \t\t+ '<input type=\"radio\" name=\"pic\" value=\"'+file.name+'\"' + checked +' onclick=\"javascript:selectMainPic(this.value)\"/>设为首图';\r\n");
      out.write("        $( '#'+file.id ).append(str);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 文件上传失败，现实上传出错。\r\n");
      out.write("    uploader.on( 'uploadError', function( file ) {\r\n");
      out.write("        var $li = $( '#'+file.id ),\r\n");
      out.write("            $error = $li.find('div.error');\r\n");
      out.write("\r\n");
      out.write("        // 避免重复创建\r\n");
      out.write("        if ( !$error.length ) {\r\n");
      out.write("            $error = $('<div class=\"error\"></div>').appendTo( $li );\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $error.text('上传失败');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 完成上传完了，成功或者失败，先删除进度条。\r\n");
      out.write("    uploader.on( 'uploadComplete', function( file, response ) {\r\n");
      out.write("        $( '#'+file.id ).find('.progress').remove();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("//删除所选图片\r\n");
      out.write("function deleteFile(id, filename){\r\n");
      out.write("\t$.getJSON(\"/demo/upload\", {action:\"remove\", filename:filename}, function(data){\r\n");
      out.write("\t\t $('#'+id).remove();\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("//设为主图\r\n");
      out.write("function selectMainPic(pic){\r\n");
      out.write("\t$('#mainPic').val(pic);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//window.onbeforeunload = function(){return \"Are you sure?\";}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
