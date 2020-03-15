import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AutoCompleteTest {
	
	//we'll test the algorithm with two different dictionaries
	String[][] dictionaries = {
			
			{"hello", "high", "seattle", "seatac", "see", "hollow", "how"}
			
	};
	
	

	@Test
	public void testAutoComplete() {
		
		String[] inputs = {"h", "se", "sea", "ho", "xyz", "hello"};
		String[][] expected = {
				
				{"hello", "high", "hollow", "how"},
				{"seattle", "seatac", "see"},
				{"seattle", "seatac"},
				{"hollow", "how"},
				{},
				{"hello"}
						
		};
		
		for (int i = 0; i < expected.length; i++) {
			List<String> currentExpected = Arrays.asList(expected[i]);
			assertTrue(currentExpected.equals(AutoComplete.generateWords(inputs[i])));
		}
		
		
	}
	
	
}
