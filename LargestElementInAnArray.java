public class LargestElementInAnArray{

	public static int checkLargestElementInAnArray(int [] number){
	int answer = Integer.MIN_VALUE;
	for(int loopCounter = 0; loopCounter<number.length; loopCounter++){
		if(number[loopCounter] > answer) answer = number[loopCounter];
		}
	return answer;
}

}