/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-11-26 08:59:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.billBean;
import bo.payBo;
import bean.purchaseHistoryBean;
import func.funct;
import bean.cartBean;
import bean.SachBean;
import java.util.ArrayList;
import bo.cartBo;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1606360092065L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.purchaseHistoryBean");
    _jspx_imports_classes.add("func.funct");
    _jspx_imports_classes.add("bo.cartBo");
    _jspx_imports_classes.add("bean.cartBean");
    _jspx_imports_classes.add("bean.SachBean");
    _jspx_imports_classes.add("bo.payBo");
    _jspx_imports_classes.add("bean.billBean");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7e31e7a48c.js\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Cart.css\">\r\n");
      out.write("<title>Cart</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7e31e7a48c.js\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"fontawesome/css/fontawesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"fontawesome/css/brands.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"fontawesome/css/solid.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/Style1.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/Nav.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Bootstrap</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String id = null;
		if (request.getAttribute("id") != null) {
			id = request.getAttribute("id").toString();
		}
	
      out.write("\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"navbar navbar-expand-lg navbar-dark light bg-dark  text-light sticky\">\r\n");
      out.write("\t\t<a class=\"navbar-brand text-danger mr-5\" href=\"home\"><i><h4>Surface1989</h4></i></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarTogglerDemo02\"\r\n");
      out.write("\t\t\taria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"home\">Home\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Bán\r\n");
      out.write("\t\t\t\t\t\tchạy</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Tác\r\n");
      out.write("\t\t\t\t\t\tgiả</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">NXB</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-2\"><a class=\"nav-link\" href=\"#\">Liên\r\n");
      out.write("\t\t\t\t\t\thệ</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form action=\"search\" class=\"mr-5\" method=\"get\" style=\"width: 30%;\">\r\n");
      out.write("\t\t\t\t");

					String key = "Nhập tên sách cần tìm kiếm";
					if (request.getAttribute("key") != null) {
						key = request.getAttribute("key").toString();
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"key\" class=\"input\" placeholder=\"");
      out.print(key);
      out.write("\">\r\n");
      out.write("\t\t\t\t<button class=\"button text-danger mr-1\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-search\" style=\"font-size: 20px;\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right mr-3\">\r\n");
      out.write("\t\t\t\t");

					HttpSession ss = request.getSession();
					int n = 0;
					if (session.getAttribute("carts") != null) {
						cartBo carts = (cartBo) session.getAttribute("carts");
						n = carts.tongSL();
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"mr-4 smaller cursor\"><a class=\"a\" href=\"listcart\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-cart-arrow-down text-danger font-size\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 20px;\"></i><span class=\"bg-success mr-1\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: .15rem; border-radius: 10px; font-size: 10px;\">");
      out.print(n);
      out.write("</span>&nbsp;Giỏ\r\n");
      out.write("\t\t\t\t\t\thàng</a></li>\r\n");
      out.write("\t\t\t\t");

					if (id == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"smaller cursor mr-1 ml-4\"><a href=\"login\" class=\"a\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-sign-in-alt mr-1 text-danger\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 20px;\"></i>Đăng nhập</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"smaller cursor\"><a href=\"sign-in\" class=\"a\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-users ml-2 mr-1 text-danger\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 20px;\"></i>Đăng ký</a> ");

 	} else {
 
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"ml-5\"><p class=\" m-0 text-success\">\r\n");
      out.write("\t\t\t\t\t\tHi!\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(id);
      out.write("</p></li>\r\n");
      out.write("\t\t\t\t<li class=\"smaller cursor ml-2\"><a href=\"log-out\" class=\"a\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-sign-out-alt mr-1 text-danger\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 20px;\"></i>Đăng xuất</a></li>\r\n");
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
		ArrayList<billBean> history = null;
		int sum = 0;
		if (request.getAttribute("history") != null) {
			history = (ArrayList<billBean>) request.getAttribute("history");
			sum = history.size();
		}
	
      out.write("\r\n");
      out.write("\t<div class=\"py-3 d-flex justify-content-between\"\r\n");
      out.write("\t\tstyle=\"border-bottom: solid 1px #DFD7D7\">\r\n");
      out.write("\t\t<p class=\"m-0 ml-5 font-weight-bold text-danger\">\r\n");
      out.write("\t\t\t<span class=\"text-success\"\r\n");
      out.write("\t\t\t\tstyle=\"font-size: 17px; text-transform: capitalize;\">Chào ");
      out.print(id);
      out.write("!&nbsp;\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t");

				if (sum != 0) {
			
      out.write("\r\n");
      out.write("\t\t\tĐây là lịch sử mua hàng của bạn.\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\tHiện tại lịch sử mua hàng của bạn chưa có sản phẩm nào.\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"session d-flex justify-content-center\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");

				if (history != null) {
					int len = history.size();
					for (int j = len - 1; j >= 0; j--) {
						billBean x = history.get(j);
						String o_ID = x.getOrderID();
						int orderID = Integer.parseInt(o_ID);
						if (orderID >= 1 && orderID <= 9) {
							o_ID = "0" + o_ID;
						}
			
      out.write("\r\n");
      out.write("\t\t\t<table class=\"cart m-5\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\" colspan=\"2\"><span class=\"font-weight-bold\">Mã\r\n");
      out.write("\t\t\t\t\t\t\tđơn hàng:&nbsp;&nbsp;<span class=\"font-weight-bold text-danger\">");
      out.print(o_ID);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><span class=\"font-weight-bold\">Ngày\r\n");
      out.write("\t\t\t\t\t\t\tmua:&nbsp;");
      out.print(x.getDate());
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"bg-dark text-light\">\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">STT</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Hình ảnh</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\"><div style=\"width: 22rem;\">Tên sách</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Trạng thái</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\"><div style=\"width: 5rem\">Giá bán</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Số lượng</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\"><div style=\"width: 6rem\">Thành tiền</div></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					int i = 1;
							ArrayList<purchaseHistoryBean> list = x.getListItem();
							for (purchaseHistoryBean item : list) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr ");
if (i % 2 == 0) {
      out.write(" style=\"background: #ffff;\" ");
}
      out.write(">\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(i);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><img alt=\"\" src=\"");
      out.print(item.getImg());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 4rem; width: 3.4rem;\"></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(item.getTensach());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><p\r\n");
      out.write("\t\t\t\t\t\t\tclass=");
      out.print(item.getStatus() == 0 ? "text-danger" : "text-success");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-weight: bold;\">");
      out.print(item.getStatus() == 0 ? "Chưa thanh toán" : "Đã thanh toán");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(f.formart(item.getGiaBan()));
      out.write(" đ</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(item.getSoLuong());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(f.formart(item.getThanhTien()));
      out.write(" đ</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					i++;
							}
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr ");
if (i % 2 == 0) {
      out.write(" style=\"background: #ffff;\" ");
}
      out.write(">\r\n");
      out.write("\t\t\t\t\t<td colspan=\"5\" class=\"pr\"><b>Tổng cộng</b></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><b>");
      out.print(x.getTongSL());
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t<td><b class=\"text-danger pr\">");
      out.print(f.formart(x.getTongTien()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tđ</b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
				}
			
      out.write("\r\n");
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
