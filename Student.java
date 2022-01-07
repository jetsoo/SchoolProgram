package funproject;



public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		feesTotal = 30000;
		feesPaid = 0;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
		
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}


	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	@Override
	public String toString() {
		return "Students name: " + name +
				" Total fees paid so far: " + feesPaid;
	}
	
}
