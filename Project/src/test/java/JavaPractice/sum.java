package JavaPractice;

public class sum {
public static void main(String[] args) {
	
	
	int arr[]= {20,10,30,40,10};
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum = sum+arr[i];
	}
	System.out.println(sum);
}
}
