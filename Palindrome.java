import java.util.Arrays;
public class Palindrome{
	public static String checkPalindrome(String givenVariable){
		String givenVariable1 = givenVariable.toLowerCase();
		char[] convert = givenVariable1.toCharArray();
		char[] comparator = new char[convert.length];
		int secondLoopCounter = 0;
		for(int loopCounter = convert.length-1; loopCounter >= 0; loopCounter-- ){
			comparator[secondLoopCounter] = convert[loopCounter];
			secondLoopCounter++;
		}
		String returnValue ="";
			
			if(Arrays.toString(comparator).equals(Arrays.toString(convert))){returnValue = (givenVariable+" is a palindrome.");}
			if(!(Arrays.toString(comparator).equals(Arrays.toString(convert)))) {returnValue = (givenVariable+" is not a palindrome.");}
		return returnValue;	
		}s
}