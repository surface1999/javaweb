/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-11-10 08:26:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import func.funct;
import bean.cartBean;
import bean.SachBean;
import java.util.ArrayList;
import bo.cartBo;

public final class session_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bo.cartBo");
    _jspx_imports_classes.add("bean.cartBean");
    _jspx_imports_classes.add("bean.SachBean");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/cart.css\">\r\n");
      out.write("<title>Cart</title>\r\n");
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
		ArrayList<cartBean> listCart = new ArrayList<cartBean>();
		cartBo carts = null;
		int sum = 0;
		if (request.getAttribute("carts") != null) {
			carts = (cartBo) request.getAttribute("carts");
			listCart = carts.getListCart();
			sum = listCart.size();
		}
	
      out.write("\r\n");
      out.write("\t<div class=\"my-3 ml-5 d-flex justify-content-between\">\r\n");
      out.write("\t\t<p class=\"m-0 font-weight-bold text-danger\">\r\n");
      out.write("\t\t\t");

				if (sum != 0) {
					if (request.getAttribute("id") != null) {
						id = request.getAttribute("id").toString();
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<span class=\"text-success\"\r\n");
      out.write("\t\t\t\tstyle=\"font-size: 18px; text-transform: capitalize;\">Chào ");
      out.print(id);
      out.write("!&nbsp;\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\tGiỏ hàng của bạn có\r\n");
      out.write("\t\t\t");
      out.print(sum);
      out.write("\r\n");
      out.write("\t\t\tsản phẩm.\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\tHiện tại giỏ hàng của bạn không có sản phẩm nào.\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t");

			if (id != null) {
		
      out.write("\r\n");
      out.write("\t\t<a class=\"btn btn-dark mr-5\" href=");
      out.print("history?userID=" + id);
      out.write(">Xem\r\n");
      out.write("\t\t\tlịch sử mua hàng của bạn</a>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		if (listCart.size() > 0) {
	
      out.write("\r\n");
      out.write("\t<div class=\"session d-flex justify-content-center\">\r\n");
      out.write("\t\t<form action=\"cart\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"cart m-4\">\r\n");
      out.write("\t\t\t\t<tr class=\"bg-dark text-light\">\r\n");
      out.write("\t\t\t\t\t<td><input class=\" btn btn-danger ml-3\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Delete\"></td>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">STT</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Hình ảnh</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Tên sách</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Giá bán</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"pr\">Số lượng</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\" class=\"pr\">Thành tiền</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					int i = 1;
						for (cartBean cart : listCart) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr ");
if (i % 2 == 0) {
      out.write(" style=\"background: #ffff;\" ");
}
      out.write(">\r\n");
      out.write("\t\t\t\t\t<td><input class=\"ml-3\" type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\tname=\"");
      out.print(cart.getMs().trim());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(i);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><img alt=\"\" src=\"");
      out.print("photo/" + cart.getAnh());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 4rem; width: 3.4rem;\"></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(cart.getTh());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(f.formart(cart.getGia()));
      out.write(" đ</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\" py-1  text-center border border-dark \"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 2.5rem; background-color: #D4D2D2;\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"text-dark unline\" href=");
      out.print("cart?c=g&ms=" + cart.getMs());
      out.write(">-</a>\r\n");
      out.write("\t\t\t\t\t\t\t</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" py-1 text-center border-top border-bottom border-dark \"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 2.5rem;\">");
      out.print(cart.getSoLuong());
      out.write(" </span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" py-1 text-center border border-dark \"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 2.5rem; background-color: #D4D2D2;\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"text-dark unline\" href=");
      out.print("cart?c=t&ms=" + cart.getMs());
      out.write(">+</a>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\">");
      out.print(f.formart(cart.getThanhTien()));
      out.write(" đ</td>\r\n");
      out.write("\t\t\t\t\t<td><a href=");
      out.print("remove-cart?ms=" + cart.getMs());
      out.write("><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-times-circle cursor mr-4 text-dark\"></i></a></td>\r\n");
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
      out.write("\t\t\t\t\t<td align=\"center\" class=\"pr\"><b>");
      out.print(carts.tongSL());
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><b class=\"text-danger pr\">");
      out.print(f.formart(carts.TongTien()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tđ</b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"6\"></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"pr\"><a class=\"btn btn-dark\"\r\n");
      out.write("\t\t\t\t\t\thref=");
      out.print(id != null ? "pay?userID=" + id : "pay");
      out.write(">Đặt mua</a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
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