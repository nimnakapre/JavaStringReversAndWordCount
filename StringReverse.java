import java.util.Scanner;
import java.util.Arrays;

	public class StringReverse{
		public static void main(String [] args){
		
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the paragraph: ");
			String str = s1.nextLine();
			
			System.out.println("After Reverse: ");
			
			for(int i=str.length();i>0;--i){
				System.out.print(str.charAt(i-1));
			}
			
			
		
		}
	}