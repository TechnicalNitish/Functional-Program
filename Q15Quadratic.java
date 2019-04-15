import java.util.Scanner;

public class Q15Quadratic {

	public static void main(String[] args) {

		double root1,root2;
		
		//Taking Input from user of a b c
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
         System.out.println("Enter b :");
         int b=sc.nextInt();
         System.out.println("Enter c :");
        int c=sc.nextInt();
        double dec=Math.pow(b,2)-(4*a*c);
        
        if(dec<0)
        {
            System.out.println("Imginary");
        }
        else if(dec==0)
                {
                    root1=-b+Math.sqrt(dec/2*a);
                    System.out.println("\nRoots are Real and Equal");
                }
        else if(dec>0){
            root1=-b+Math.sqrt(dec/2*a);
            root2=-b-Math.sqrt(dec/2*a);
            
            System.out.println("\nRoot 1= "+root1);
            System.out.println("\nRoot 2= "+root2);
            
        }
        sc.close();
            
	}

}
