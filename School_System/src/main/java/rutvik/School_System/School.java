package rutvik.School_System;

import java.util.List;

/**
 * using ArrayList
 */

public class School {
	private static String name;
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;
	/**
	 * 
	 * @param teachers list of teacher in school
	 * @param students list of student in school
	 */
	public School(String name, List<Teacher> teachers, List<Student> students) {
		this.name =name;
		this.teachers = teachers;
		this.students = students;
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
	public void addStudents(Student student) {
		students.add(student);
	}
	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	public static int getTotalMoneySpend() {
		return totalMoneySpend;
	}
	public static String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param MoneySpend By giving Salary given by the school to teacher
	 * --->Doubt
	 */
	public static void updateTotalMoneySpend(int MoneySpend) {
		totalMoneyEarned -= MoneySpend;
	}
	@Override
	public String toString() {
		return  "Money Spend by School           : " +totalMoneySpend+ "\n\n"+
				"Money Earned by School          : " + totalMoneyEarned +"\n\n"+
				"Total Number Of Student Present : "+ students.size()+"\n\n"+
				"Total Number Of Teachers Present: "+ teachers.size()+"\n\n";
				
	}
	
}
//"Teachers Presnt In the School   : " +"\n"+ teachers+"\n\n"+
//"Students Presnt In the School   : " + "\n"+students+"\n"
