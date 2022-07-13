package Lift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import oracle.jdbc.driver.OracleDriver;


public class liftDAO {
	public static liftVO selectAllBig() throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	li_cd, "); // 컬럼명이나 alias가 들어가야함
		builder.append("	li_nm, ");
		builder.append("	li_ex, ");
		builder.append("	li_ct");
		builder.append(" FROM");
		builder.append("	lift ");
		builder.append(" Where ");
		builder.append("	li_cd = 12 " );
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		liftVO vo = null;
		while (resultSet.next()) {
			int li_cd = resultSet.getInt("li_cd");
			String li_nm = resultSet.getString("li_nm");
			String li_ex = resultSet.getString("li_ex");
			int li_ct = resultSet.getInt("li_ct");
			vo = new liftVO(li_cd, li_nm, li_ex, li_ct);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
		
	}
	
		
	public static liftVO selectAllSmall() throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	li_cd, "); // 컬럼명이나 alias가 들어가야함
		builder.append("	li_nm, ");
		builder.append("	li_ex, ");
		builder.append("	li_ct");
		builder.append(" FROM");
		builder.append("	lift ");
		builder.append(" Where ");
		builder.append("	li_cd = 13 " );
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		liftVO vo = null;
		while (resultSet.next()) {
			int li_cd = resultSet.getInt("li_cd");
			String li_nm = resultSet.getString("li_nm");
			String li_ex = resultSet.getString("li_ex");
			int li_ct = resultSet.getInt("li_ct");
			vo = new liftVO(li_cd, li_nm, li_ex, li_ct);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
		
	}public static liftVO selectWinterBig() throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	li_cd, "); // 컬럼명이나 alias가 들어가야함
		builder.append("	li_nm, ");
		builder.append("	li_ex, ");
		builder.append("	li_ct");
		builder.append(" FROM");
		builder.append("	lift ");
		builder.append(" Where ");
		builder.append("	li_cd = 14 " );
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		liftVO vo = null;
		while (resultSet.next()) {
			int li_cd = resultSet.getInt("li_cd");
			String li_nm = resultSet.getString("li_nm");
			String li_ex = resultSet.getString("li_ex");
			int li_ct = resultSet.getInt("li_ct");
			vo = new liftVO(li_cd, li_nm, li_ex, li_ct);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
		
	}
	public static liftVO selectWinterSmall() throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	li_cd, "); // 컬럼명이나 alias가 들어가야함
		builder.append("	li_nm, ");
		builder.append("	li_ex, ");
		builder.append("	li_ct");
		builder.append(" FROM");
		builder.append("	lift ");
		builder.append(" Where ");
		builder.append("	li_cd = 15 " );
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		liftVO vo = null;
		while (resultSet.next()) {
			int li_cd = resultSet.getInt("li_cd");
			String li_nm = resultSet.getString("li_nm");
			String li_ex = resultSet.getString("li_ex");
			int li_ct = resultSet.getInt("li_ct");
			vo = new liftVO(li_cd, li_nm, li_ex, li_ct);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
		
	}
	
	
	
	public liftVO selectOne(int searchId) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement(); //C, c 맞?
		// 문자열 결합
		// 1. +기호로 문자열 결합
		// 2. StringBuilder로 문자열 결합
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	li_cd, "); // 컬러명이나 alias가 들어가야함
		builder.append("	li_nm, ");
		builder.append("	li_ex, ");
		builder.append("	li_ct ");
		builder.append("FROM");
		builder.append("	lift ");
		builder.append("WHERE");
		builder.append("	li_cd = " + searchId);
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		// 결과: 0 or 1: -> Mono
		liftVO vo = null;
		if (resultSet.next()) {
			int li_cd = resultSet.getInt("li_cd");
			String li_nm = resultSet.getString("li_nm");
			String li_ex = resultSet.getString("li_ex");
			int li_ct = resultSet.getInt("li_ct");
			vo = new liftVO(li_cd, li_nm, li_ex, li_ct);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}
	public int insertlift(liftVO vo) throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO LIFT(");
		builder.append("	li_cd,");
		builder.append("	li_nm,");
		builder.append("	li_ex,");
		builder.append("	li_ct");
		builder.append(") VALUES (");
		builder.append("	memo_seq.nextval,");
		builder.append("	?,");
		builder.append("	?,");
		builder.append("	?");
		builder.append(")");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getLi_nm());
		statement.setString(2, vo.getLi_ex());
		statement.setInt(3, vo.getLi_ct());
		// insert, update, delete가 모두 executeUpdate()메소드를 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int updatelift(liftVO vo) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE lift");
		builder.append("	SET");
		builder.append("	li_nm= ?, ");
		builder.append("	li_ex = ?, ");
		builder.append("	li_ct = ? ");
		builder.append("WHERE");
		builder.append("	li_cd = ? ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getLi_nm());
		statement.setString(2, vo.getLi_ex());
		statement.setInt(3, vo.getLi_ct());
		statement.setInt(4, vo.getLi_cd());
		
		// insert, update, delete가 모두 executeUpdate()메소드를 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int deletelift(int deleteId) throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		StringBuilder builder = new StringBuilder();
		builder.append("DELETE FROM");
		builder.append("	lift ");
		builder.append("WHERE");
		builder.append("	li_cd = ? ");
	
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, deleteId);
		// insert, update, delete가 모두 executeUpdate()메소드를 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public List<liftVO> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
