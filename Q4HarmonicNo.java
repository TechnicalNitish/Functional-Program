

import java.util.Scanner;
public class Q4HarmonicNo {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
         System.out.println("Enter Val");
         int n=in.nextInt();
         double harmonic=0;
         if(n!=0)
         {
             System.out.println("Printing Harmonic Series:");
            for(int i=1;i<=n;i++)                                               
            {
                System.out.print("1/"+i+"+");
                harmonic+=(double)1/i;
            }
         }
         System.out.println("\nHarmonic Number : "+harmonic);
         in.close();
 
	}

}
