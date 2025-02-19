package com.trios.csd214test1bdianat;
public class UserModel {
    //static username and password
    private static final String VALID_USERNAME = "Diana";
    private static final String VALID_PASSWORD = "456";

    private int failedAttempts = 0;
    private boolean isLocked = false;
//handling validation of the user credentials
    public String authenticate(String username, String password) {
        if (isLocked) {
            return "Sorry, Your Account is Locked!!!";
        }

        if (username.isEmpty() || password.isEmpty()) {
            return "Please Provide Username or Password.";
        }

        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            failedAttempts = 0; // reset attempts on success
            return "Success!!!";
        } else {
            failedAttempts++;
            //after hitting 5 failedAttempts, the message of locking will be displayed
            if (failedAttempts >= 5) {
                isLocked = true;
                return "Sorry, Your Account is Locked!!!";
            }
            return "Sorry, Invalid Username or Password.";
        }
    }
}
