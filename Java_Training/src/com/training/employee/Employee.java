package com.training.employee;

public class Employee {
	private Long emp_id;
	private String emp_name;
	private Double salary;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee id is: " + emp_id + "\nEmployee name is:" + emp_name + "\nEamployee Salary is: " + salary
				+ " ";

	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (this.getClass() == obj.getClass()) {
			Employee employee1 = (Employee) obj;
			if ((employee1.emp_id).equals(this.emp_id) && (employee1.emp_name).equals(this.emp_name)
					&& (employee1.salary).equals(this.salary)) {
				isEqual = true;
			}

		}
		return isEqual;

		// TODO Auto-generated method stub

	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(long emp_id, String emp_name, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

}
