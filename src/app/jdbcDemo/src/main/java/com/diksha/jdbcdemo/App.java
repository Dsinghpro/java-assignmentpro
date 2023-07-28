package com.diksha.jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;



public class App 
{
   /* public static void main( String[] args ) throws Exception
    {
      //  Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/prolifics";
        Connection con=DriverManager.getConnection(url,"root","jerry*26@Tom");
        PreparedStatement pst = con.prepareStatement("select * from employee");
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
    }*/
	 public static void main( String[] args ) {
		 Connection con=null;
		 PreparedStatement pst =null;
		
		String url="jdbc:mysql://localhost:3306/prolifics";
		try {
			con=DriverManager.getConnection(url,"root","jerry*26@Tom");
		    pst = con.prepareStatement("delete from employee");
		    int count=pst.executeUpdate();
		    System.out.println(count+"Row deleted");
		   
		   
		    
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
	 }
	   
}
//Other way to write
/*String url="jdbc:mysql://localhost:3306/prolifics";
	try(Connection con=DriverManager.getConnection(url,"root","jerry*26@Tom") ;
			PreparedStatement pst = con.prepareStatement("select * from employee");
			ResultSet rs=pst.executeQuery())
	{
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		
	}
	catch(SQLException ex) {
		ex.printStackTrace();
	}
	}*/


/*{
	 Connection con=null;
		PreparedStatement pst =null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/prolifics";
		//3306-is a default portnumber(its is a integer to bind the server to service number)
		try {
		   
	     con=DriverManager.getConnection(url,"root","jerry*26@Tom");
	    pst = con.prepareStatement("select * from employee where empid=?");
	    pst.setInt(1, 123);//1 indicate question mark
	    rs=pst.executeQuery();
	    if(rs.next())
	    	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	    pst.setInt(1, 101);
	    rs=pst.executeQuery();
	    if(rs.next())
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
//	    	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	    	//we are using getstring because we are reading the data
	    //we can also use getInt,getDouble
	   
	}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				 if(rs!=null) rs.close();
				 if(pst!=null) pst.close();
				 if(con!=null) con.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		}

   }*/

/*Connection con=null;
PreparedStatement pst =null;
ResultSet rs=null;
ResultSetMetaData rsmd=null;
String url="jdbc:mysql://localhost:3306/prolifics";
try {
	con=DriverManager.getConnection(url,"root","jerry*26@Tom");
   pst = con.prepareStatement("select * from employee");
   rs=pst.executeQuery();
   rsmd =rs.getMetaData();
   int count = rsmd.getColumnCount();
   for(int i=1;i<=count;i++)
   	System.out.println(rsmd.getColumnName(i)+" ");
   System.out.println();
   while(rs.next())
   {
   	for(int i=1;i<=count;i++)
   		System.out.println(rs.getString(i)+" ");
   	System.out.println();
   }
}catch(SQLException ex) {
	ex.printStackTrace();
}*/

//DML 
/*Connection con=null;
PreparedStatement pst =null;
ResultSet rs=null;
String url="jdbc:mysql://localhost:3306/prolifics";
try {
	con=DriverManager.getConnection(url,"root","jerry*26@Tom");
   pst = con.prepareStatement("insert into employee values(?,?,?,?)");
   pst.setInt(1, 104);
   pst.setString(2, "jay");
   pst.setDouble(3, 40000.45);
   pst.setInt(4, 40);
   int count=pst.executeUpdate();
   System.out.println(count+"Row inserted");
   pst.setInt(1, 105);
   pst.setString(2, "reena");
   pst.setDouble(3, 50000.45);
   pst.setInt(4, 70);
   count=pst.executeUpdate();
   System.out.println(count+"Row inserted");
  
   
}catch(SQLException ex) {
	ex.printStackTrace();
}
finally {
	try {
		if(pst!=null) pst.close();
		if(con!=null) con.close();
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
}*/

     
