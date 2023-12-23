import java.util.Arrays;
public class OddPositionElements{
	public static int[] getOddPositions(int [] givenArray){
		int arraylength= 0;
		for(int loopCounter = 0 ; loopCounter < givenArray.length; loopCounter++){
				if(loopCounter%2 == 1){
				arraylength+=1;
				}
			}
		int [] returnArray = new int [arraylength];
		int counter = 0;
		for(int loopCounter = 0 ; loopCounter < givenArray.length; loopCounter++){
			if(loopCounter%2 == 1){
			System.out.print( givenArray[loopCounter] + "  ");
			returnArray[counter]= givenArray[loopCounter];
			counter+=1;}
			}
	return returnArray;
	}
public static void main(String... args){
	int [] test ={1,2,3,2,3,4};
	System.out.print(getOddPositions(test));
}
}