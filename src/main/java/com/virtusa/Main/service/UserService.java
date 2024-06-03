package com.virtusa.Main.service;

import com.virtusa.Main.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
