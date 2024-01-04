package palindrome;

public class palindrome {

	public static void main(String[] args) {
	
		int rev,sum=0,temp;
		int n=121;
		temp=n;
		while(n>0) {
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("the given number is palindrome ");
		else
			System.out.println("the given number is not a palindrome");

}
}