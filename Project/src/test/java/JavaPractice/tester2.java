package JavaPractice;

public class tester2 {

	public static void main(String[] args) {
		
		String str="india";
		for(int i=0;i<=str.length()-1;i++)
		{
			str=str.substring(0, 1).toUpperCase()+str.substring(1).toLowerCase();
		}
		System.out.println(str);
	}
}
