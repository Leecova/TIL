package Chapter06;

public class MemberService {
	
	
	
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			// 처음 에러가 생겨서 return false;로 두고 에러 없애주고 시작하는게 좋음
			return true;	
		} else {
			return false; // else 없이 return false만 써도 됨
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
