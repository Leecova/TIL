package memo;

import java.sql.Date;

// VO(Value Object) (값만 들어간거)
// DTO(Data Transfer Object) (값을 이동시킬때)
// Model
// Item
public class MemoVO {
	private int id;
	private String title;
	private String contents;
	private Date registerDate;
	private Date modifyDate;
	
	public MemoVO() {
		
	}
	
	
	public MemoVO(int id, String title, String contents, Date registerDate, Date modifyDate) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return "MemoVO [id=" + id + ", title=" + title + ", contents=" + contents + ", registerDate=" + registerDate
				+ ", modifyDate=" + modifyDate + "]";
	}

}
