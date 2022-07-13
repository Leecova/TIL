package Lift;

import java.util.List;

public class liftService {
	private liftDAO dao = new liftDAO();
	
	public List<liftVO> selectList() throws Exception{
		return dao.selectList();
	}
	public liftVO selectOne(int searchId) throws Exception{
		return dao.selectOne(searchId);
	}
	public int insertlift(liftVO vo) throws Exception{
		return dao.insertlift(vo);
	}
	public int updatelift(liftVO vo) throws Exception{
		return dao.updatelift(vo);
	}
	public int deletelift(int deleteId) throws Exception{
		return dao.deletelift(deleteId);
	}

}
