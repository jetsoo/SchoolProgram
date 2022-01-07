package funproject;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	private int hours;
	private String fach;
	
	
	public Teacher(int id, String name,int salary,int hours,String fach) {
		this.id=id;
		this.name=name;
		salaryEarned =0;
		this.hours=hours;
		this.fach=fach;
		this.salary=salary;
		
		
	}
	
	
	
	public String getFach() {
		return fach;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpend(salary);
		
	}
	
	@Override
	public String toString() {
		return "name of the teacher: " + name + " Salary earned :" + salaryEarned;
	}






}
