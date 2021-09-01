package example;

import java.util.Set;

public class College {
	private int collegecode;
	public int getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(int collegecode) {
		this.collegecode = collegecode;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	private String collegename;
	private Set <Student> s;
	
	public Set<Student> getS() {
		return s;
	}
	public void setS(Set<Student> s) {
		this.s = s;
	}
	public College() {}
	
	

}
