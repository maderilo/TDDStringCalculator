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
	public void should_return_sum_for_more_than_1number_comma_string() throws Exception {
		String input = "12,2,3,5";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(22, result);
	}
	
	
	@Test
	public void should_accept_newlines_as_separator() throws Exception {
		String input = "12\n2,3,5";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(22, result);
	}
	
	@Test
	public void should_accept_custom_separator() throws Exception {
		String input = "//;\n12\n2,3;5";
		
		int result = StringCalculator.Add(input);
		
		assertEquals(22, result);
	}
	
	
	
}
