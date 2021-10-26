// Java code to illustrate different constructors and methods
// String class.

import java.io.*;
import java.util.*;
class StringAndMethods
{
	public static void main (String[] args)
	{
		String s= "IamLearningJAVA";
		// or String s= new String ("GeeksforGeeks");

		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());

		// Returns the character at ith index.
		System.out.println("Character at 3rd position = "
						+ s.charAt(3));

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring = " + s.substring(2,5));

		// Concatenates string2 to the end of string1.
		String s1 = "IamLearning";
		String s2 = "JAVA";
		System.out.println("Concatenated string = " +
							s1.concat(s2));

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " +
						s4.indexOf("Share"));

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a = " +
						s4.indexOf('a',3));

		// Checking equality of Strings
		Boolean out = "Iam".equals("IAM");
		System.out.println("Checking Equality " + out);
		out = "IamLearning".equals("IamLearning");
		System.out.println("Checking Equality " + out);

		out = "IamLearning".equalsIgnoreCase("I AmLearning");
		System.out.println("Checking Equality " + out);
		
		//If ASCII difference is zero then the two strings are similar
		int out1 = s1.compareTo(s2);
		System.out.println("the difference between ASCII value is="+out1);
		// Converting cases
		String word1 = "IamLearningAJAVA";
		System.out.println("Changing to lower Case " +
							word1.toLowerCase());

		// Converting cases
		String word2 = "IamLearningJAVA";
		System.out.println("Changing to UPPER Case " +
							word2.toUpperCase());

		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());

		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f' ,'g') ;
		System.out.println("Replaced f with g -> " + str2);
	}
}
