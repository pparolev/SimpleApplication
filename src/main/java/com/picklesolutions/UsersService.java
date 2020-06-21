package com.picklesolutions;

public class UsersService {

    public int count() {
        return 10;
    }
    public Boolean AuthenticateUser(String username, String password) {
        return username.equals("admin") && password.equals("adminpass");
    }
	public int cc() {
		return 23;
	}
}
