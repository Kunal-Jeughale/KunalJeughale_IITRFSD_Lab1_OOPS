package com.gl.service;

public class CredentialService {

	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialChar = "!@#$%^&*1234567890";
		String numbers = "1234567890";
		String values = capitalLetters + smallLetters + specialChar + numbers;
		char[] pwd = new char[8];
		for (int i = 0; i < 8; i++) {
			int rand = (int) (Math.random() * values.length());
			pwd[i] = values.charAt(rand);
		}
		return new String(pwd);
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".ceat.com";
	}

	public void showCredentials(String firstName, String email, String pwd) {
		System.out.println("Dear"+" "+firstName+" "+ "your generated credentials are as follows");
		System.out.println("Email --->" + email);
		System.out.println("Password --->" + pwd);
	}

}
