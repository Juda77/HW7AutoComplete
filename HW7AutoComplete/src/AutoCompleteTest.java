import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AutoCompleteTest {
	
	///we'll test the algorithm with two different dictionaries
	String[] dictionary = 
			
			{"hello", "high", "seattle", "seatac", "see", "hollow", "how", "legit", "luigi"}

	;
//
	@Test
	public void testAutoComplete() {
		
		String[] inputs = {"h", "se", "sea", "ho", "xyz", "hello", "legit", "l"};
		String[][] expected = {
				
				{"hello", "high", "hollow", "how"},
				{"seattle", "seatac", "see"},
				{"seattle", "seatac"},
				{"hollow", "how"},
				{},
				{"hello"},
				{"legit"},
				{"legit", "luigi"}
						
		};
		
		AutoComplete google = new AutoComplete();
		google.setDictionary(dictionary);
		
		for (int i = 0; i < expected.length; i++) {
			List<String> currentExpected = Arrays.asList(expected[i]);
			assertTrue(currentExpected.equals(google.generateWords(inputs[i])));
		}
		
	}
	//
}
