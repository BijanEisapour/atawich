package enums;

public enum ActionResult {
	SUCCESS("Action has been done successfully!"),
	INVALID_USERNAME("You have entered an invalid username!"),
	INVALID_PASSWORD("You have entered an invalid password!"),
	USERNAME_NOT_FOUND("The username is not found!"),
	USERNAME_ALREADY_EXIST("The username is already exist!"),
	FOOD_NOT_FOUND("The food is not found!"),
	FOOD_ALREADY_EXIST("The food is already exist!"),
	ORDER_NOT_FOUND("The order is not found!"),
	ORDER_ALREADY_EXIST("The order is already exist!"),
	UNKNOWN_ERROR("An unknown error has been occurred!");
	
	public String message;
	
	ActionResult(String message) {
		this.message = message;
	}
}
