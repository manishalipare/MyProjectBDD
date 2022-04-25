package JavaPractice;

class P
{
	int a=10;
	P(int a)
	{
		System.out.println("We are in class P" +a);
	}	
}

class Q extends P
{
	Q()
	{
		super(10);
		System.out.println("We are in class Q");
	}
}
public class Empltoyee1 {

	public static void main(String[] args) {
		Q q1= new Q();
	}
}
