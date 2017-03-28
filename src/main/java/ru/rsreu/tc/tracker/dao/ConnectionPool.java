/**
 * 
 */
package ru.rsreu.tc.tracker.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import oracle.jdbc.OracleDriver;

/**
 * @author Lenovo
 *
 */
public class ConnectionPool {

	private static final String BUNDLE_PATH = "bundle.propertyDB";
	private ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_PATH);
	// private static final String DATASOURCE_NAME =
	// "jdbc:oracle:thin:@localhost:1521:XE";
	// private static DataSource dataSource;
	// static {
	// try {
	// Context initContext = new InitialContext();
	// Context envContext = (Context) initContext.lookup("jdbc/oracle");
	// dataSource = (DataSource) envContext.lookup(DATASOURCE_NAME);
	// } catch (NamingException e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * 
	 */
	public ConnectionPool() {
	}

	/**
	 * @return connection
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		// Connection connection = dataSource.getConnection("OLGA_DB",
		// "lost11");

		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection(bundle.getString("URL"), bundle.getString("USER"),
				bundle.getString("PASSWORD"));
		return connection;
	}

	/**
	 * @param connection
	 * @throws SQLException
	 */
	public void putConnection(Connection connection) throws SQLException {
		connection.close();
	}

}
