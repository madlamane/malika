package mypackage;

public class Student {
	private int studentid;
	private String studentname;
	private int marks;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
		
	}
	private Course cr;
	public Course getCr() {
		return cr;
	}
	public void setCr(Course cr) {
		this.cr = cr;
	}
	public Student() {}
	
	
	public Student(int id, String name, Course cr)
	{
		studentid=id;
		studentname=name;
		this.cr=cr;
		
		
	}
	

}
