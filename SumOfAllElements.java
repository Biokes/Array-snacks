public class SumOfAllElements{
	
	public static int getSumInList(int [] givenArray){
		int returnValue = 0;
		int loopCounter = 0;
		while(loopCounter< givenArray.length){
			returnValue+=givenArray[loopCounter];
			loopCounter++;}
		
	return returnValue;
	}
	public static int getSumInListUsingDoWhileLoop(int [] givenArray){
		int sumValue = 0;
		int loopCounter = 0;
		do{
			returnValue+=givenArray[loopCounter];
			loopCounter++;
			}while(loopCounter< givenArray.length);
		
	return sumValue;
	}
	public static int getSumInListUsingForLoop(int [] givenArray){
		int sumValue = 0;
		for(int loopCounter = 0;loopCounter< givenArray.length;loopCounter++;){
			returnValue+=givenArray[loopCounter];
			}
	return totalValue;
	}
	
}