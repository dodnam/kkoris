/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-17 15:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/layout.jsp", Long.valueOf(1581477712099L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/index.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/layout.css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("\t.box_con{left:20px; right:20px; height:200px; background-color:#fcc6c9; position:absolute;}\r\n");
      out.write("\t.box{width: 150px; height:150px; border-radius:70%; overflow:hidden; background-color:#fff;top:20px;}\r\n");
      out.write("\t.profile{width: 100%; height:100%; object-fit:cover; display:block; margin:0px auto;}\r\n");
      out.write("\t.userTitle{font-size:40px; text-align:center; top:30px;}\r\n");
      out.write("\t.submit{line-height: 30px; text-align: center; background-color: #ffe3e4; color:#ff4e59;border: 1px solid #fcc6c9; border-radius: 5px; width: 80px; height: 35px; position: absolute;left:50%;top:20px; outline:none;}\r\n");
      out.write("\t.boxBody{position:absolute; top:250px;}\r\n");
      out.write("\t.submitBody{position:absolute; top:100px; margin:auto;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/18fd811fa1.js\" crossorigin=\"anonymous\"></script> <!-- sns아이콘 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/layout.css\"/> <!-- 작성할 css를 연결 -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header><!-- 헤더 -->\r\n");
      out.write("\t\t<h1 class=\"logo\"></h1>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("      \t\t<div class=\"login\">\r\n");
      out.write("\t        \t<div><a href=\"#\">로그인</a></div>\r\n");
      out.write("\t        \t<div><a href=\"#\">회원가입</a></div>\r\n");
      out.write("\t      \t</div>\r\n");
      out.write("\t      \t<ul id=\"navigator\">\r\n");
      out.write("\t        \t<li id=\"nav-home\">\r\n");
      out.write("\t         \t\t<a href=\"#\"><span>홈</span></a>\r\n");
      out.write("\t         \t</li>\r\n");
      out.write("\t         \t<li id=\"nav-hospital\">\r\n");
      out.write("\t         \t\t<span>병원 예약</span>\r\n");
      out.write("         \t\t\t<ul class=\"nav2-hospital\" id=\"nav2-hospital\">\r\n");
      out.write("         \t\t\t\t<li><a href=\"#\">병원 검색</a></li>\r\n");
      out.write("\t         \t\t\t<li><a href=\"#\">예약 확인</a></li>\r\n");
      out.write("\t         \t\t\t<li><a href=\"#\">병원 후기</a></li>\r\n");
      out.write("         \t\t\t</ul>\r\n");
      out.write("\t         \t</li>\r\n");
      out.write("\t         \t<li id=\"nav-community\">\r\n");
      out.write("\t         \t\t<span>커뮤니티</span>\r\n");
      out.write("         \t\t\t<ul class=\"nav2-community\" id=\"nav2-community\">\r\n");
      out.write("\t         \t\t\t<li><a href=\"#\">공지사항</a></li>\r\n");
      out.write("\t         \t\t\t<li><a href=\"#\">후기 모아보기</a></li>\r\n");
      out.write("\t         \t\t\t<li><a href=\"#\">지식 공유</a></li>\r\n");
      out.write("         \t\t\t</ul>\r\n");
      out.write("\t         \t</li>\r\n");
      out.write("\t         \t<li id=\"nav-calendar\">\r\n");
      out.write("\t         \t\t<a href=\"#\"><span>캘린더</span></a>\r\n");
      out.write("\t         \t</li>\r\n");
      out.write("\t         \t<li id=\"nav-mypage\">\r\n");
      out.write("\t         \t\t<span>마이페이지</span>\r\n");
      out.write("\t         \t\t<ul class=\"nav2-mypage\" id=\"nav2-mypage\">\r\n");
      out.write("\t\t         \t\t<li><a href=\"#\">내 정보</a></li>\r\n");
      out.write("\t\t         \t\t<li><a href=\"#\">예약 조회</a></li>\r\n");
      out.write("\t\t         \t\t<li><a href=\"#\">포인트샵</a></li>\r\n");
      out.write("\t\t         \t\t<li><a href=\"#\">내가 쓴 글 조회</a></li>\r\n");
      out.write("\t         \t\t</ul>\r\n");
      out.write("\t         \t</li>\r\n");
      out.write("\t      \t</ul>\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t    \t<dt class=\"blind\">sns</dt>\r\n");
      out.write("\t        <dd><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></dd>\r\n");
      out.write("\t        <dd><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></dd>\r\n");
      out.write("\t        <dd><a href=\"#\"><i class=\"fab fa-youtube\"></i></a></dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<footer></footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("    \t<div class=\"userTitle\">\r\n");
      out.write("\t\t\t프로필 관리\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"input-container\">\r\n");
      out.write("    \t\t<div class=\"box_con\">\r\n");
      out.write("\t    \t\t<div class=\"box\">\r\n");
      out.write("\t    \t\t\t<img class=\"profile\" src=\"");
      out.print( request.getContextPath() );
      out.write("/images/logo.png\">\r\n");
      out.write("\t    \t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\t\t    <div class=\"boxBody\">\t\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<p class=\"input-label\">이름</p><input type=\"text\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">닉네임</p><input type=\"text\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">비밀번호</p><input type=\"password\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">연락처</p><input type=\"text\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">이메일</p><input type=\"email\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">생년월일</p><input type=\"text\">\r\n");
      out.write("\t    \t\t\t<p class=\"input-label\">소개</p><input type=\"text\">\r\n");
      out.write("\t    \t\t</div>\r\n");
      out.write("\t    \t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"submitBody\">\r\n");
      out.write("    \t\t<div class=\"submit\">수정</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
