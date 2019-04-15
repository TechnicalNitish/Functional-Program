
public class Q10Triplet {

	public static void main(String[] args) {
		
		
		 //Initialize Array
		int a[]={20,-10,34,16,21,1,-10};
        int n=a.length;
      
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                for(int k=j+1;k<n;k++)
	                {
	                    if(a[i]+a[j]+a[k]==0)
	                    {
	                        System.out.println("Trip is equals=0 are"+a[i]+" "+a[j]+" "+a[k]);
	                    }
	                }
	            }
	        }
		
	}

}
