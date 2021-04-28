package model;

public class Transactions {
	public int id;
	public int userID;
	public int roleID;
	public String type;
	
	public Transactions(int id, int userID, int roleID, String type) {
		this.id = id;
		this.userID = userID;
		this.roleID = roleID;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public int getUserID() {
		return userID;
	}

	public int getRoleID() {
		return roleID;
	}

	public String getType() {
		return type;
	}
}
