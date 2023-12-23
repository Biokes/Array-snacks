import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class RunningTotalTest{
	@Test
	public void runningTotalTest(){
		RunningTotal runningTotalObject = new RunningTotal();
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int answer[] = new int[numbers.length];
		answer = runningTotalObject.getRunningTotal(numbers);
		String answerInStrings = Arrays.toString(answer);
		int [] expectedValue = {1,3,6,10,15,21,28,36,45};
		String expectedValueInStrings =Arrays.toString(expectedValue);
		assertEquals(expectedValueInStrings, answerInStrings);
	}
	@Test
	public void runningTotalTestNegatives(){
		RunningTotal runningTotalObject = new RunningTotal();
		int numbers[] = {-1,2,3,4,-5,6,7,8,-9};
		int answer[] = new int[numbers.length];
		answer = runningTotalObject.getRunningTotal(numbers);
		String answerInStrings = Arrays.toString(answer);
		int [] expectedValue = {-1,1,4,8,3,9,16,24,15};
		String expectedValueInStrings =Arrays.toString(expectedValue);
		assertEquals(expectedValueInStrings, answerInStrings);
	}
}