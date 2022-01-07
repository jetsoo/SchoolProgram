package funproject;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;
	
	
	public School(List<Teacher> teachers,List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpend = 0;
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudent(Student student) {
		students.add(student);
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}


	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}


	public static void updateTotalMoneySpend(int moneySpend) {
		totalMoneyEarned -= moneySpend;
	}
	 
	
}
