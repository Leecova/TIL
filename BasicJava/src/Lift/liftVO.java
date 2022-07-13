package Lift;


public class liftVO {
	
	private int li_cd;
	private String li_nm;
	private String li_ex;
	private int li_ct;
	
	public int getLi_ct() {
		return li_ct;
	}
	public void setLi_ct(int li_ct) {
		this.li_ct = li_ct;
	}
	public int getLi_cd() {
		return li_cd;
	}
	public void setLi_cd(int li_cd) {
		this.li_cd = li_cd;
	}
	public String getLi_nm() {
		return li_nm;
	}
	public void setLi_nm(String li_nm) {
		this.li_nm = li_nm;
	}
	public String getLi_ex() {
		return li_ex;
	}
	public void setLi_ex(String li_ex) {
		this.li_ex = li_ex;
	}
	@Override
	public String toString() {
		return String.format("%s\t %-7s\t %s\t %s\t\n", li_cd, li_nm, li_ex, li_ct);
	}
	public liftVO(int li_cd, String li_nm, String li_ex, int li_ct) {
		super();
		this.li_cd = li_cd;
		this.li_nm = li_nm;
		this.li_ex = li_ex;
		this.li_ct = li_ct;
	}
	public liftVO(String li_nm, String li_ex, int li_ct) {
		
		this.li_nm = li_nm;
		this.li_ex = li_ex;
		this.li_ct = li_ct;
	}
	
	}
