package chapter13;

import java.util.List;
import java.util.ArrayList;
public class BoardDao {
	public List<BoardExam> getBoardList() {
		List<BoardExam> list = new ArrayList<BoardExam>();
		list.add(new BoardExam("제목1", "내용1"));
		list.add(new BoardExam("제목2", "내용2"));
		list.add(new BoardExam("제목3", "내용3"));
		return list;
	}

}
