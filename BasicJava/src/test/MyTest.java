package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import memo.MemoDAO;
import memo.MemoVO;

class MyTest {
	
	MemoDAO dao = new MemoDAO();
	
	@Test
	void memoSelectList() throws Exception {
		List<MemoVO> list = dao.selectList();
		assertEquals(0,list.size());
		
	}

	@Test
	void memoSelectOne() throws Exception {
		MemoVO vo = dao.selectOne(0);
		assertNull(vo);
		
	}
	
	@Test
	void insert() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setTitle("두번째 메모");
		vo.setContents("곧 점심시간이다~");
		int insertMemo = dao.insertMemo(vo); // DAO에서 인서트라고 써서 안되던거였음 인서트 메모라고 바꾸고 해결
		assertEquals(1, insertMemo);
		assertEquals(4, dao.selectList().size());
		
	}
}
