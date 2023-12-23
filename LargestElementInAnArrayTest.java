import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LargestElementInAnArrayTest{
@Test
	public void largestElementInAnArrayTest(){
		LargestElementInAnArray  largest = new LargestElementInAnArray();
		int [] givenArray = {1,2,3,4,5};
		int expected =(largest.checkLargestElementInAnArray(givenArray));
		assertEquals(5,expected);
	}
}