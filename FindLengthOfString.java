/* Program to find length of a string with and without length()*/

package Java.StringProg;

public class FindLengthOfString {
	public static void main(String args[]) throws NullPointerException{
		String s = "I am Manikanta";
		int len = s.length();
		System.out.println("Length Using length():"+len);
		char a[] = s.toCharArray();
		int lent=0;
		for( char ar :a ) {
			lent++;
		}
		System.out.println("Without length():"+lent);
				
	}

}
