import java.util.Arrays;
public class RunningTotal{

	public static int[] getRunningTotal(int[] givenArray){
		int [] expectedAnswer = new int[givenArray.length];
		int total = 0;
		for(int index = 0; index< givenArray.length; index++){
			total += givenArray[index];
			expectedAnswer[index]= total;
		}
	return expectedAnswer;
	}
}