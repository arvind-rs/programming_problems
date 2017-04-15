import java.util.*;

public class NamingConvention {

	public static void main(String[] args) {

		String test1 = "sum_of_two_numbers";
		String test2 = "variable";
		String test3 = "t_o_p_c_o_d_e_r";
		String test4 = "the_variable_name_can_be_very_long_like_this";

		System.out.println(toCamelCase(test1));
		System.out.println(toCamelCase(test2));
		System.out.println(toCamelCase(test3));
		System.out.println(toCamelCase(test4));
	}

	public static String toCamelCaseDep(String variableName) {

		System.out.println(variableName);

		int flag = 0;
		StringBuilder newString = new StringBuilder(variableName);

		for(int i=0;i<variableName.length();i++) {
			//System.out.println(newString.toString());
			if(variableName.charAt(i) == '_') {
				System.out.println("foo"+variableName.charAt(i));
				newString.replace(i,i+1,"");
				flag = 1;
				//continue;
			}
			else if(flag == 1) {
				System.out.println("bar"+variableName.charAt(i));
				String upperCase = (variableName.charAt(i) + "").toUpperCase();
				newString.replace(i-1,i,upperCase);
				flag = 0;
			}
			System.out.println(newString.toString());
		}

		return newString.toString();
	}

	public static String toCamelCase(String variableName) {

		System.out.println(variableName);

		StringBuilder newString = new StringBuilder(variableName);

		for(int i=0;i<variableName.length()-1;i++) {
			if(variableName.charAt(i) == '_') {
				String upperCase = (variableName.charAt(i+1) + "").toUpperCase();
				newString.replace(i+1,i+2,upperCase);
			}
		}

		String returnString = newString.toString().replace("_","");

		return returnString;
	}
}