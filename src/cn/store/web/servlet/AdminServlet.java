    package cn.store.web.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.store.domain.Category;
import cn.store.domain.User;
import cn.store.service.CategoryService;
import cn.store.service.UserService;
import cn.store.service.serviceImp.CategoryServiceImp;
import cn.store.service.serviceImp.UserServiceImp;
import cn.store.utils.MailUtils;
import cn.store.utils.MyBeanUtils;
import cn.store.utils.UUIDUtils;
import cn.store.web.base.BaseServlet;

public class AdminServlet extends BaseServlet {
	public String adminLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
	String adminname= request.getParameter("adminname");
	String adminpassword= request.getParameter("adminpassword");
	
	System.out.println(adminname);
	System.out.println(adminpassword);
	if(adminname=="admin"&&adminpassword=="admin")
		return "/admin/home.jsp";
	else		
	{		
	return null;
	}
  }
}
