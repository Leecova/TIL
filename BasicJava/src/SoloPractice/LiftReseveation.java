package SoloPractice;

import java.util.Scanner;

public class LiftReseveation {
 
	public static void main(String[] args) throws Exception  {
	   boolean run = true;
         int amount = 0;

        LiftVO allTimeBig = LiftDAO.selectAllTimeBig();
        LiftVO allTimeSmall = LiftDAO.selectAllTimeSmall();
        LiftVO winterPassBig = LiftDAO.selectWinterPassBig();
        LiftVO winterPassSmall = LiftDAO.selectWinterPassSmall();
     	
	Scanner scanner = new Scanner(System.in);
	  
   	  while (run) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.���ϱ�(��) | 2.���ϱ�(��) | 3.�����н�(��) | 4.�����н�(��) | 5.����|");
		System.out.println("-------------------------------------------------------------");
		System.out.print("�̿��� ��ǰ�� �����ϼ���> ");
		
		int lift = Integer.parseInt(scanner.nextLine());
		switch(lift) {
		   case 1:
			 System.out.print("�̿��� �ο��� �Է����ּ���> ");
			 int manNumber1 = Integer.parseInt(scanner.nextLine());
			 amount = amount + (allTimeBig.getLiCost() * manNumber1);
			 System.out.printf("�ݾ�> %d\n", amount);
		     break;
		   case 2:
			 System.out.print("�̿��� ���� �Է����ּ���> ");
			 int manNumber2 = Integer.parseInt(scanner.nextLine());			  
			 amount = amount + (allTimeSmall.getLiCost() * manNumber2); 
			 System.out.printf("�ݾ�> %d\n", amount);
			 break;
		   case 3:
			 System.out.print("�̿��� ���� �Է����ּ���> ");
			 int manNumber3 = Integer.parseInt(scanner.nextLine());
			 amount = amount + (winterPassBig.getLiCost() * manNumber3); 
			 System.out.printf("�ݾ�> %d\n", amount);
			 
		     break;
		   case 4:
			 System.out.print("�̿��� ���� �Է����ּ���> ");
			 int manNumber4 = Integer.parseInt(scanner.nextLine());
			 amount = amount + (winterPassSmall.getLiCost() * manNumber4); 
			 System.out.printf("�ݾ�> %d\n", amount);
			 break;
		   case 5:
		     run = false;  
		     break;
	    }
	}
   	  System.out.printf("���� �ݾ��� %d�Դϴ�.", amount);
}
}
