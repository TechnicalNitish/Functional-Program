
public class Q2LeapYear {

	public static void main(String[] args) {
		
		
		//Argument
		 int y=Integer.parseInt(args[0]);
         
         int n=y;
         int digit=0;
         while(n>0)
         {
             n=n/10;
             digit++;
         }
         
         if(digit==4)
         {
             if(y%4==0)
             {
                 System.out.println("Inputed year is Leap Year");
             }
             else if(y%400==0 && y%100==0)
             {
                 System.out.println("Inputed year is Leap Year");
             }
             else
             {
              System.out.println("Inputed year is Not Leap Year");   
             }
                 
         }
         else
         {
          
              System.out.println("Input year Number of four digit ");   
         }
		
	}

}
