package JavaPractice;

class L
{
	public void test1()
	{
		System.out.println("testl");
	}
}

class M extends L
{
	public void test2()
	{
		System.out.println("testm");
	}
}
public class AA {
	
	public static void main(String[] args) {
		
		L l1= new M();
		l1.test1();
		
		M m1=(M)l1;
		m1.test1();
		m1.test2();
		
	}

}


