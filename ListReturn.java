import java.util.Arrays;
public class ListReturn{
	public static char[] getArrayOf(int number){
		String casting = Integer.toString(number);
		char [] returnValue = casting.toCharArray();
		return returnValue;
	}
}