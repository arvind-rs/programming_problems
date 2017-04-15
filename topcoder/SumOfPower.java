import java.util.*;

public class SumOfPower {

	public static void main(String[] args) {

		int[] test1 = {1,2,3,4};
		int[] test2 = {1,2};
		int[] test3 = {1,1,1};
		int[] test4 = {3,14,15,92,65};
		int[] test5 = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(findSum(test1));
		System.out.println(findSum(test2));
		System.out.println(findSum(test3));
		System.out.println(findSum(test4));
		System.out.println(findSum(test5));
	}

	public static int findSum(int[] array) {

		System.out.println(Arrays.toString(array));

		int result = 0;

		for(int i=0;i<array.length;i++) {
			//System.out.println(Arrays.toString(Arrays.copyOfRange(array,i,array.length)));
			result += findSubsequence(0,0,Arrays.copyOfRange(array,i,array.length));
			//System.out.println("result="+result);

		}

		return result;
	}

	private static int findSubsequence(int result,int level,int[] subarray) {

		

		if(subarray.length==0) {
			return result;
		}

		for(int k=0;k<subarray.length;k++)
			result += subarray[k];

		//System.out.println(level);
		//level++;

		int[] newarr = Arrays.copyOfRange(subarray,0,subarray.length-1);
		//System.out.println(Arrays.toString(newarr));

		return findSubsequence(result,level,newarr);

		
	}
}