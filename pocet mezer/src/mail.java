import java.io.*;
import java.util.Scanner;


public class mail {

	public static void main(String[] args) {
		
		File file = new File("M:\\pocet mezer\\lm.txt");

		
		try(Scanner sc = new Scanner(new FileInputStream(file))){
		
		int WordCount = 0;
		int SpaceCount = 0;
		while(sc.hasNext()) {
			sc.next();
			WordCount++;
		}	
		 SpaceCount = WordCount - 1;
		System.out.println("Words: " + WordCount);
		System.out.println("Spaces: " + SpaceCount);
	}catch (FileNotFoundException e) {
		System.out.println("Something went wrong");
	}
	}
	
}
