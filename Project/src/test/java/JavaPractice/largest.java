package JavaPractice;

public class largest {
 public static void main(String[] args) {
	

	int arr[]= {11,12,34,5,3};
	int max=arr[0];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Largest no is " +max);
}
 

 
}
