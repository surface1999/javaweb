/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-11-09 08:44:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import func.funct;
import bean.SachBean;
import bean.loaiBean;
import java.util.ArrayList;
import bo.loaiBo;
import bo.cartBo;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1604668494233L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("func.funct");
    _jspx_imports_classes.add("bo.loaiBo");
    _jspx_imports_classes.add("bo.cartBo");
    _jspx_imports_classes.add("bean.SachBean");
    _jspx_imports_classes.add("bean.loaiBean");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<title>Surface1989</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"fontawesome/css/fontawesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"fontawesome/css/brands.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"fontawesome/css/solid.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/nav.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Bootstrap</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String id = null;
	if(request.getAttribute("id") != null){
		id = request.getAttribute("id").toString();
	}

      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark light bg-dark  text-light sticky\">\r\n");
      out.write("\t\t<a class=\"navbar-brand text-danger\" href=\"#\"><i><h4>Surface1989</h4></i></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarTogglerDemo02\"\r\n");
      out.write("\t\t\taria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse ml-5\" id=\"navbarTogglerDemo02\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active mr-2\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"/bootstrap/home\">Home <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Loại\r\n");
      out.write("\t\t\t\t\t\tsách</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Bán\r\n");
      out.write("\t\t\t\t\t\tchạy</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Tác\r\n");
      out.write("\t\t\t\t\t\tgiả</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">NXB</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Liên\r\n");
      out.write("\t\t\t\t\t\thệ</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Feedback</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right mr-3\">\r\n");
      out.write("\t\t\t\t");

					HttpSession ss = request.getSession();
					int n = 0;
					if (session.getAttribute("carts") != null) {
						cartBo carts = (cartBo) session.getAttribute("carts");
						n = carts.tongSL();
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"mr-3 smaller cursor\"><a class=\"a\" href=\"listcart\"><i class=\"fas fa-cart-arrow-down text-danger font-size\" style=\"font-size: 20px;\"></i><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"bg-success mr-1\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: .15rem; border-radius: 10px; font-size: 10px;\">");
      out.print(n);
      out.write("</span>&nbsp;Giỏ hàng</a></li>\r\n");
      out.write("\t\t\t\t");
if(id == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"smaller cursor\"><a  href=\"login\" class=\"a\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-sign-in-alt mr-2 text-danger\" style=\"font-size: 20px;\"></i>Đăng nhập</a></li>\r\n");
      out.write("\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"ml-5\"><p class=\" m-0 text-success\">ID: ");
      out.print(id );
      out.write("!</p></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"smaller cursor ml-2\"><a  href=\"log-out\" class=\"a\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-sign-out-alt mr-1 text-danger\" style=\"font-size: 20px;\"></i>Đăng xuất</a></li>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<script src=\"bootstrap/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');

		funct f = new funct();
	
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t<ul class=\"category\">\r\n");
      out.write("\t\t\t\t");

					ArrayList<loaiBean> listLoai = (ArrayList<loaiBean>) request.getAttribute("listLoai");
					for (loaiBean loai : listLoai) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"link-item\"><a\r\n");
      out.write("\t\t\t\t\thref=");
      out.print("category?ma=" + loai.getMaLoai());
      out.write('>');
      out.print(loai.getTenLoai());
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t");

				ArrayList<SachBean> listSach = null;
				int index = 0, countPage = 0;
				if (request.getAttribute("listSach") != null) {
					listSach = (ArrayList<SachBean>) request.getAttribute("listSach");
					index = Integer.parseInt(request.getAttribute("page").toString());
					countPage = Integer.parseInt(request.getAttribute("countPage").toString());
				}
			
      out.write("\r\n");
      out.write("\t\t\t<h5 class=\"text-danger ml-5 mt-3\">\r\n");
      out.write("\t\t\t\tCó:\r\n");
      out.write("\t\t\t\t");
      out.print(request.getAttribute("countItems") != null ? request.getAttribute("countItems") : 0);
      out.write("\r\n");
      out.write("\t\t\t\tkết quả.\r\n");
      out.write("\t\t\t</h5>\r\n");
      out.write("\t\t\t<div class=\"row m-3\">\r\n");
      out.write("\t\t\t\t");

					if (listSach != null) {
						for (SachBean sach : listSach) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card my-3\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 30rem; width: 17rem; background: #F7F7F4\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"");
      out.print("photo/" + sach.getAnh());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 20rem;\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"p-1 font-weight-bold ml-3 \">");
      out.print(sach.getTensach());
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"p-1 smaller ml-3\">");
      out.print(sach.getTacgia());
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"p-1 text-danger font-weight-bold ml-3\">");
      out.print(f.formart(sach.getGia()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tđ\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"p-1 text-success font-weight-bold smaller ml-3\"\r\n");
      out.write("\t\t\t\t\t\t\thref=");
      out.print("cart?c=th&ms=" + sach.getMasach());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer;\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-cart-plus text-warning\"></i> Thêm vào giỏ</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<nav class=\"mt-3\" aria-label=\"Page navigation example\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"pagination d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link text-dark\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Previous\"> <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

							if (request.getAttribute("loai") == null) {
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link text-dark\"\r\n");
      out.write("\t\t\t\t\t\t\thref=");
      out.print("home?page=" + i);
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

							}
									}
								} else if((request.getAttribute("loai").toString().equals("loai"))){
									String ma = request.getAttribute("ma").toString();
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link text-dark\"\r\n");
      out.write("\t\t\t\t\t\t\thref=");
      out.print("category?ma=" + ma + "&page=" + i);
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

							}
									}
								} else{
									String key = request.getAttribute("key").toString();
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link text-dark\"\r\n");
      out.write("\t\t\t\t\t\t\thref=");
      out.print("search?key=" + key + "&page=" + i);
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

							}
									}
								}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link text-dark\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<div class=\"card mt-4 mr-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card-header bg-dark text-light\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-search mr-1\"></i>Tìm kiếm\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<form action=\"search\" class=\"form-inline p-4\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t");

						String key = "Nhập tên sách cần tìm kiếm.";
						if (request.getAttribute("key") != null) {
							key = request.getAttribute("key").toString();
						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"");
      out.print(key);
      out.write("\" aria-label=\"Search\" name=\"key\">\r\n");
      out.write("\t\t\t\t\t<button\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-outline-success my-2 my-sm-0 btn-dark text-light\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"submit\">Search</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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
