package rutvik.School_System;
/**
 * keeping track of student
 *
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * 
	 * @param id unique id
	 * @param name name of student
	 * @param grade grade of student
	 */
	
	public Student(int id, String name,int grade ) {
		this.feesPaid =0;
		this.feesTotal = 30000;
		this.id = id;
		this.name =name;
		this.grade =grade;
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * 
	 * @param fees keeps on adding fees
	 */
	public void payfees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
/**
 * 
 * @return get id of student
 */
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	

	public int getFeesPaid() {
		return feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}


	public int getGrade() {
		return grade;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return " \nSTUDENT Name         : " +name+ "\n"+
			   " STUDENT ID           : " + id + "\n"+
			   " GRADE                : "+grade+ "\n"+
			   " FEES PAID TILL NOW   : $ " + feesPaid+ "\n"+
			   " TOTAL FEES PENDING   : $ "+feesTotal+"\n";
	}
	

}
