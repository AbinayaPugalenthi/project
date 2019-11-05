package org.cts;

import org.cts.EmployeeDetails;
	
public class OmrBranch extends EmployeeDetails {
	
	public void javaCourse() {
		System.out.println("JAVA");
	}
	
	public void oracleCourse() {
		System.out.println("Oracle");
	}
	
	public void sqlCourse() {
		System.out.println("Sql");
	}
	
	public static void main(String[] args) {
		OmrBranch course = new OmrBranch();
		course.empAdd();
		course.empName();
		course.javaCourse();
		course.oracleCourse();
		course.sqlCourse();
		
	}
}
