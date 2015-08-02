package com.maderilo.stringCalculator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	//a string using ',' '\n' and a custom delimiter in the same string is accepted as valid.
	private static final Set<String> DefaultDelimiters =  new HashSet<String>(Arrays.asList(",","\n"));
	private static final Pattern pat = Pattern.compile("(//(.)\n)?(*)");
			
			//[delimiter]\n[numbers…]
			
	public static int Add(String numbers){
		Set<String> delimiters = getDelimiters(numbers);
		
		return Add(getNumbers(numbers, delimiters));
	}
	
	
	private static String[] getNumbers(String numbers, Set<String> delimiters) {
		Matcher m = pat.matcher(numbers);
		String rawNumbers;
		
		if (m.groupCount()> 1){
			rawNumbers = m.group(2);
		}
		else{
			rawNumbers = m.group(1);
		}
		
		String rexexDelimiters = ToRegEx(delimiters);
		
		return rawNumbers.split(delimiters);
	}
	
	private static String ToRegEx(Set<String> delimiters)
	{
		String result = "[";
		for (String s : delimiters){
			result += s +",";
		}
		
		result.+= "]";quitarlaultimacoma
		return result;
	}


	private static Set<String> getDelimiters(String numbers)
	{
		Set<String> ResultSet = DefaultDelimiters;
		Matcher m = pat.matcher(numbers);
		
		if (m.groupCount()> 1){
			ResultSet.add(m.group(1));
		}
		return ResultSet;
	}
	
	private static int Add(String[] numbersArray){
		int result =0;
		
		try {
			for (String number : numbersArray)
			{
				result+= Integer.parseInt(number);
			}
			return result;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
