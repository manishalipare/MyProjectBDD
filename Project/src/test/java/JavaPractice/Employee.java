package JavaPractice;

public class Employee {
     
	int id;
	String name;
	long mobile;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		
		System.out.println("id is " +id);
		System.out.println("name is " +name);
		
	}
	
	public Employee(int id,String name,long mobile) {
		this(id,name);
		this.mobile=mobile;
		
		
		System.out.println("mobile is " +mobile);
		
	}
	
	public static void main(String[] args) {
		
		Employee E = new Employee(11, "Manisha");
		Employee E1 = new Employee(13, "Dhruv", 987654);
		
	}
}


