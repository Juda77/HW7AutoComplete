import java.util.ArrayList;

public class TrieNode {
	
	char letter;
	ArrayList<Integer> indexesOfChildren = new ArrayList<>();
	TrieNode[] children = new TrieNode[26];
	boolean atEndOfWord;
	
	/*//
	 * each trie node contains an instance variable array of trienodes
	 */
	public TrieNode(char letter, boolean atEndOfWord) {
		this.letter = letter;
		this.atEndOfWord = atEndOfWord;
	}
	
	public TrieNode() {
		//constructor for head of Trie(head should not contain a letter)
	}
	
	public void setNodeLetter(char letter) {
		this.letter = letter;
	}
	
	public void addLetterToChildren(char letter, boolean atEndOfWord) {

		//insert a trienode into the children array
		int index = (int)letter - 97;
		
		//make sure the spot isn't already occupied before we add another letternode to it
		if (children[index] == null) {
			indexesOfChildren.add(index);
			TrieNode child = new TrieNode(letter, atEndOfWord);
			children[index] = child;
		}
		
	}

}
