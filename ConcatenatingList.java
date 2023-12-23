import java.util.ArrayList;
import java.util.Arrays;
public class ConcatenatingList{
	public static String[] getConcatList(int [] number,String[] names){
		ArrayList <String> returnValue = new ArrayList<String>();
		int loopCounter =0;
		for(loopCounter = 0; loopCounter <number.length;loopCounter++){
			returnValue.add(Integer.toString(number[loopCounter]));
			if(loopCounter == (number.length-1)){
				for(loopCounter = 0; loopCounter <names.length;loopCounter++){
					returnValue.add(names[loopCounter]);
				}
			}
		}
		String[] returnValue1= returnValue.toArray(new String[returnValue.size()]);
		return returnValue1;
	}
}