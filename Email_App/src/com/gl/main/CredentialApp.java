package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class CredentialApp {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Kunal", "Jeughale");
		CredentialService credentialService= new CredentialService();
		String generatedEmail = null;
		String generatedPwd;
		Scanner scanner = new Scanner(System.in);
		System.out.println("       ******* Welcome to CEAT LTD******");
		System.out.println("--------------------------------------------------------");
		System.out.println("Please enter the department from the Following :");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = scanner.nextInt();
		if(option==1) {
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");
			
		}else if(option==2){
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"adm");
			
		}else if(option==3){
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"HR");
			
		}else if(option==4){
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");
		}else {
			System.out.println("Invalid Option");
			scanner.close();
			System.exit(-1);
		}
		
		generatedPwd=credentialService.generatePassword();
		credentialService.showCredentials(employee.getFirstName(), generatedEmail, generatedPwd);
		}
	
	}


