package com.etcbase.model;

public class Environment {

	int id;
	String name;
	String dbUser;
	String dbPassword;
	String JDBCConnectionString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getJDBCConnectionString() {
		return JDBCConnectionString;
	}

	public void setJDBCConnectionString(String jDBCConnectionString) {
		JDBCConnectionString = jDBCConnectionString;
	}

}
