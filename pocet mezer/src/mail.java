import java.io.*;


public class mail {

	public static void main(String[] args) throws IOException {
		
		File file = new File("M:\\pocet mezer\\lm.txt");
		FileInputStream fn = new FileInputStream(file);
		InputStreamReader in = new InputStreamReader(fn);
		BufferedReader br = new BufferedReader(in);
		String text;
		
		int WordCount = 0;
		int SpaceCount = 0;
		while((text = br.readLine()) != null) {
			String[] wordList = text.split("\\s+");
			WordCount +=wordList.length;
			SpaceCount = WordCount -1;
		}	
		
		System.out.println("Words: " + WordCount);
		System.out.println("Spaces: " + SpaceCount);
	}

}
