import java.util.Scanner;

public class Q16WindChill {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of temprature and speed v:");
		double t=input.nextInt();
		double v=input.nextInt();
		
		double f=Math.pow(v,0.16);
		if(t>=50&&v<=120&&v>=3)
		{
			double w=35.74+0.6215*t+(0.4275*t-35.75)*f;
			System.out.println("Wind chill:"+w);
		}
		else
		{
			System.out.println("Please enter value in range ");
		}
		input.close();
	}

}
