package com.maderilo.stringCalculator;

public class StringCalculator {

	private static String delimiters = "[,]";
	
	public static int Add(String numbers){
		return Add(numbers.split(delimiters));
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
