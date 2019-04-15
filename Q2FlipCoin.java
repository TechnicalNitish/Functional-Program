import java.util.Scanner;

public class Q2FlipCoin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many turn:");
		int n=sc.nextInt();
		int head=0;
		int tail=0;
		
		int i=1;
		while(i<=n)
		{
			double r= Math.random();
			
			if(r<=0.5)
			{
				System.out.println("tail");
				tail++;
			}
			else
			{
				System.out.println("head");
				head++;
			}
			i++;
			
		}
		
		System.out.println(head);
		System.out.println(tail);
		
	double head_percent=(head*100)/n;
	double tail_percent=(tail*100)/n;
	
	System.out.println("Head Percentage"+head_percent+"\nTail Percent"+tail_percent);
	sc.close();
	}

}
