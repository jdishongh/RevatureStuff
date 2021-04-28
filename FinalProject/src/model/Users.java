package model;

public class Users {
	public String name;
	public int id;
	public String username;
	private String password;
	
	public Users(int id, String name, String username, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
