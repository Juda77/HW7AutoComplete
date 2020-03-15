import java.util.Arrays;

public class Trie {
	TrieNode head = new TrieNode();
	
	
	public void add(String word) {
		
		if (word.length() == 0) {
			return;
		}
		
		TrieNode curr = head;
		
		/*
		 * for each letter in the word, add to the children of the current node
		 * iteration strat is somewhat similar to linked list traversal
		 */
		for (int i = 0; i < word.length(); i++) {
			
			char letter = word.charAt(i);
			
			if (i == word.length() - 1) {
				//if at last letter, set boolean 'atEndOfWord' to true
				curr.addLetterToChildren(letter, true);
			} else {

				curr.addLetterToChildren(letter, false);
			}
			 
			curr = curr.children[(int)letter - 97];
			
		}
		
	}
	
	
	
	

}
