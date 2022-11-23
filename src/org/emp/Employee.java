package org.emp;

public class Employee {
	   public void empId() {
			// TODO Auto-generated method stub
		System.out.println("Employee Id: 07");
		}
		   public void empName() {
			// TODO Auto-generated method stub
		System.out.println("Employee Name: Emima"); 
		}
		   private void empDob() {
			// TODO Auto-generated method stub
System.out.println("Employee DOB: 07-01-1995");
		}
		   private void empPhone() {
			// TODO Auto-generated method stub
System.out.println("Employee Ph:9384399679");
		}
		   private void empEmail() {
			// TODO Auto-generated method stub
System.out.println("Employee Email: emi.pauldurai@gmail.com");
		}
			private void empAddress() {
			// TODO Auto-generated method stub
System.out.println("Employee Address: Chennai");
		}
		   public static void main(String[] args) {
			Employee e = new Employee();
		   e.empId();
		   e.empName();
		   e.empDob();
		   e.empPhone();
		   e.empEmail();
		   e.empAddress();
		}

}
