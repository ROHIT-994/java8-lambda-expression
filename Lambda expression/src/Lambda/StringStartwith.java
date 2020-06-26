package Lambda;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StringStartwith {
	public static List<String> search(List<String> li) {
		return li
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>();
		 list.add("apple"); 
	        list.add("arm"); 
	        list.add("bob");
	        list.add("aaa");
	        list.add("axe");
	        list.add("zavier");
	        List<String> res = search(list); 
	        System.out.println(res);
		 
            
		
	}

}
