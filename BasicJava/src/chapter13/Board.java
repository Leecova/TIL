package chapter13;

import java.util.Objects;

public class Board {
	private String subject;
	private String content;
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	private String writer;
	
	public Board(String subjcet, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, subject, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(content, other.content) && Objects.equals(subject, other.subject)
				&& Objects.equals(writer, other.writer);
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", subject, content, writer);
	}
	
	
	
}
