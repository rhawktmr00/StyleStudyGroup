package com.ms.Practice01.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.abstractPattern01.servlet.LogicPizzaClass;
import com.sp.common.LogicClass;

/**
 * Servlet implementation class LottoServlet01
 */
@WebServlet("/LottoServlet01ms")
public class LottoServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LottoServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    request.getRequestDispatcher("lotto/lottoEx.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
	      String inputValue = "";
	      LogicClass logicClass = new LogicLottoClass();
	      
	      String printValue = logicClass.excute(inputValue);
	      
	      request.setAttribute("message", printValue);
	      request.getRequestDispatcher("PrintServlet").forward(request, response);
	}

}
