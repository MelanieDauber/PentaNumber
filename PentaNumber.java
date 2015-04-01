/* Melanie Dauber
 * mpdaube@emory.edu (username: mpdaube)
 * I worked on this assignment alone, using only this semester's course materials.
 */

/*This program takes a String input in Pentadecimal form and converts to an Integer in decimal form.
 * It also takes an Integer decimal number and converts it to a Pentadecimal number in String form.
 */ 

package hw2;
import java.util.Scanner;

public class PentaNumber {

	//Converts string into Array of Characters
	public static int parsePenta(String s){
	    char[] chars=s.toCharArray();

	    Character[] characters=new Character[chars.length];
	    for (int i = 0; i < chars.length; i++) {
	        characters[i]=chars[i];
	    }
	    //if input Pentadecimal number is 0 the Decimal value is also 0.
		if (s.equals("0")){
			System.out.println("0");
		}
		
		//if Pentadecimal value entered is negative
		boolean flag;
    	if (chars[0] == '-'){
    		flag = true;
    		
	    }else{
	    	flag = false;
	    }
		
		double y = 0;
		int sum = 0;
		
		//if Pentadecimal value is negative, stop the for loop before it iterates through the negative sign.
		for(int j=chars.length-1; j >= 0; j--){
			if (flag == true){
				if (j == 0){
					break;
				}
			}
			//This compares each char in the array to see if it matches a digit in the input value.
			//If the char and input value match it converts to pentadecimal.
			if (chars[j] == '1'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *1;
			}else if (chars[j] == '2'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *2;
			}else if (chars[j] == '3'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *3;
			}else if  (chars[j] == '4'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *4;
			}else if (chars[j] == '5'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *5;
			}else if (chars[j] == '6'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *6;
			}else if (chars[j] == '7'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *7;
			}else if (chars[j] == '8'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *8;
			}else if (chars[j] == '9'){
				y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *9;
			}else if (chars[j] == 'A'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *10;
			}else if (chars[j] == 'Z'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *11;
			}else if (chars[j] == 'Q'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *12;
			}else if (chars[j] == 'J'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *13;
			}else if (chars[j] == 'G'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *14;
			}else if (chars[j] == '0'){
				 y = Math.pow(15.0, (Math.abs(j-(chars.length-1)))) *0;
			}else{
				System.out.println("I'm sorry this is not a valid Pentadecimal value.");
				return -1;
			}
			sum = sum + (int)y;
		//changes to negative value if negative	
		}if (flag == true){
		sum = -sum;
		}else{
	}
		return sum;
}
	public static String toString(int a){
		//counts how many digits are in the input decimal integer
		final int number = a;
    	final int digits = 1 + (int)Math.floor(Math.log10(number));
    	if (a == 0){
    		System.out.println("0");
    	}
    	//checks if input decimal integer is negative
    	boolean flag;
    	if (a < 0){
	    	flag = true;
	    }else{
	    	flag = false;
	    }
		a = Math.abs(a);
    	
		//converts decimal integer to pentadecimal value by dividing int decimal by 15 and storing the remainder
		//if the remainder matches one of the values it stores the converted value and adds it to the new string
    	String total = "";
		for(int j=0; j <= digits; j++){
			int b = a%15;
			a = a/15;
				if (b == 1){
					String x = "1";
					total = x + total;
				}else if (b == 2){
					String x = "2";
					total = x + total;
				}else if (b == 3){
					String x = "3";
					total = x + total;
				}else if (b == 4){
					String x = "4";
					total = x + total;
				}else if (b == 5){
					String x = "5";
					total = x + total;
				}else if (b == 6){
					String x = "6";
					total = x + total;
				}else if (b == 7){
					String x = "7";
					total = x + total;
				}else if (b == 8){
					String x = "8";
					total = x + total;
				}else if (b == 9){
					String x = "9";
					total = x + total;
				}else if (b == 10){
					String x = "A";
					total = x + total;
				}else if (b == 11){
					String x = "Z";
					total = x + total;
				}else if ( b == 12){
					String x = "Q";
					total = x + total;
				}else if (b == 13){
					String x = "J";
					total = x + total;
				}else if (b == 14){
					String x = "G";
					total = x + total;
				}else if (b == 0){
					String x = "0";
					total = x + total;
				}
				if (a == 0){
					break;
				}
		}
		//if input integer is negative converts pentadecimal string to negative
		if (flag == true){
			total = "-" + total;
		}else{
		}
		
	return total;	
	}
	
	public static void main(String[] args){
		System.out.println("Please enter a Pentadecimal Number:");
		Scanner user_input = new Scanner( System.in );
		String s;
		s = user_input.next();
		int sum = parsePenta(s);
		System.out.println(sum);
		
	
		Scanner sc = new Scanner(System.in);
	    int a;
	    System.out.println("Please enter an integer you would like in Pentadecimal!");
	    a = sc.nextInt();
	    System.out.println("Thank you! Converting:" + a);
		String total = toString(a);
		System.out.println(total);
	}

}
