import java.util.*;

public class MovingAvg {

	public static void main(String[] args) {

		int k_0 = 2;
		double[] data_0 = {3,8,9,15};

		int k_1 = 3;
		double[] data_1 = {17,6.2,19,3.4};

		int k_2 = 3;
		double[] data_2 = {6,2.5,3.5};

		System.out.println(difference(k_0,data_0));
		System.out.println(difference(k_1,data_1));
		System.out.println(difference(k_2,data_2));
	}

	public static double difference(int k,double[] data) {

		System.out.println(k);
		System.out.println(Arrays.toString(data));

		if(data.length<=0)
			return -1;


		double min = 99999999;
		double max = 0.0;
		

		for(int i=0;i+(k-1)<data.length;i++) {

			double sum = 0.0;
			for(int j=0;j<k;j++) {
				sum += data[i+j];
				//System.out.println(data[i+j]);
			}
			double avg = sum / (float)k;
			//System.out.println(sum);
			//System.out.println(avg);

			if(avg<min)
				min = avg;
			else if(avg>max)
				max = avg;
		}

		//Arrays.sort(averages);
		//System.out.println(max+";"+min);


		return (max - min);
	}
}