package Lift;

import java.util.List;



public class liftController {
	liftService service = new liftService();
	
	public List<liftVO> getLifts() throws Exception {
		return service.selectList();
	}
	
	public liftVO getlift(int searchId) throws Exception {
		return service.selectOne(searchId);
	}
	
	public int insertlift(liftVO vo) throws Exception {
		return service.insertlift(vo);
	}
	
	public int updatelift(liftVO vo) throws Exception {
		return service.updatelift(vo);
	}
	
	public int deleteMemo(int deleteId) throws Exception {
		return service.deletelift(deleteId);
	}
}
