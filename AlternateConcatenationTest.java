import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class AlternateConcatenationTest{
	@Test
	public void getAlternateConcatenationTest(){
		int [] number = {1,2,3,4,5};
		AlternateConcatenation alternateObject = new AlternateConcatenation();
		String alphabets[] = {"name","alpha","beta","gamma","delta"};
		String answer[] = {"1","name","2","alpha","3","beta","4","gamma","5","delta"};
		String[] expectedAnswer = alternateObject.getAlternateConcatenation(number,alphabets);
		assertEquals(Arrays.toString(answer) , Arrays.toString(expectedAnswer));
	}
}