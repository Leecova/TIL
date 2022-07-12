package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import memo.MemoDAO;
import memo.MemoVO;

class MyTest {
	
	MemoDAO dao = new MemoDAO();
	
//	@Test
	void memoSelectList() throws Exception {
		List<MemoVO> list = dao.selectList();
		assertEquals(0,list.size());
		
	}

	//@Test
	void memoSelectOne() throws Exception {
		MemoVO vo = dao.selectOne(0);
		assertNull(vo);
		
	}
	
	//@Test
	void insert() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setTitle("두번째 메모");
		vo.setContents("곧 점심시간이다~");
		int insertMemo = dao.insertMemo(vo); // DAO에서 인서트라고 써서 안되던거였음 인서트 메모라고 바꾸고 해결
		assertEquals(1, insertMemo);
		assertEquals(3, dao.selectList().size());
		
	}
	@Test
	void update() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setId(4);
		vo.setTitle("오늘은 7월12일");
		vo.setContents("10시 12분이 지났다.");
		
		MemoVO memo = dao.selectOne(4);
		
	//	assertEquals(1, updateMemo);// 성공하면 1, 실패하면 0
		assertNull(vo.getModifyDate());
		int updateMemo = dao.updateMemo(vo);
		
		dao.updateMemo(vo);
		memo = dao.selectOne(4);
		
		assertEquals(vo.getTitle(), memo.getTitle());
		assertNotNull(memo.getModifyDate());
	}
	
	void delete() throws Exception {
		dao.deleteMemo(2);
		assertEquals(2, dao.selectList().size());
	}
}
