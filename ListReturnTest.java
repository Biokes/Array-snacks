import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ListReturnTest{
	@Test
	public void getArrayOfTest(){
	ListReturn listReturnObject = new ListReturn();
	int testingValue  = 12123452;
	char [] expectedValue = listReturnObject.getArrayOf(testingValue);
	assertEquals(Arrays.toString(expectedValue),Arrays.toString( listReturnObject.getArrayOf(testingValue)));
	}
	@Test
	public void getArrayOfTest1(){
	ListReturn listReturnObject1 = new ListReturn();
	int testingValue  = -12123452;
	char [] expectedValue = listReturnObject1.getArrayOf(testingValue);
	assertEquals(Arrays.toString(expectedValue),Arrays.toString( listReturnObject1.getArrayOf(testingValue)));
	}
	@Test
	public void getArrayOfTest2(){
	ListReturn listReturnObject2 = new ListReturn();
	int testingValue  = -12123452;
	char [] expectedValue = listReturnObject2.getArrayOf(testingValue);
	assertEquals(Arrays.toString(expectedValue),Arrays.toString( listReturnObject2.getArrayOf(testingValue)));
	}
	@Test
	public void getArrayOfTest3(){
	ListReturn listReturnObject3 = new ListReturn();
	int testingValue  = -6348*38;
	char [] expectedValue = listReturnObject3.getArrayOf(testingValue);
	assertEquals(Arrays.toString(expectedValue),Arrays.toString( listReturnObject3.getArrayOf(testingValue)));
	}


}