package com.sp.commandPattern01.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ms.Practice01.servlet.LogicLottoClass;
import com.sp.abstractPattern01.servlet.LogicPizzaClass;
import com.sp.common.LogicClass;

@WebServlet("/RemoteServlet01")
public class RemoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("commandPattern01/remoteEx.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
//      String inputValue = request.getParameter("menu");
      LogicClass logicClass = new LogicRemote();

      String inputValue = "";
      String printValue = logicClass.excute(inputValue);
      
      request.setAttribute("message", printValue);
      request.getRequestDispatcher("PrintServlet").forward(request, response);
	}

}
