

import java.util.Scanner;


public class CouponNumber {

	public static void CouponGenerator()
	{
		Scanner scanner=new Scanner(System.in);
		char str[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		int max=100000000;
		
		StringBuffer buffer=new StringBuffer();
		//System.out.println(random);
		int count=0;
		System.out.println("Enter number :");
		int n=scanner.nextInt();
		int i=1;
		int temp=0;
		int random=0;
		int count1=0;
		while(i<=n)
		{
			
			 random=(int) (Math.random()*max);
			if(temp!=random)
			{
				System.out.println("unique");
				count1++;
			}
			else
			{
				 random=(int) (Math.random()*max);
			 temp=random;
			 
			}
		while(random>0)
		{
			
			buffer.append(str[random%str.length]);
			
			random=random/str.length;
			count++;
		}
		String coupon=buffer.toString();
		System.out.println(coupon);
		System.out.println("count :"+count);
		i++;
		}
		System.out.println("count1 :"+count1);
		scanner.close();
	}
	public static void main(String[] args) {
		CouponNumber.CouponGenerator();
		
		
	}

}
