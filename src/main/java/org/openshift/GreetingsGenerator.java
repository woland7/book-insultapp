package org.openshift;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GreetingsGenerator {
	public String generateGreeting() {
		String theGreeting = "";

		try {
			String databaseURL = "jdbc:postgresql://";
			databaseURL += System.getenv("POSTGRESQL_SERVICE_HOST");
			databaseURL += "/" + System.getenv("database_name");

			String username = System.getenv("username");
			String password = System.getenv("password");
			Connection connection = DriverManager.getConnection(databaseURL, username, password);

			if (connection != null) {
				System.out.println("connected");
				String SQL = "select a.string AS saluto, b.string AS appellativo, c.string AS domanda from saluti a , appellativi b, domande c ORDER BY random() limit 1";
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(SQL);
				while (rs.next()) {
					theGreeting =  String.format("Thou art %s %s %s %s!",rs.getString("saluto"),
							rs.getString("appellativo"), rs.getString("domanda"));
				}
				rs.close();
				connection.close();
			}
		} catch (Exception e) {
			return "Database connection problem!";
		}
		return theGreeting;
	}
}