import java.util.*;

public class LargestSubsequenceReference {

	public static void main(String[] args) {

		String test_0 = "test";
		String test_1 = "abcd";
		String test_2 = "aquickbrownfoxjumpsoverthelazydog";
		String test_3 = "zyxwuvu";

		System.out.println(getLargest(test_0));
		System.out.println(getLargest(test_1));
		System.out.println(getLargest(test_2));
		System.out.println(getLargest(test_3));
	}
 
  public static String getLargest(String s) {
    String ret="";
    int min;
    
    for(int i=0; i<s.length(); i++){
      min = i;
      for(int j=i+1; j<s.length(); j++){
        if(s.charAt(j)>s.charAt(min)){
          min=j;
        }
      }
      
      ret += s.charAt(min);
      //System.out.println(ret);
      i=min;
    }
    
    return ret;
  }
 
}