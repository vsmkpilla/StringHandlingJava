//Large Palindrome in a given String

package Java.StringProg;

public class LargePalindromeInAString {

	public static void main(String[] args) {
		String s = "I am Manikanta SOS KAKAK";
		System.out.println("Total String:"+s);
		int big=0,palCount=0;
		String BigPalinString =null;
		String s1[] = s.split(" ");
		
		StringBuffer rev[] = new StringBuffer[s1.length];
		for(int i=0;i<s1.length;i++) {
			StringBuffer sb = new StringBuffer(s1[i]);
         rev[i]=sb.reverse();
			if(s1[i].equalsIgnoreCase(rev[i].toString())) {
				palCount++;
				System.out.println("Palindrome "+palCount+" :"+s1[i]);
				if(s1[i].length()>big) {
					BigPalinString=s1[i];
				}
			}
		}
		System.out.println("Large Palindrome in given Strings: "+BigPalinString);
	}

}
