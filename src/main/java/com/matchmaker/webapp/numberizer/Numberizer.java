package com.matchmaker.webapp.numberizer;

/**
 * 
 * @author Giannis Konomis Numberizer converts a name into the arithmetic sum of
 *         the name letters(ASCII codes)
 *
 */

public class Numberizer {

	/**
	 * 
	 * @param name
	 *            The male name to be converted.
	 * @return The sum of the name letters(ASCII codes)
	 */

	public static int numberizer(String name) {
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);// pointing in the first letter of the name

			sum += c;
		}

		return sum;

	}
}
