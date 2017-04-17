package com.matchmaker.webapp.perfectmatcher;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.matchmaker.webapp.numberizer.Numberizer;
import com.matchmaker.webapp.nummatcher.NumMatcher;

/**
 * 
 * @author Giannis Konomis Perfect Matcher is a web service that accepts as a
 *         parameter a Male name and returns as a result a Female mate
 *
 */

@Path("/perfectmatcher")
public class PerfectMatcher {

	/**
	 * 
	 * @param malename
	 *            The Male name that the user want to check
	 * @return The female mate or Error if the inserted name doesn't match the
	 *         requested format
	 */
	@POST
	@Path("/mate") // the path of the web service
					// http://localhost:8080/webapp/webapi/perfectmatcher/mate
	// @FormParam annotation to bind HTML form parameters value to a Java method
	public Response postFemaleName(@FormParam("malename") String malename) {

		if (malename.endsWith("s")) {// checks if it is a Male name(for Greek
										// names that end with an "s")

			// conversion of the male name to his female mate
			String femalename = NumMatcher.numMatcher(Numberizer.numberizer(malename));

			return Response.status(200).entity("Perfect Match for " + malename + " is " + femalename).build();
		} else {
			return Response.status(404).entity("Error!! Try again typing a proper male name!!").build();
		}
	}

	/**
	 * 
	 * @param malename
	 *            The name that we want to convert
	 * @return The sum of the name letters(ASCII codes)
	 */
	@POST
	@Path("/asciiSum") // the path of the web service
						// http://localhost:8080/webapp/webapi/perfectmatcher/asciiSum
	public Response postAsciiSum(@FormParam("malename") String malename) {

		int sum = Numberizer.numberizer(malename); // calculation of the sum of
													// name letters(ASCII codes)

		return Response.status(200).entity("Ascii value of name " + malename + " is: " + sum).build();

	}

}