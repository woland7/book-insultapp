package org.openshift;
import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@RequestScoped
@Path("/greetings")
public class GreetingsResource {
	@GET()
	@Produces("application/json")
	public HashMap<String,String> getGreeting(@Context final HttpServletResponse response) {
		HashMap<String, String> theGreeting = new HashMap<String, String>();
		theGreeting.put("insult", new GreetingsGenerator().generateGreeting());
		response.setStatus(HttpServletResponse.SC_CREATED);
		return theGreeting;
	}
}