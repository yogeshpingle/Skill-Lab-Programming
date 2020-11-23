import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class FeedBackServlet extends HttpServlet
{
	Connection cn; Statement st; ResultSet res; PreparedStatement pr;
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);

	}
		

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			
		try
		{	
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn = DriverManager.getConnection("jdbc:odbc:Yogesh1","scott/tiger@oracle8i"," ");
			st = cn.createStatement();
			res = st.executeQuery("Select * from feedback2");
		}

		catch(Exception e)
		{
		};

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{	
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println(1);
			
			cn = DriverManager.getConnection("jdbc:odbc:Yogesh1","","");
			System.out.println(2);
			st = cn.createStatement();
			System.out.println(3);
			res = st.executeQuery("Select * from feedback2");
		}

		catch(Exception e)
		{
			System.out.println(e);
		};


		response.setContentType("text/html");
		System.out.println(4);
		PrintWriter out = response.getWriter();

		String comment = request.getParameter("comments");
		String fname = request.getParameter("fname");
		System.out.println(5);
		String email = request.getParameter("email");
		System.out.println(6);
		String telno = request.getParameter("telno");
		System.out.println(7);
		String fax = request.getParameter("fax");
		System.out.println(8);
		int l = Integer.parseInt(telno);
		System.out.println(9);
		int m = Integer.parseInt(fax);

		int x;
		try
		{
			System.out.println(10);

			pr = cn.prepareStatement("Insert into feedback2 values(?,?,?,?,?)");
			
			System.out.println(11);

			pr.setString(1,comment);
			System.out.println(12);			
			pr.setString(2,fname);
           System.out.println(13);
		   pr.setString(3,email);
			System.out.println(14);
			pr.setInt(4,l);
			System.out.println(15);
			pr.setInt(5,m);
			
			x = pr.executeUpdate();
			
			System.out.println(16);
			
			cn.close();
			System.out.println(17);
		}

		catch(Exception e)
		{
		System.out.println(e);
		};


		out.println("<HTML> <HEAD>");
		out.println("<TITLE> Result  </TITLE> ");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H1> Thank You </H1><HR>");
		out.println("<A href='c:\\students\\Aparna\\night27th\\FeedBack.html'> Back  </A>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close(); 
	}
}