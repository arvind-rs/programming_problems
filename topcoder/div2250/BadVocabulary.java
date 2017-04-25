import java.util.*;

public class BadVocabulary {

	public static void main(String[] args) {

		String test1_prefix = "bug";
		String test1_suffix = "bug";
		String test1_substring = "bug";
		String[] test1_vocabulary = {"buggy", "debugger", "debug"};

		String test2_prefix = "cut";
		String test2_suffix = "sore";
		String test2_substring = "scar";
		String[] test2_vocabulary = {"scary", "oscar"};

		String test3_prefix = "bar";
		String test3_suffix = "else";
		String test3_substring = "foo";
		String[] test3_vocabulary = {"foofoofoo", "foobar", "elsewhere"};

		String test4_prefix = "pre";
		String test4_suffix = "s";
		String test4_substring = "all";
		String[] test4_vocabulary = {"all", "coders", "be", "prepared", "for", "the", "challenge", "phase"};


		System.out.println(count(test1_prefix,test1_suffix,test1_substring,test1_vocabulary));
		System.out.println(count(test2_prefix,test2_suffix,test2_substring,test2_vocabulary));
		System.out.println(count(test3_prefix,test3_suffix,test3_substring,test3_vocabulary));
		System.out.println(count(test4_prefix,test4_suffix,test4_substring,test4_vocabulary));
	}

	public static int count(String prefix,String suffix,String substring,String[] vocabulary) {

		System.out.println(prefix);
		System.out.println(suffix);
		System.out.println(substring);
		System.out.println(Arrays.toString(vocabulary));

		int count = 0;
		int p = prefix.length();
		int s = suffix.length();
		int st = substring.length();

		for(int i=0;i<vocabulary.length;i++) {
			String current = vocabulary[i];

			int j = 0;
			if(current.length() >= p && current.substring(j,j+p).equals(prefix))
				count++;

			j = current.length();
			if(current.length() >= s && current.substring(j-s,j).equals(suffix))
				count++;

			current = current.substring(1,current.length()-1);
			for(int k=0;k+st<current.length();k++)
				if(current.substring(k,k+st).equals(substring))
					count++;
		}

		return count;
	}
}