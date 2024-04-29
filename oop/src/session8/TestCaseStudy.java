package session8;

import java.util.ArrayList;

public class TestCaseStudy {

	public static void main(String[] args) {
		
		fulltimeEmployeeTotalSalary();
		System.out.println("-----------------------------------------------------------------");
		parttimeEmployeeTotalWage();
		System.out.println("-----------------------------------------------------------------");
		totalAmountDistributedAsSalary(); 
		System.out.println("-----------------------------------------------------------------");
		totalStationaryItemPrice(); 
		System.out.println("-----------------------------------------------------------------");
		totalCompanyCost();
	}

	private static void totalCompanyCost() {		
		ArrayList<ICompanyTotalExpenses> expenses = new ArrayList<ICompanyTotalExpenses>();
		
		//Fulltime employees
		Name name1 = new Name("Komal", "Jain");
		Address address1 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		expenses.add(new Teacher(101, name1, address1, 500000.0, "Teaching Work"));
		
		Name name2 = new Name("Neha", "Singh");
		Address address2= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		expenses.add(new Manager(102, name2, address2, 1200000.0, "Managing HR Dept"));
		
		//Parttime employees
		Name name3 = new Name("Jojo", "Jain");
		Address address3 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		expenses.add(new Cook(103, name3, address3, 40.0, 500.0, "Cooking work"));
		
		Name name4 = new Name("Hunny", "Singh");
		Address address4= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		expenses.add(new Sweeper(104, name4, address4, 40.0 ,400.0, "Sweeping work"));		

		//Stationary items
		expenses.add(new Marker("Raynold Whiteboard", 20, 30.0, "Used to write on whiteboard"));
		expenses.add(new Duster("HPC Duster", 10, 70.0, "Used to clean whiteboard"));
		
		double totalCompanyCost = 0;
		for(ICompanyTotalExpenses expense:expenses) {
			totalCompanyCost = totalCompanyCost + expense.totalExpenses();
		}
		
		System.out.println("Total Amount distributed by company = "+totalCompanyCost);
		
	}

	private static void totalStationaryItemPrice() {
		ArrayList<StationaryItems> stationaryItems = new ArrayList<StationaryItems>();
		stationaryItems.add(new Marker("Raynold Whiteboard", 20, 30.0, "Used to write on whiteboard"));
		stationaryItems.add(new Duster("HPC Duster", 10, 70.0, "Used to clean whiteboard"));
		
		double totalPrice = 0;
		for(StationaryItems item: stationaryItems) {
			totalPrice = totalPrice + item.calculateTotalPrice();
		}
		
		System.out.println("Total Stationary Item's price is: "+totalPrice);
	}

	private static void totalAmountDistributedAsSalary() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Name name1 = new Name("Komal", "Jain");
		Address address1 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		employees.add(new Teacher(101, name1, address1, 500000.0, "Teaching Work"));
		
		Name name2 = new Name("Neha", "Singh");
		Address address2= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		employees.add(new Manager(102, name2, address2, 1200000.0, "Managing HR Dept"));
		
		Name name3 = new Name("Jojo", "Jain");
		Address address3 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		employees.add(new Cook(103, name3, address3, 40.0, 500.0, "Cooking work"));
		
		Name name4 = new Name("Hunny", "Singh");
		Address address4= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		employees.add(new Sweeper(104, name4, address4, 40.0 ,400.0, "Sweeping work"));
		
		double totalAmountDistributed = 0;
		for(Employee employee:employees) {
			totalAmountDistributed = totalAmountDistributed+ employee.totalSalary();
		}
		
		System.out.println("Total Amount distributed to parttime and fulltime employees = "+totalAmountDistributed);
		
	}

	private static void parttimeEmployeeTotalWage() {
		ArrayList<PartTimeEmployee> partTimeEmployees = new ArrayList<PartTimeEmployee>();
		Name name3 = new Name("Jojo", "Jain");
		Address address3 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		partTimeEmployees.add(new Cook(103, name3, address3, 40.0, 500.0, "Cooking work"));
		
		Name name4 = new Name("Hunny", "Singh");
		Address address4= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		partTimeEmployees.add(new Sweeper(104, name4, address4, 40.0 ,400.0, "Sweeping work"));
		
		double totalWage = 0;
		for(PartTimeEmployee partTimeEmployee:partTimeEmployees) {
			totalWage = totalWage+ partTimeEmployee.calculateWage();
		}
		
		System.out.println("Total wage distributed to parttime employees = "+totalWage);
		
	}

	private static void fulltimeEmployeeTotalSalary() {
		ArrayList<FullTimeEmployee> fulltimeEmployees = new ArrayList<FullTimeEmployee>();
		Name name1 = new Name("Komal", "Jain");
		Address address1 = new Address("India", "Himanchal Pradesh", "Solan", "Shoolini University", "777888");
		fulltimeEmployees.add(new Teacher(101, name1, address1, 500000.0, "Teaching Work"));
		
		Name name2 = new Name("Neha", "Singh");
		Address address2= new Address("India", "Himanchal Pradesh", "Solan", "Dental College", "888999");
		fulltimeEmployees.add(new Manager(102, name2, address2, 1200000.0, "Managing HR Dept"));
		
		double totalSalary = 0;
		for(FullTimeEmployee employee:fulltimeEmployees) {
			totalSalary = totalSalary+ employee.calculateSalary();
		}
		
		System.out.println("Total salary distributed to fulltime employees = "+totalSalary);
		
	}

}
