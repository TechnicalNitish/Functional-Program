import java.util.Scanner;

public class Cross_Game {
	static String gameArray[][]=new String[3][3];
	public static void main(String[] args) {
		System.out.println("\nCross Game For Two Player");
		
		GameBoard();
		display();
		startGame();
		

	}
	
	public static void GameBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				gameArray[i][j]="--";
			}
		}
	}
	
	
	public static void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(gameArray[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	//start game method
	
	public static String startGame()
	{
		String draw=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("x-For player1");
		System.out.println("0-For player2");
			System.out.println("\nFirst Turn wil be Player1");
		for(int i=0;i<5;i++)
		{
			int count=0;
			while(count==0)
			{
				
				System.out.println("Player1:Enter row And Col");
				int row=sc.nextInt();
				int col=sc.nextInt();
				
					
		try {
				if(gameArray[row][col]=="--")
				{
					count++;
					gameArray[row][col]="x";
				}
				
				if(   (gameArray[0][0]=="x" && gameArray[0][1]=="x"&& gameArray[0][2]=="x")
					||(gameArray[1][0]=="x" && gameArray[1][1]=="x"&& gameArray[1][2]=="x")
					||(gameArray[2][0]=="x" && gameArray[2][1]=="x"&& gameArray[2][2]=="x")
					||(gameArray[0][0]=="x" && gameArray[1][0]=="x"&& gameArray[2][0]=="x")
					||(gameArray[0][1]=="x" && gameArray[1][1]=="x"&& gameArray[2][1]=="x")
					||(gameArray[0][2]=="x" && gameArray[1][2]=="x"&& gameArray[2][2]=="x")
					||(gameArray[2][0]=="x" && gameArray[1][1]=="x"&& gameArray[0][2]=="x")
					||(gameArray[0][0]=="x" && gameArray[1][1]=="x"&& gameArray[2][2]=="x")
					)
					
				{
					System.out.println("Player1 Won");
					display();
					System.exit(0);
					
				}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please Enter row and Col betwee 0 to 2");
		}
			
				display();
				
					

			}
			
			count=0;
			
			while(count==0)
			{
				System.out.println("Turn For Player 2 enter row and col:");
				int row =sc.nextInt();
				int col =sc.nextInt();
		try {
				if(gameArray[row][col]=="--")
				{
					count++;
					gameArray[row][col]="0";
				}
				
				if(  (gameArray[0][0]=="o" && gameArray[0][1]=="o"&& gameArray[0][2]=="o")
					||(gameArray[1][0]=="o" && gameArray[1][1]=="o"&& gameArray[1][2]=="o")
					||(gameArray[2][0]=="o" && gameArray[2][1]=="o"&& gameArray[2][2]=="o")
					||(gameArray[0][0]=="o" && gameArray[1][0]=="o"&& gameArray[2][0]=="o")
					||(gameArray[0][1]=="o" && gameArray[1][1]=="o"&& gameArray[2][1]=="o")
					||(gameArray[0][2]=="o" && gameArray[1][2]=="o"&& gameArray[2][2]=="o")
					||(gameArray[2][0]=="o" && gameArray[1][1]=="o"&& gameArray[0][2]=="o")
					||(gameArray[0][0]=="o" && gameArray[1][1]=="o"&& gameArray[2][2]=="o"))
				{
					System.out.println("Player 2 Won");
					display();
					System.exit(0);
					
				}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Player 2 Please Enter Row and Col between 0-2");
		}
				display();
				
			}
			
			sc.close();
		
		}
		return draw;
	
	}
	

}
