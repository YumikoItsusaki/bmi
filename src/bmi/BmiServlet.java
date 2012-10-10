package bmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiServlet
 */
@WebServlet("/BmiServlet")
public class BmiServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>BMI</title>");
		
		String taijyu = req.getParameter("taijyu");
		String sintyou = req.getParameter("sintyou");
		double t = Double.parseDouble(taijyu);
		double s = Double.parseDouble(sintyou) / 100;
		
		out.println("‚ ‚È‚½‚ÌBMI‚Í" + t / (s * s));
	}
		
		
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}


}
