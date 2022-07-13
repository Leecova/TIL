package Lift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class DepartmentExample {
	public static void main(String[] args) throws Exception {
		//Scanner scanner = new Scanner(System.in);
		//int menu = Integer.parseInt(scanner.nextLine());
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select li_cd, li_nm, li_ex, li_ct from lift");
		
		while (resultSet.next()) {
			int liftCd = resultSet.getInt("li_cd");
			String liftNm = resultSet.getString("li_nm");
			String liftEx = resultSet.getString("li_ex");
			int liftCt = resultSet.getInt("li_ct");
			System.out.printf("%s\t%-7s\t%s\t%s\n",liftCd, liftNm, liftEx, liftCt);
			
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}

}
