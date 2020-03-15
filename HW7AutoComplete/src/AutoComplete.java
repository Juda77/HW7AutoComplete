import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoComplete {
	
	///we'll test the algorithm with two different dictionaries
	String[] dictionary;
	
	Trie trieDict = new Trie();
	
	public void setDictionary(String[] dictionary) {
		this.dictionary = dictionary;
	}
	
	public void constructTrieDictionary(String[] dictionary) {
		
		//iterate through all words and add them to the trie dictionary
		for (int i = 0; i < dictionary.length; i++) {
			trieDict.add(dictionary[i].toLowerCase());
		}
				
	}

	public List<String> generateWords(String input) {
		
		if (input.length() == 0) {
			return new ArrayList<String>();
		}
		
		constructTrieDictionary(dictionary);
		List<String> result = new ArrayList<String>();
		TrieNode curr = trieDict.head;
		String letters = input.substring(0, input.length() - 1);
		
		//before we do the recursive search, let's iterate through the part of the trie that is the input
		for (int i = 0; i < input.length(); i++) {	
			
			if (curr.children[input.charAt(i) - 97] == null) {
				//if the child spot is null, then either 
				//the letter does not exist to continue the word,
				//or the word does not exist in the dictionary
				return result;
				
			} else {
				curr = curr.children[input.charAt(i) - 97];

			}
			
		}
		
		generateWords(result, curr, letters);
			
		return result; //placeholder 
	}

	//depth-first traversal
	public void generateWords(List<String> result, TrieNode curr, String letters) {

		//access each child of the current TrieNode
		letters += curr.letter;

		if (curr.atEndOfWord == true) {
			result.add(letters);
		}
		
		for (int i = 0; i < curr.indexesOfChildren.size(); i++) {
			
			TrieNode currentChild = curr.children[curr.indexesOfChildren.get(i)];
	
			//recurse further down the current letter
			generateWords(result, currentChild, letters);
			
		}	
		
	}

}
