
public class Q11Distamce {

	public static void main(String[] args) {
		
		//Passing Argument
		try {
		 int x=Integer.parseInt(args[0]);
         	int y=Integer.parseInt(args[1]);
         
         	double ed=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
         
         System.out.println("E Distance : "+ed);
		}catch(Exception e)
		{
			System.out.println("Please Pass Argument\n"+e);
		}
	}

}
