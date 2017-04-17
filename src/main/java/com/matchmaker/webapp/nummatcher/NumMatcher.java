package com.matchmaker.webapp.nummatcher;

/**
 * 
 * @author Giannis Konomis NumMatcher combines the sum of the name letters(ASCII
 *         codes) to the corresponding female name
 *
 */
public class NumMatcher {

	/**
	 * 
	 * @param sum
	 *            The sum of the name letters(ASCII codes)
	 * @return The female name that matches to defined sum value
	 */
	public static String numMatcher(int sum) {
		String femalename = "";

		if (sum < 800) {
			femalename = "Maria";
		} else if (sum >= 800 && sum < 1200) {
			femalename = "Elena";
		} else if (sum >= 1200 && sum < 1600) {
			femalename = "Marina";
		} else if (sum >= 1600) {
			femalename = "Nancy";
		}
		return femalename;
	}

}
