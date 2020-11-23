import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MemberServlet2 extends HttpServlet
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
			res = st.executeQuery("Select * from membership10");
		}

		catch(Exception e)
		{
		};

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			response.sendRedirect("http://127.0.0.1:8080/servlet/MemberShip1.html");
			out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{	
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println(1);
			
			cn = DriverManager.getConnection("jdbc:odbc:Yogesh1","scott/tiger@oracle8i"," ");
			System.out.println(2);
			st = cn.createStatement();
			System.out.println(3);
			res = st.executeQuery("Select * from membership10");
		}

		catch(Exception e)
		{
			System.out.println(e);
		};


		response.setContentType("text/html");
		System.out.println(4);
		PrintWriter out = response.getWriter();

		String fname = request.getParameter("fname");
		System.out.println(5);
		String sname = request.getParameter("sname");
		String userid = request.getParameter("userid");
		System.out.println(6);
		String password = request.getParameter("pass");
		System.out.println(7);
		String repass = request.getParameter("repass");
		System.out.println(8);
		String day1 = request.getParameter("dd");
		System.out.println(9);
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		System.out.println(10);
		String a1 = request.getParameter("gender");
		String address = request.getParameter("address");
		System.out.println(11);
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		System.out.println(12);
		String zipcode = request.getParameter("zipcode");
		String telno = request.getParameter("telno");
		System.out.println(122);
		String fax = request.getParameter("fax");
		String email = request.getParameter("email");
		System.out.println(13);
		int i = Integer.parseInt(day1);			
		System.out.println(14);
		int k = Integer.parseInt(year);			
		System.out.println(15);
		int z = Integer.parseInt(zipcode);
		int l = Integer.parseInt(telno);
		System.out.println(16);
		int m = Integer.parseInt(fax);

		int x;
		try
		{
			System.out.println(17);

			  String sql ="select count(*) ctr from membership10 where  login='"+userid+"' " ;
			
			  System.out.println(18);
			  
               res=st.executeQuery(sql);

			   System.out.println(19);

				while(res.next())
				{
						System.out.println(20);
                        int c=0 ;
                        c=Integer.parseInt(res.getString("ctr"));
						System.out.println(21);
	 					if(c==0)
						{
							pr = cn.prepareStatement("Insert into membership10 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
							System.out.println(22);

							pr.setString(1,fname);
							System.out.println(23);			
							pr.setString(2,sname);
							pr.setString(3,userid);
							System.out.println(24);
							pr.setString(4,password);
							pr.setString(5,repass);
							System.out.println(25);
							pr.setInt(6,i);
							pr.setString(7,month);
							pr.setInt(8,k);
							System.out.println(26);
							pr.setString(9,a1);
							pr.setString(10,address);
							System.out.println(27);
							pr.setString(11,country);
							pr.setString(12,state);
							System.out.println(28);
							pr.setString(13,city);
							pr.setInt(14,z);
							pr.setInt(15,l);
							System.out.println(29);
							pr.setInt(16,m);
							pr.setString(17,email);
			
							System.out.println(30);
					
							x = pr.executeUpdate();
				
							System.out.println(31);
													
							System.out.println(32);
						}
						else
						{                                           
	 							 System.out.println(33);
								 out.println("<HTML> <HEAD>");
							 	 out.println("<TITLE> Result  </TITLE> ");
								 out.println("</HEAD>");
								 out.println("<BODY>");
                                 out.println("<h1>Login aready exits</h1><HR>");
								 out.println("Please fill the form again <BR>");
								 out.println("<A href='c:\\students\\Aparna\\night27th\\membership1.html' TARGET=\'main'>Membership Form</A>");
								 out.println("</BODY></HTML>");
								 out.close();
                        }
				}
				cn.close();
				System.out.println(34);
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
		out.println("<p><H6> Congratulations </H6><BR>");
		out.println("<p> We will send you your membership letter <BR>");
		out.println("<A href='c:\\students\\Aparna\\night27th\\PasswordLogin3.html'> Back  </A>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}