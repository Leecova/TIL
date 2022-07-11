package memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

// Data Access Object: 직접 데이터베이스에 접속해서 데이터 처리
// 다오 (사람마다 DAO라고 읽는사람, 다오라고 읽는사람 있음 맞춰서 부르면됨)
// MemoDao
public class MemoDAO {
	public List<MemoVO> selectList() throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement(); //C, c 맞?
		// 문자열 결합
		// 1. +기호로 문자열 결합
		// 2. StringBuilder로 문자열 결합
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	id, "); // 컬러명이나 alias가 들어가야함
		builder.append("	title, ");
		builder.append("	contents,");
		builder.append("	register_date, ");
		builder.append("	modify_date ");
		builder.append("FROM");
		builder.append("	memo ");
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		// 결과가: 0 ~ 무한대 > flux
		List<MemoVO> list = new ArrayList<>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String title = resultSet.getString("title");
			String contents = resultSet.getString("contents");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			list.add(new MemoVO(id, title, contents, registerDate, modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	public MemoVO selectOne(int searchId) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		Statement statement = connection.createStatement(); //C, c 맞?
		// 문자열 결합
		// 1. +기호로 문자열 결합
		// 2. StringBuilder로 문자열 결합
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("	id, "); // 컬러명이나 alias가 들어가야함
		builder.append("	title, ");
		builder.append("	contents,");
		builder.append("	register_date, ");
		builder.append("	modify_date ");
		builder.append("FROM");
		builder.append("	memo ");
		builder.append("WHERE");
		builder.append("	id = " + searchId);
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		// 결과: 0 or 1: -> Mono
		MemoVO vo = null;
		if (resultSet.next()) {
			int id = resultSet.getInt("id");
			String title = resultSet.getString("title");
			String contents = resultSet.getString("contents");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			vo = new MemoVO(id, title, contents, registerDate, modifyDate);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
		
		
	}
	public int insertMemo(MemoVO vo) throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
		connection.prepareStatement(null);
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo(");
		builder.append("	id,");
		builder.append("	title,");
		builder.append("	contents");
		builder.append(") VALUES (");
		builder.append("	memo_seq.nextval,");
		builder.append("	?,");
		builder.append("	?");
		builder.append(")");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContents());
		// insert, update, delete가 모두 executeUpdate()메소드를 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int updateMemo() {
		return 0;
	}
	public int deletMemo() {
		return 0;
	}
}