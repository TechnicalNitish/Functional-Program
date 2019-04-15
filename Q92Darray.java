import java.io.PrintWriter;
import java.util.Scanner;


public class Q92Darray {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        
        
        System.out.println("ENter m:");
        int m=sc.nextInt();
        
        
        System.out.println("ENter n:");
         int n=sc.nextInt();
         
         boolean a[][]=new boolean[m][n];
         
         
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 System.out.println("Enter Boolean value");
                 boolean b=sc.nextBoolean();
                 a[i][j]=b;
             }
         }
         
         
         PrintWriter p=new PrintWriter(System.out,true);
         System.out.println("Displaying values");
         
         
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        p.print(" "+a[i][j]);
                    }
                    p.println();
                }
                
                sc.close();
         
	}

}
