import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class OddPositionElementsInAnArrayTest{
	@Test
	public void oddPositionElementsTest(){
		OddPositionElements oddPositionElement1 = new OddPositionElements();
		int number[] = {1,2,3,4,5,6,7,8,11};
		int answer[] = {2,4,6,8};
		String answerInString = Arrays.toString(answer);
		String expectedValueInString =Arrays.toString(oddPositionElement1.getOddPositions(number));
		assertEquals(answerInString, expectedValueInString);
}
}