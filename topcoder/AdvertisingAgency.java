import java.util.*;

public class AdvertisingAgency {

	public static void main(String[] args) {

		int[] test1 = {1,2,3};
		int[] test2 = {1,1,1};
		int[] test3 = {1,2,1,2};
		int[] test4 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100
};

		System.out.println(numberOfRejections(test1));
		System.out.println(numberOfRejections(test2));
		System.out.println(numberOfRejections(test3));
		System.out.println(numberOfRejections(test4));
	}

	public static int numberOfRejections(int[] requests) {

		System.out.println(Arrays.toString(requests));

		HashSet<Integer> hs = new HashSet<Integer>();

		int rejections = 0;

		for(int i=0;i<requests.length;i++) {
			if(!hs.contains(requests[i])) {
				hs.add(requests[i]);
			}
			else {
				rejections++;
			}
		}

		return rejections;
	}
}