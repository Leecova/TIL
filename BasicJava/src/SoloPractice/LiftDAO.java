package SoloPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.driver.OracleDriver;

public class LiftDAO {

	public static LiftVO selectAllTimeBig() throws Exception {
		
	
	DriverManager.registerDriver(new OracleDriver());
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PC25", "java");
	Statement statement = connection.createStatement();
           
    StringBuilder builder = new StringBuilder();
	builder.append(" select ");
	builder.append("        li_ct ");
	builder.append("  from  ");
	builder.append("        lift ");
	builder.append("  where   ");
	builder.append("        li_cd = 12 ");
	String sql = builder.toString();
	ResultSet resultSet = statement.executeQuery(sql);
	
	LiftVO vo = null;
	if (resultSet.next()) {
		int liCost = resultSet.getInt("li_ct");
		vo = new LiftVO(liCost);
	}
                 
    resultSet.close();
    statement.close();
    connection.close();
        return vo;
}
	public static LiftVO selectAllTimeSmall() throws Exception {
		
		
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PC25", "java");
		Statement statement = connection.createStatement();
	           
	    StringBuilder builder = new StringBuilder();
	    builder.append(" select ");
		builder.append("        li_ct ");
		builder.append("  from  ");
		builder.append("        lift ");
		builder.append("  where   ");
		builder.append("        li_cd = 13 ");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		
		LiftVO vo = null;
		if (resultSet.next()) {
			int liCost = resultSet.getInt("li_ct");
			vo = new LiftVO(liCost);
		}
	                 
	    resultSet.close();
	    statement.close();
	    connection.close();
	        return vo;
	}
    public static LiftVO selectWinterPassBig() throws Exception {
		
		
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PC25", "java");
		Statement statement = connection.createStatement();
	           
	    StringBuilder builder = new StringBuilder();
	    builder.append(" select ");
		builder.append("        li_ct ");
		builder.append("  from  ");
		builder.append("        lift ");
		builder.append("  where   ");
		builder.append("        li_cd = 14 ");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		
		LiftVO vo = null;
		if (resultSet.next()) {
			int liCost = resultSet.getInt("li_ct");
			vo = new LiftVO(liCost);
		}
	                 
	    resultSet.close();
	    statement.close();
	    connection.close();
	        return vo;
	}
    public static LiftVO selectWinterPassSmall() throws Exception {
		
		
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PC25", "java");
		Statement statement = connection.createStatement();
	           
	    StringBuilder builder = new StringBuilder();
	    builder.append(" select ");
		builder.append("        li_ct ");
		builder.append("  from  ");
		builder.append("        lift ");
		builder.append("  where   ");
		builder.append("        li_cd = 15 ");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		
		LiftVO vo = null;
		if (resultSet.next()) {
			int liCost = resultSet.getInt("li_ct");
			vo = new LiftVO(liCost);
		}
	                 
	    resultSet.close();
	    statement.close();
	    connection.close();
	        return vo;
	}
}
