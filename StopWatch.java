import java.time.*;
import java.util.Scanner;

public class StopWatch {
	
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;


	public void start() {
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
	}


	public void stop() {
	    this.stopTime = System.currentTimeMillis();
	    this.running = false;
	}


	//elapsed time in milliseconds
	public long getElapsedTime() {
		
	    long elapsed;
	    if (running) {
	         elapsed = (System.currentTimeMillis() - startTime);
	    }
	    else {
	        elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	}


	//elapsed time in seconds
	public long getElapsedTimeSecs() {
	    long elapsed;
	    if (running) {
	        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
	    }
	    else {
	        elapsed = ((stopTime - startTime) / 1000);
	    }
	    return elapsed;
	}


public static void main(String[] args) {
	
	StopWatch s = new StopWatch();
    int ch;
    Scanner sc=new Scanner(System.in);
    
    do
    {
    	 System.out.println("Select from Below \n1.Start watch\n2.Stop Watch and Print Elapsed time ");
    	  ch=sc.nextInt();
    
    switch(ch)
    {
    case 1:   s.start();
    			System.out.println("Start"+java.time.LocalTime.now());
    				break;
		    
		    //code you want to time goes here
    case 2:	    s.stop();
    System.out.println("Stopping Time"+java.time.LocalTime.now());
		    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
		    break;
		    default :System.out.println("Invalid");
		    
		    
    	}
   
    }while(ch!=2);
    sc.close();
    
	
}
}
