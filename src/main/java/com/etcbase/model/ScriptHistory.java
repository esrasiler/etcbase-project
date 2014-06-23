package com.etcbase.model;

public class ScriptHistory {

	int idEnvironment;
	int idDbScript;
	boolean state; // is Success
	String error;

	public int getIdEnvironment() {
		return idEnvironment;
	}

	public void setIdEnvironment(int idEnvironment) {
		this.idEnvironment = idEnvironment;
	}

	public int getIdDbScript() {
		return idDbScript;
	}

	public void setIdDbScript(int idDbScript) {
		this.idDbScript = idDbScript;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
