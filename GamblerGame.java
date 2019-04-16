
public class GamblerGame {

	public static void main(String[] args) {
		int stake  = Integer.parseInt(args[0]);  
        int goal   = Integer.parseInt(args[1]);    
        int trials = Integer.parseInt(args[2]);    

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            
            while (cash > 0 && cash < goal) {
                bets++;
                
                if (Math.random() < 0.5) 
                	cash++;     // win $1
                else            
                	cash--;     // lose $1
            }
            
            if (cash == goal) 
            	wins++;                
            }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);

	}

}
