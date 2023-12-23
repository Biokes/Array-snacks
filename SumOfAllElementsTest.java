import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SumOfAllElementsTest{
	@Test
	public void getSumOfAllElementsTest(){
	SumOfAllElements sumOfAllElementsObject = new SumOfAllElements();
	int [] number = {12,3,1,6,7,13};
	int total = 0;
	total = getSumInList(number);
	assertEquals(47,total);
	}


}