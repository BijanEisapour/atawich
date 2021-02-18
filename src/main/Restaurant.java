package main;

import enums.*;

import java.util.ArrayList;

public class Restaurant {
	public static ArrayList<User> users = new ArrayList<>();
	public static ArrayList<Food> menu = new ArrayList<>();
	public static ArrayList<Order> orders = new ArrayList<>();
	
	public static User activeUser;
	
	public static ActionResult login(String username, String password) {
		for (User user : users) {
			if (user.username.equals(username)) {
				if (user.password.equals(password)) {
					activeUser = user;
					return ActionResult.SUCCESS;
				} else {
					return ActionResult.INVALID_PASSWORD;
				}
			}
		}
		
		return ActionResult.USERNAME_NOT_FOUND;
	}
}
