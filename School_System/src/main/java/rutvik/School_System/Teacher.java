package rutvik.School_System;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id =id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned =0;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	 public int getSalary() {
		 return salary;
	 }
	 
	 public void setSalary(int salary) {
		 this.salary =salary;
	 }
	 
	 /**
	  * add to salary
	  * remove Total money Eared from School;
	  * @param salary
	  */
	  public void receiveSalary(int salary) {
		  salaryEarned+=salary;
		  School.updateTotalMoneySpend(salary);
	  }

	@Override
	public String toString() {
		return  "\n TEACHER NAME    :"  +name+ "\n"+
				" TEACHER ID      :"  +id+ "\n"+
				" TEACHER SALARY  :"  +salary+ "\n";
	}
}
