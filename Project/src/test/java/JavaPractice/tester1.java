package JavaPractice;

class A
{
	
}
public class tester1 {

	public static void main(String[] args) {
		
		
		String str="Madam";
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		if(str.equalsIgnoreCase(str1))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}
