package org.cts;

public class FeeStructure extends OmrBranch {
	
	double amount;
	public void javaPayment() {
		System.out.println("8000.00");
	}
	
	public void oraclePayment() {
		System.out.println("9000.00");
	}
	
	public void sqlPayment() {
		System.out.println("12000.00");
	}
	
	public static void main(String[] args) {
		
		FeeStructure fee = new FeeStructure();
		fee.empName();
		fee.empAdd();
		fee.javaCourse();
		fee.javaPayment();
		fee.oracleCourse();
		fee.oraclePayment();
		fee.sqlCourse();
		fee.sqlPayment();
		
	}


}
