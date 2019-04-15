
import java.util.Scanner;
public class Q1replaceString {

	public static void main(String[] args) {
		
		 Scanner input =new Scanner(System.in);
         String first="Hello UserName ,How are you";
         System.out.println("Before Replacing:\n"+first);
         System.out.println("Input String:");
         String inputstring=input.nextLine();
         String second=first.replace("UserName",inputstring);
         System.out.println("After replacing:\n"+second);
        input.close();
	}

}
