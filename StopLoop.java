import java.util.Scanner;
public class StopLoop{
	public static void main(String biokes[]){
	Scanner input = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		int secondLargest = largest;
		int smallest =Integer.MAX_VALUE;
		String stop = "stop";
		System.out.println("Enter a number to start and enter stop to quit the operation: ");
		
		for(;!(input.hasNext(stop));){
			int num = input.nextInt();
			if(num< smallest){
				smallest = num;}
			secondLargest = largest;
			if(num>largest){
				largest = num;}
		System.out.println("Enter a number and enter stop to quit the operation: ");
		
		}
		System.out.println("Largest -->  "+ largest+ "\nSecond Largest -->  "+ secondLargest +"\nsmallest -->  "+ smallest);
	}
}