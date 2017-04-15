import java.util.*;

public class SearchBox {

	public static void main(String[] args) {

		String test1_text = "We dont need no education";
		String test1_search = "ed";
		String test1_whole = "N";
		int test1_start = 13;

		String test2_text = "We dont need no thought control";
		String test2_search = "We";
		String test2_whole = "Y";
		int test2_start = 0;

		String test3_text = "No dark sarcasm in the classroom";
		String test3_search = "The";
		String test3_whole = "Y";
		int test3_start = 5;

		String test4_text = "Teachers leave them kids alone";
		String test4_search = "kid";
		String test4_whole = "Y";
		int test4_start = 1;

		String test5_text = "All in all its just another brick in the wall";
		String test5_search = "all";
		String test5_whole = "Y";
		int test5_start = 9;

		String test6_text = "All in all youre just another brick in the wall";
		String test6_search = "just";
		String test6_whole = "Y";
		int test6_start = 17;

		System.out.println(find(test1_text,test1_search,test1_whole,test1_start));
		System.out.println(find(test2_text,test2_search,test2_whole,test2_start));
		System.out.println(find(test3_text,test3_search,test3_whole,test3_start));
		System.out.println(find(test4_text,test4_search,test4_whole,test4_start));
		System.out.println(find(test5_text,test5_search,test5_whole,test5_start));
		System.out.println(find(test6_text,test6_search,test6_whole,test6_start));
	}

	public static int find(String text, String search, String whole, int start) {

		System.out.println(text);
		System.out.println(search);
		System.out.println(whole);
		System.out.println(start);

		int N = search.length();
		int result = -1;

		for(int i=start;i+N < text.length();i++) {
			String current = text.substring(i,i+N);
			if(search.equals(current)) {
				result = i;
				if(whole.equals("Y")) {
					if(((i == 0) || (i > 0 && text.substring(i-1,i).equals(" "))) && ((i + N == text.length()-1) || (i + N < text.length() - 1 && text.substring(i+N,i+N+1).equals(" "))))
						result = i;
					else
						result = -1;
				}
			}
		}

		return result;
	}
}