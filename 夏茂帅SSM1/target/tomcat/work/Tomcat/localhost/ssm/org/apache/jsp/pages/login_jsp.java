/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-21 07:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>会员登录</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-inner .item img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .row div {\r\n");
      out.write("\t/* position:relative;\r\n");
      out.write("\t\t\t\t float:left; */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("font {\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tpadding-right: 17px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- 登录 注册 购物车... -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t<img src=\"../img/logo2.png\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t<img src=\"../img/header.png\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-3\" style=\"padding-top:20px\">\r\n");
      out.write("\t\t<ol class=\"list-inline\">\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">登录</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"register.jsp\">注册</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"cart.jsp\">购物车</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"order_list.jsp\">我的订单</a></li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 导航条 -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">首页</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">公务员考试<span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">高考</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">中考</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">专升本</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\"\r\n");
      out.write("\t\tstyle=\"width: 100%; height: 460px; background: #FF2C4C url('../images/loginbg.jpg') no-repeat;\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<!--<img src=\"./img/login.jpg\" width=\"500\" height=\"330\" alt=\"会员登录\" title=\"会员登录\">-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;\">\r\n");
      out.write("\t\t\t\t\t<font>会员登录</font>USER LOGIN\r\n");
      out.write("\t\t\t\t\t<div style=\"color: red\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" method=\"post\" action=\"/ssm/user/login.do\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" style=\"width:500px\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"col-sm-2 control-label\">用户名</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入用户名\" name=\"username\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\"  style=\"width:500px\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"inputPassword3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label> <input type=\"checkbox\"> 自动登录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\"> 记住用户名\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" width=\"100\" value=\"登录\" name=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"background: url('../images/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div style=\"margin-top:50px;\">\r\n");
      out.write("\t\t<img src=\"../img/footer.jpg\" width=\"100%\" height=\"78\" alt=\"我们的优势\" title=\"我们的优势\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"text-align: center;margin-top: 5px;\">\r\n");
      out.write("\t\t<ul class=\"list-inline\">\r\n");
      out.write("\t\t\t<li><a href=\"info.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t<li><a>联系我们</a></li>\r\n");
      out.write("\t\t\t<li><a>招贤纳士</a></li>\r\n");
      out.write("\t\t\t<li><a>法律声明</a></li>\r\n");
      out.write("\t\t\t<li><a>友情链接</a></li>\r\n");
      out.write("\t\t\t<li><a>支付方式</a></li>\r\n");
      out.write("\t\t\t<li><a>配送方式</a></li>\r\n");
      out.write("\t\t\t<li><a>服务声明</a></li>\r\n");
      out.write("\t\t\t<li><a>广告声明</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"text-align: center;margin-top: 5px;margin-bottom:20px;\">\r\n");
      out.write("\t\tCopyright &copy; 2005-2018 黑马商城 版权所有\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
