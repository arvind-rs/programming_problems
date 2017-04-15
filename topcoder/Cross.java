import java.util.*;

public class Cross {

	public static void main(String[] args) {

		String[] test1 = {".##",
 						"###",	
 						"##."};

 		String[] test2 = {".##",
 						"###",
 						"#.."};

 		String[] test3 = {"######",
 						"######",
 						"######",
 						"######",
 						"######",
 						"######",
 						"######"};


 		String[] test4 = {".#.#",
 						"#.#.",
 						".#.#",
 						"#.#."};

 		String[] test5 = {".#.#",
 						"###.",
 						".###",
 						"#.#."};


 		System.out.println(exist(test1));
 		System.out.println(exist(test2));
 		System.out.println(exist(test3));
 		System.out.println(exist(test4));
 		System.out.println(exist(test5));
	}

	public static String exist(String[] board) {

		for(int i = 1; i < board.length - 1; i++) {
			for(int j = 1; j < board[i].length() - 1; j++) {
				if((board[i].charAt(j) + "").equals("#") && (board[i - 1].charAt(j) + "").equals("#") && (board[i + 1].charAt(j) + "").equals("#") && (board[i].charAt(j - 1) + "").equals("#") && (board[i].charAt(j + 1) + "").equals("#"))
					return "Exists";
			}
		}

		return "Does not exist";
	}
}