/*Biggest Word in a Sentence*/
package Java.StringProg;

public class BigWordInSentence {

	public static void main(String args[]) throws NullPointerException {
		String s = "I am PVS MANIKANTA";
		String bigS = null;
		int big=0,j;
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(j=1;j<arr.length-1;j++) {
			if(arr[i].length()>arr[j].length())
			big = arr[i].length();
			bigS=arr[i];
			}
			
		}
		System.out.println("Length of the String:"+big+"\nString is:"+bigS);
	}
}
