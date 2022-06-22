package Chapter06;

public class Teacher {
	
		
		static int balance;
		int salary;
		
		static void run(int salary) {
			salary = 10;
		}
		
		void runngin() {
			balance = 10;
		}
		
	/*	
		public Teacher(int balance, int salary) {
			this.balance = balance;
			this.salary = salary;
		}
		
		static void run(int salary) {
		//	this.salary = salary; //샐러리를 쓰려면 7행에 스태틱을 붙이든지 static int ..
			Teacher a = new Teacher(salary, salary);
			a.salary = salary;
		}
		
*/

}

