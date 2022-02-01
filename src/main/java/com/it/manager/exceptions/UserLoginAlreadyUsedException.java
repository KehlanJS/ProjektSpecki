package com.it.manager.exceptions;

public class UserLoginAlreadyUsedException extends RuntimeException {
    public UserLoginAlreadyUsedException() {
        super("Login already used!");
    }
}
