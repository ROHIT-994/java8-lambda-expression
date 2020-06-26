package Lambda;
import java.util.*;
import java.util.stream.*;

public class AvgofList {
	static void Average(List<Integer> lis)
	{
		
		lis.stream() 
	    .mapToInt(i -> i) 
	    .average() 
	    .ifPresent(avg -> System.out.println("Average found is " + avg));
				
	}
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(22);
		list.add(45);
		list.add(5);
		list.add(10);
		list.add(4);
		Average(list);
	}

}
