package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;


class Z
{
	
}
public class arralist1 {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	list.add(11);
	list.add(12.5);
	list.add("Manisha");
	list.add(new Z());
	
	System.out.println(list);
	list.remove(0);
	System.out.println(list);
	
	
	
	ArrayList list1= new ArrayList();
	list1.add(15);
	list1.add(14);
	list1.add(13.5);
	Collections.sort(list1);
	System.out.println(list1);
	
	
}
}
