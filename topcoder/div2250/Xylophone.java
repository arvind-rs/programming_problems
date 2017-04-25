import java.util.*;

public class Xylophone {

	public static void main(String[] args) {

		int[] test1 = {1,8,3};

		int[] test2 = {7,3,2,4,1,5,6};

		int[] test3 = {1,8,15};

		int[] test4 = {25,1,17,9,8};

		int[] test5 = {11,11,11,11,11,11,11,11,11,11,11};

		int[] test6 = {50,10,20,30,11,30,24,38,5,2,9};


		System.out.println(countKeys(test1));
		System.out.println(countKeys(test2));
		System.out.println(countKeys(test3));
		System.out.println(countKeys(test4));
		System.out.println(countKeys(test5));
		System.out.println(countKeys(test6));
	}

	public static int countKeys(int[] keys) {

		System.out.println(Arrays.toString(keys));

		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(new Integer(1),"A");
		hashMap.put(new Integer(2),"B");
		hashMap.put(new Integer(3),"C");
		hashMap.put(new Integer(4),"D");
		hashMap.put(new Integer(5),"E");
		hashMap.put(new Integer(6),"F");
		hashMap.put(new Integer(0),"G");

		HashSet<String> hashSet = new HashSet<String>();

		for(int i = 0;i < keys.length; i++){
			int number = keys[i] % 7;
			String character = hashMap.get(new Integer(number));
			hashSet.add(character);
		}

		return hashSet.size();
	}
}