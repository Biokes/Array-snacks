import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
public class ConcatenatingListTest{
	@Test
		public void concatenateTwoStringTest(){
			ConcatenatingList concatenateObject1 = new ConcatenatingList();
			String [] firstArray = {"abbey","james"};
			int[] secondArray =  {12,2,23,445};
			ArrayList<String>  expected = new ArrayList<String>();
			ArrayList<String> result = concatenateObject1.getConcatList(secondArray,firstArray);
			for(int elements:secondArray){expected.add(Integer.toString(elements));}
			for(String elements: firstArray){expected.add(elements);}
			assertArrayEquals (expected,result);
		}
}