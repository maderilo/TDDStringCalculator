package test.com.maderilo.stringCalculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.maderilo.stringCalculator.StringCalculator;



public class StringCalculatorTest {

	@Test
	public void should_return_0_for_empty_string() throws Exception {
		String input = "";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(0, result);
	}
	
	@Test
	public void should_return_number_for_1number_string() throws Exception {
		String input = "12";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(12, result);
	}
	
	
	@Test
	public void should_return_sum_for_2number_comma_string() throws Exception {
		String input = "12,2";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(14, result);
	}
}