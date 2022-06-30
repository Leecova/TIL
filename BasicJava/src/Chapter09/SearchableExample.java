package Chapter09;

public class SearchableExample {
	public static void main(String[] args) {
		new Searchable() {
			public void search(String url) {
				System.out.println(url);
			}
		}.search("홍길동");
		// 람다?로 확장이 가능하다
	}

}
