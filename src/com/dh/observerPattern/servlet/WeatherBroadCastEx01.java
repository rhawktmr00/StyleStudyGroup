package com.dh.observerPattern.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dh.observerPattern.WeatherData;
import com.sp.common.LogicClass;

/**
 * Servlet implementation class WeatherBroadCastEx01
 */
@WebServlet("/WeatherExServletDh")
public class WeatherBroadCastEx01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WeatherBroadCastEx01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	    request.getRequestDispatcher("observerPattern01/weatherEx.jsp").forward(request, response);
	  response.getWriter().append("Served at: ").append(request.getContextPath());
      request.getRequestDispatcher("observerPattern01/weatherExdh.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  request.setCharacterEncoding("utf-8");
      String tempature = request.getParameter("tempature");
      String hunuduty = request.getParameter("hunuduty");
      String pressure = request.getParameter("pressure");
      String tommorwWeather = request.getParameter("tommowWeather");
      String[] broadCasting = request.getParameterValues("broadCasting");
      
      float tempatureF = Float.parseFloat(tempature);
      float hunudutyF = Float.parseFloat(hunuduty);
      float pressureF = Float.parseFloat(pressure);
      WeatherData weatherData = new WeatherData();
      weatherData.setAllDatas(tempatureF, hunudutyF, pressureF, tommorwWeather);
      weatherData.setBroadCasting(broadCasting);
      LogicClass logicClass = new LogicWeatherClass();
      
      String printValue = logicClass.excute(weatherData);
      
      request.setAttribute("message", printValue);
      request.getRequestDispatcher("PrintServlet").forward(request, response);
      
	}

}
