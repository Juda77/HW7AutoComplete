import java.util.ArrayList;
import java.util.List;

public class AutoComplete {
	
	//we'll test the algorithm with two different dictionaries
	static String[][] dictionaries = {
				
			{"hello", "high", "seattle", "seatac", "see", "hollow", "how"}
			
	};
	
	static Trie trieDict = new Trie();
	
	
	public static void constructTrieDictionary(String[] dictionary) {
		
		//iterate through all words and add them to the trie dictionary
		for (int i = 0; i < dictionary.length; i++) {
			trieDict.add(dictionary[i].toLowerCase());
		}
				
	}
	

	public static List<String> generateWords(String input) {
		
		

		
		
		
		return new ArrayList<String>(); //placeholder 
	}
	
	


	



	
	
	
	

}
