import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeTest{
@Test
public void palindromeTest(){
	Palindrome palindromeObject = new Palindrome();
	String name = "Abbey";
	String answer = palindromeObject.checkPalindrome(name);
	String expectedAnswer = "Abbey is not a palindrome.";
	assertEquals(expectedAnswer,answer);
	}
	@Test
		public void palindromeTest1(){
		Palindrome palindromeObject1 = new Palindrome();
		String name = "Hannah";
		String answer = palindromeObject1.checkPalindrome(name);
		String expectedAnswer = "Hannah is a palindrome.";
		assertEquals(expectedAnswer,answer);
	}
	@Test
		public void palindromeTest2(){
		Palindrome palindromeObject2 = new Palindrome();
		String name = "Hnah";
		String answer = palindromeObject2.checkPalindrome(name);
		String expectedAnswer = "Hnah is not a palindrome.";
		assertEquals(expectedAnswer,answer);
	}

}