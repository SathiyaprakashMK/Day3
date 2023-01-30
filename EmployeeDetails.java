package week2.day1;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName();
		emp.getEmployeeAddress();
		emp.printEmployeeSalary();
		emp.printEmployeeMobileNumber();

	}
	public void printEmployeeName() {
		String empName="Ram";
		int empId=101;
		System.out.println("Employee Name : "+empName+"\nEmployee ID : "+empId);

	}
	public void getEmployeeAddress() {
		String empAddress="Chennai";
		System.out.println("Employee Address : "+empAddress);
	}
	public void printEmployeeSalary() {
		double empSalary=20000;
		System.out.println("Employee Salary : "+empSalary);
	}
	public void printEmployeeMobileNumber() {
		long mobNum=8877665544l;
		System.out.println("Empoyee Mobile Number : "+mobNum);
	}
}
