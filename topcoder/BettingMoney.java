import java.util.*;

public class BettingMoney {

	public static void main(String[] args) {

		int[] test1_amounts = {200,300,100}; int[] test1_cents = {10,10,10}; int test1_final = 2;
		int[] test2_amounts = {100,100,100,100}; int[] test2_cents = {5,5,5,5}; int test2_final = 0;
		int[] test3_amounts = {100}; int[] test3_cents = {10}; int test3_final = 0;

		System.out.println(moneyMade(test1_amounts,test1_cents,test1_final)); 
		System.out.println(moneyMade(test2_amounts,test2_cents,test2_final)); 
		System.out.println(moneyMade(test3_amounts,test3_cents,test3_final)); 
	}

	public static int moneyMade(int[] amounts, int[] cents, int finalResult) {

		System.out.println(Arrays.toString(amounts));
		System.out.println(Arrays.toString(cents));
		System.out.println(finalResult);

		int netGains = 0;
		int betterWins = 0;

		for(int i=0;i<amounts.length;i++) {
			if(i == finalResult)
				betterWins = betterWins + (amounts[i] * cents[i]);
			else
				netGains = netGains + amounts[i];
		}

		return (netGains * 100) - betterWins;
	}
}