import java.util.Arrays;
public class ReverseArray{
	public static int[] getArrayReverse(int [] givenArray){
		int [] returnValue = new int[givenArray.length];
		for(int loopCounter = 0, returnValueCounter = givenArray.length-1; loopCounter <givenArray.length; loopCounter++, returnValueCounter-- ){
			returnValue[returnValueCounter]= givenArray[loopCounter];
		}
		System.arraycopy(returnValue, 0, givenArray,0,givenArray.length);
		return returnValue;
	}
public static void main(String... args ){
int [] collections = ;
System.out.print(Arrays.toString(getArrayReverse(collections)));
}

}