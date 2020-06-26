package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PalindromicString {
	public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("bob");
        list.add("disney");
        list.add("MoM");
        list.add("xyzzyx");
        list.add("Epam");
        List<String> p =PalindromicString.findingPalindromes(list, 
                (s) -> PalindromicString.check((String) s));
 
        System.out.println("List of Palindromes are: " +p);
    }
 
    public static boolean check(String s) {
    	StringBuffer reverse =new StringBuffer();
    	for(int i = s.length()-1; i >= 0 ; i--) {
    	reverse = reverse.append(s.charAt(i));
    	}
    	if(s.equalsIgnoreCase(reverse.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findingPalindromes(List<String> list, Predicate<String> predicate) { 
    	List<String> result = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            result.add((String) i);
        });
        return result;
 
    }

}
