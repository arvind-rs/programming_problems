import java.util.*;

public class SuperRot {

	public static void main(String[] args) {

		String test1 = "Uryyb 28";
		String test2 = "GbcPbqre";
		String test3 = "";
		String test4 = "5678901234";
		String test5 = "NnOoPpQqRr AaBbCcDdEe";
		String test6 = "Gvzr vf 54 71 CZ ba Whyl 4gu bs gur lrne 7558 NQ";
		String test7 = "Gur dhvpx oebja sbk whzcf bire n ynml qbt";

		/*System.out.println(decoder(test1));
		System.out.println(decoder(test2));
		System.out.println(decoder(test3));
		System.out.println(decoder(test4));
		System.out.println(decoder(test5));
		System.out.println(decoder(test6));
		System.out.println(decoder(test7));*/

		System.out.println(decoderNew(test1));
		System.out.println(decoderNew(test2));
		System.out.println(decoderNew(test3));
		System.out.println(decoderNew(test4));
		System.out.println(decoderNew(test5));
		System.out.println(decoderNew(test6));
		System.out.println(decoderNew(test7));
	}

	public static String decoder(String message) {

		System.out.println(message);

		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		//HashMap hm = new HashMap();

		hm.put('A','N');
		hm.put('B','O');
		hm.put('C','P');
		hm.put('D','Q');
		hm.put('E','R');
		hm.put('F','S');
		hm.put('G','T');
		hm.put('H','U');
		hm.put('I','V');
		hm.put('J','W');
		hm.put('K','X');
		hm.put('L','Y');
		hm.put('M','Z');
		hm.put('a','n');
		hm.put('b','o');
		hm.put('c','p');
		hm.put('d','q');
		hm.put('e','r');
		hm.put('f','s');
		hm.put('g','t');
		hm.put('h','u');
		hm.put('i','v');
		hm.put('j','w');
		hm.put('k','x');
		hm.put('l','y');
		hm.put('m','z');
		hm.put('N','A');		
		hm.put('O','B');		
		hm.put('P','C');		
		hm.put('Q','D');		
		hm.put('R','E');		
		hm.put('S','F');		
		hm.put('T','G');		
		hm.put('U','H');		
		hm.put('V','I');		
		hm.put('W','J');		
		hm.put('X','K');		
		hm.put('Y','L');		
		hm.put('Z','M');		
		hm.put('n','a');		
		hm.put('o','b');		
		hm.put('p','c');		
		hm.put('q','d');		
		hm.put('r','e');		
		hm.put('s','f');		
		hm.put('t','g');		
		hm.put('u','h');		
		hm.put('v','i');		
		hm.put('w','j');		
		hm.put('x','k');		
		hm.put('y','l');		
		hm.put('z','m');
		hm.put('0','5');
		hm.put('1','6');
		hm.put('2','7');
		hm.put('3','8');
		hm.put('4','9');
		hm.put('5','0');
		hm.put('6','1');
		hm.put('7','2');
		hm.put('8','3');
		hm.put('9','4');

		//System.out.println(hm.get('A'));

		String output = "";

		for(int i=0;i<message.length();i++) {
			//System.out.println(message.charAt(i));
			//System.out.println(hm.get(message.charAt(i)));
			if(message.charAt(i) == ' ')
				output += " ";
			else 
				output += hm.get(message.charAt(i));
		}

		return output;
	}

	public static String decoderNew(String message) {

		System.out.println(message);

		String output = "";

		for(int i=0;i<message.length();i++) {
			if((int)message.charAt(i) == 32)
				output += " ";
			else if(message.charAt(i)>=65 && message.charAt(i)<78)
				output += (char)((int)message.charAt(i) + 13);
			else if(message.charAt(i)>=78 && message.charAt(i)<91)
				output += (char)((int)message.charAt(i) - 13);
			else if(message.charAt(i)>=97 && message.charAt(i)<110)
				output += (char)((int)message.charAt(i) + 13);
			else if(message.charAt(i)>=110 && message.charAt(i)<123)
				output += (char)((int)message.charAt(i) - 13);
			else if(message.charAt(i)>=48 && message.charAt(i)<53)
				output += (char)((int)message.charAt(i) + 5);
			else if(message.charAt(i)>=53 && message.charAt(i)<58)
				output += (char)((int)message.charAt(i) - 5);
		}

		return output;
	}
}