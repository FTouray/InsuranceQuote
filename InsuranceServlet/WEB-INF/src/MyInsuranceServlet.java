import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInsuranceServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException{
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String engine = request.getParameter("engineSize");
		String make = request.getParameter("make");
		String model = request.getParameter("model");

		int quote = 200;
		int age1 = Integer.parseInt(age);
		double engineSize1 = Double.parseDouble(engine);

		if (age1 <= 27){
			quote = quote + 800;

		}
		else
		if (age1 >= 28 && age1 <=70){
			quote = quote + 300;

		}
		else
		if (age1 >= 71){
			quote = quote + 600;

		}

		if (engineSize1 == 1.1){
			quote = quote + 100;

		}
		else
		if (engineSize1 >= 1.2 && engineSize1 <= 1.5){
			quote = quote + 200;

		}
		else
		if (engineSize1 >= 1.6){
			quote = quote + 300;

		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><h2>Your Quote Details</h2> <p>Name: " + name + "</p> <p>Age: " + age + "</p> <p>Car Engine Size: " 
		+ engine + "</p> <p>Car Make: " + make + "</p> <p>Car Model: " + model + "</p> </html>");
		out.println("<html><h3>Your Quote is :</h3> " + quote + "</html>");
		
		
		
		
	}

}
