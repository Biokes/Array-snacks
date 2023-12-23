import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class ElementsInEvenPositionsTest{
	@Test
	public void evenPositionElementsTest(){
		EvenPositionedElements evenPositionElement1 = new EvenPositionedElements();
		int number[] = {1,2,3,4,5,6,7,8,11};
		int answer[] = {2,4,6,8};
		String answerInString = Arrays.toString(answer);
		String expectedValueInString =Arrays.toString(evenPositionElement1.getEvenPositions(number));
		assertEquals(answerInString, expectedValueInString);
}
}