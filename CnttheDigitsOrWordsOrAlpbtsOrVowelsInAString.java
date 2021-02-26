
//Count the digits or words or Alphabets or Vowels in a Sentence 
package Java.StringProg;

public class CnttheDigitsOrWordsOrAlpbtsOrVowelsInAString {
	
	public static void main(String args[]) {
		int countDigits=0,countChars =0,i;
		String s = "I am 122 7 Manikanta 122 ";
		String[] a = s.split(" ");
		System.out.println("No of Words are:"+a.length);
		for( i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
			        countChars++;
			}
			if(Character.isDigit(s.charAt(i))) {
				countDigits++;
				
				
			}
		}
		System.out.println("\nNo of digits are :"+countDigits);
		System.out.println("No of Alphabets are:"+countChars);
		int countVowels=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				countVowels++;
			}
		}
		System.out.println("No'of Vowels are:"+countVowels);
		
		
	}

}
