package logicalPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		int n =120;
		int rev=0;
		int temp;
		int d = n;
		
		while(n>0) {
			temp = n%10;
			rev = rev*10 + temp;//3,32,321//0,2,21
			n=n/10;//12,1
		}
		if(d==rev) {
			System.out.println(d+ " is palindrome number");
		}
		else {
			System.out.println(d+ " is not palindrome number");
		}
	}
}
