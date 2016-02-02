package com.training.employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(123, "XYZ", 10000);
		System.out.println(employee);
		Employee obj1 = new Employee(111, "ABC", 100);
		Employee obj2 = new Employee(111, "ABC", 100);
		if (obj1.equals(obj2)) {
			System.out.println("Both objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
	}

}
