import java.util.*;

public class EscapeFromRectangle {

	public static void main(String[] args) {

		double test1_x = 1; double test1_y = 1; double test1_w = 5; double test1_h = 5;
		double test2_x = 653; double test2_y = 375; double test2_w = 1000; double test2_h = 1000;
		double test3_x = 161; double test3_y = 181; double test3_w = 762; double test3_h = 375;

		System.out.println(shortest(test1_x,test1_y,test1_w,test1_h));
		System.out.println(shortest(test2_x,test2_y,test2_w,test2_h));
		System.out.println(shortest(test3_x,test3_y,test3_w,test3_h));
	}

	public static int shortest(double x, double y, double w, double h) {

		System.out.println(x+","+y+","+w+","+h);

		int top = (int)Math.sqrt(Math.pow(h-y,2));
		int bottom = (int)Math.sqrt(Math.pow(0-y,2));
		int left = (int)Math.sqrt(Math.pow(0-x,2));
		int right = (int)Math.sqrt(Math.pow(w-x,2));

		//System.out.println(top);

		int shortest = Math.min(top,Math.min(bottom,Math.min(left,right)));

		return shortest;
	}
}