package chapter13;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<BoardExam> list = dao.getBoardList();
		for(BoardExam board : list ) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
