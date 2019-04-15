import java.util.Scanner;

public class Q6Factors {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);   
         System.out.println("\nEnter n:");
         int n=sc.nextInt();
         for(int i=2;i*i<=n;i++)
         {
             while(n%i==0)
             {
                 System.out.println(i+" ");
                 n=n/i;
             }
         }
         if(n>2)
         {
             System.out.println(n);
         }
         sc.close();

	}

}
