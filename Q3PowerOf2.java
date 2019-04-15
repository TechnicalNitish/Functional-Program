
public class Q3PowerOf2 {

	public static void main(String[] args) {
		
		//Argument Input
		try {
				 int n=Integer.parseInt(args[0]);
				
		         int Sum=2;
		         if(n<31)
		         {
		             for(int i=1;i<=n;i++)
		             {
		                 System.out.println("2^"+i+"="+Sum);
		                 Sum=Sum*2;
		             }
		         }
		         else{
		             System.out.println("overflow ->Please Pass Argument 0<N<=31");
		         }
		         
		         if(Sum%4==0)
		         {
		             System.out.println("Is Leap year");
		         }
		         else if(Sum%400==0&&Sum%100==0)
		         {
		             System.out.println("Is Leap year");
		         }
		         else
		         {
		             System.out.println("is Not leap year");
		         }
			}catch(Exception e)
				{
					System.out.println("Please Pass Argument");
				}

	}

}
