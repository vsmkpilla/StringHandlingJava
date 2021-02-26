package Java.StringProg;


public class StringInAlphaOrder {
 
	public static void main(String args[]) {
		String s = "ManiAh";
		String s1=s.trim();
		System.out.println("String: "+s);
		char temp;
		char arr[]=new char[s.length()];
		s.getChars(0, s.length(), arr, 0);	
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp= arr[j];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	System.out.println(arr);	
	}
	}
}
