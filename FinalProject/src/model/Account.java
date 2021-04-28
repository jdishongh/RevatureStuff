package model;

public class Account {
	public int id;
	public int userID;
	
	public Account(int id, int userID) {
		this.id = id;
		this.userID = userID;
	}
	public int getID() {
		return id;
	}
	public int getUserID() {
		return userID;
	}
}
