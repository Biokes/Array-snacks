import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseArrayTest{
@Test
	public void reverseArrayTest(){
		ReverseArray reverseArray = new ReverseArray();
		int [] number = {12,3,1,3,5,9};
		int []answer = new int[number.length];
		answer = reverseArray.getArrayReverse(number);
		int [] expected = {9,5,3,1,3,12};
		assertArrayEquals(expected,answer);
	}

}