<%@page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!Connection conn=null; %>  <!-- global data member -->

	<%!
		public void jspInit() {
			System.out.println("jspInit()");
			ServletConfig cfg = getServletConfig();
			ServletContext ctx = getServletContext();
			
			System.out.println("cfg : "+cfg);
			System.out.println("ctx : "+ctx);
			
			String driverName = ctx.getInitParameter("driverName");
			String driverURL  = ctx.getInitParameter("driverURL");
			
			String userName = cfg.getInitParameter("userName");
			String passWord = cfg.getInitParameter("passWord");
		
			System.out.println("DriverName : "+driverName);
			System.out.println("DriverURL  : "+driverURL);
			System.out.println("username   : "+userName);
			System.out.println("password   : "+passWord);
			
			try {
				Class.forName(driverName); 
				System.out.println("Driver Loaded.....");
				conn = DriverManager.getConnection(driverURL,userName,passWord);
				System.out.println("Connected..."+conn);
			}
			catch(Exception e) {
				System.out.println("Some problem "+e);
			}
		}
	%>
	
	<%!
		public void jspDestroy() {
		System.out.println("jspDestroy()");
		}
	%>
	
	<TABLE border=10>
	<% 
		int employeeNumber =  Integer.parseInt(request.getParameter("v_empno"));

			Statement st = conn.createStatement();
			System.out.println("Statement made.."+st);
			
			ResultSet rs = st.executeQuery("select * from emp where empno="+employeeNumber);
			System.out.println("Query fired.."+rs);
			
			while(rs.next()) {
	%>
				<tr>
					<td>Employee Number</td><td><%= rs.getInt(1)%></td>
					<td>Employee Name</td><td><%= rs.getString(2)%></td>
					<td>Employee Job</td><td><%= rs.getString(3)%></td>
				</tr>	
	<%
		}
	%>
	
	</TABLE>
			
	<h3>Value of employeeNumber is <%=employeeNumber  %></h3>
	
	
</body>
</html>