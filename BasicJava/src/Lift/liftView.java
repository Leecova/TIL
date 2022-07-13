package Lift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;



public class liftView {
	public void init(liftController controller) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int amount = 0;
		
		liftVO allBig = liftDAO.selectAllBig();
		liftVO allSmall = liftDAO.selectAllSmall();
		liftVO winterBig = liftDAO.selectAllSmall();
		liftVO winterSmall = liftDAO.selectAllSmall();
		
		Program: while (true) {
			System.out.println("메뉴를 선택하세요.리프트test");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.전일권(대) | 2.전일권(소) | 3.윈터패스(대) | 4.윈터패스(소) | 5.가격표 | 6. 종료");
			System.out.println("----------------------------------------------------------------------");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
								
				System.out.println("-------------");
				System.out.println("인원을 입력하세요");
				System.out.println("-------------");
				int number1 = Integer.parseInt(scanner.nextLine());
				amount = amount + (allBig.getLi_ct() * number1);
				System.out.printf("%d명 %d원\n",number1, amount);
				break;
				
			case 2:
				System.out.println("-------------");
				System.out.println("인원을 입력하세요");
				System.out.println("-------------");
				int number2 = Integer.parseInt(scanner.nextLine());
				amount = amount + (allSmall.getLi_ct() * number2);
				System.out.printf("%d명 %d원\n",number2, amount);
				break;
				
			case 3:
				System.out.println("-------------");
				System.out.println("인원을 입력하세요");
				System.out.println("-------------");
				int number3 = Integer.parseInt(scanner.nextLine());
				amount = amount + (winterBig.getLi_ct() * number3);
				System.out.printf("%d명 %d원\n",number3, amount);
				break;
				
			case 4:
				System.out.println("-------------");
				System.out.println("인원을 입력하세요");
				System.out.println("-------------");
				int number4 = Integer.parseInt(scanner.nextLine());
				amount = amount + (winterSmall.getLi_ct() * number4);
				System.out.printf("%d명 %d원\n",number4, amount);
				break;
				
				
			
			case 5:
				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.registerDriver(new OracleDriver());
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc23","java");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select li_cd, li_nm, li_ex, li_ct from lift");
				while(resultSet.next()) {
				int liftCd = resultSet.getInt("li_cd");
				String liftNm = resultSet.getString("li_nm");
				String liftEx = resultSet.getString("li_ex");
				int liftCt = resultSet.getInt("li_ct");
				System.out.printf("%s\t%-7s\t%s\t%s\n",liftCd, liftNm, liftEx, liftCt);
				}
				break;
			
			case 6:
			System.out.println("프로그램 종료");
			break Program;
			}
		}

	}
}
