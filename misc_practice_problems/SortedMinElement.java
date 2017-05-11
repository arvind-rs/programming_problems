import java.util.*;

//Wrong solution

public class SortedMinElement {

	public static void main(String[] args) {

		//int[] array = {3,4,5,6,7,1,2};
		int[] array = {2,3,4,5,6,7,1};

		findMin(array);
	}

	private static void findMin(int[] array) {

		if(array.length == 0) {
			System.out.println("Bad input");
			return;
		}
		if(array.length == 1) {
			System.out.println(array[0]);
			return;
		}

		System.out.println(Arrays.toString(array));

		int mid = (int)Math.ceil(array.length/2);
		int midElement = array[mid];

		int[] leftSubArray = Arrays.copyOfRange(array,0,mid);
		int[] rightSubArray = Arrays.copyOfRange(array,mid+1,array.length);

		System.out.println(Arrays.toString(leftSubArray));
		System.out.println(Arrays.toString(rightSubArray));

		int leftMidElement = leftSubArray[(int)Math.ceil(leftSubArray.length/2)];
		int rightMidElement = rightSubArray[(int)Math.ceil(rightSubArray.length/2)];

		System.out.println(midElement+","+leftMidElement+","+rightMidElement);

		if((leftMidElement < midElement) && (leftMidElement < rightMidElement))
			findMin(leftSubArray);
		else if((rightMidElement < midElement) && (rightMidElement < leftMidElement))
			findMin(rightSubArray);
		else
			System.out.println(mid);

		/*if(midElement > rightMidElement)
			findMin(rightSubArray);
		else if(leftMidElement > midElement)
			findMin(leftSubArray);
		else
			System.out.println(midElement);*/

	}
}