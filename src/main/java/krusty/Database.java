package krusty;

import java.sql.*;
import spark.Request;
import spark.Response;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static krusty.Jsonizer.toJson;

public class Database {
	/**
	 * Modify it to fit your environment and then use this string when connecting to your database!
	 */

	private Connection conn;

	//private static final String jdbcString = "jdbc:mysql://localhost/krusty";
	private static final String jdbcString = "jdbc:mysql://puccini.cs.lth.se/" + "db18";

	// For use with MySQL or PostgreSQL
	private static final String jdbcUsername = "db18";
	private static final String jdbcPassword = "tlq370ri";

	public void connect() {
		try {
			conn = DriverManager.getConnection
					(jdbcString, jdbcUsername, jdbcPassword);
		}
		catch (SQLException e) {
			System.err.println(e);
			e.printStackTrace();

		}
	}

	// TODO: Implement and change output in all methods below!

	public String getCustomers(Request req, Response res) {
		return "{}";
	}

	public String getRawMaterials(Request req, Response res) {
		return "{}";
	}

	public String getCookies(Request req, Response res) {
		return "{\"cookies\":[]}";
	}

	public String getRecipes(Request req, Response res) {
		return "{}";
	}

	public String getPallets(Request req, Response res) {
		return "{\"pallets\":[]}";
	}

	public String reset(Request req, Response res) {
		return "{}";
	}

	public String createPallet(Request req, Response res) {
		return "{}";
	}
}
