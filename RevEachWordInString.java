//Reverse Each Word in a String and check for palindrome

package Java.StringProg;


import java.io.*;
import java.io.BufferedReader;

public class RevEachWordInString {

	public static void main(String args[]) throws IOException {
		//String s = "I am Manikanta";
		System.out.println("Enter a String: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String arr[] = s.split(" ");
		int len = arr.length;
		StringBuffer rev[]= new StringBuffer[len];
			for(int i=0;i<arr.length;i++) {
			StringBuffer sb = new StringBuffer(arr[i]);
			rev[i] = sb.reverse();
			System.out.println("Reverse of:"+arr[i]+" is "+rev[i]);
			if(arr[i].equalsIgnoreCase(rev[i].toString())) {
				System.out.println(arr[i]+" is Palindrome");
			}
			else {
				System.out.println(arr[i]+" is Not a palindrome");
			}
			
		}
		
		
		
	}
}
