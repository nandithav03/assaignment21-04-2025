package loops;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to find palindrome or not");
		int num=scanner.nextInt();
		int n=num;
		int res=0;
		while(num>0){
			int digit=num%10;
			res=res*10+digit;
			num=num/10;
			
		}
	
		if(n==res) {
			System.out.println("palindrome");
			}
		else {
			System.out.println("not a palindrome");
		}
		
}

}
