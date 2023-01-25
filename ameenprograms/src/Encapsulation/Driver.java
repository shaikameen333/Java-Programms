package Encapsulation;

public class Driver {
	public static void displaydetails(Employee e) {
		System.out.println("Name: "+e.getname());
		System.out.println("EID: "+e.geteid());
		System.out.println("Salary: "+e.getsalary());
		System.out.println("De3signation: "+e.getdesignation());
		System.out.println();
	}
	public static void main(String[] args) {
		Employee e1=new Employee("ameen",003,35000,"Software engineer");
		Employee e2=new Employee("nagu",004,450000,"Software developer");
		displaydetails(e1);
		displaydetails(e2);
	}


}
