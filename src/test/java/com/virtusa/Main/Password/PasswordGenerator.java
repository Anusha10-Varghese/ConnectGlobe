package com.virtusa.Main.Password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "anusha@0707";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println(encodedPassword);

	}

}
