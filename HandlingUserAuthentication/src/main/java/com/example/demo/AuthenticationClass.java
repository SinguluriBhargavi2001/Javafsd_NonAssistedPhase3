package com.example.demo;

import java.util.Scanner;

public class AuthenticationClass {
	Scanner sc=new Scanner(System.in);
	
	String ValidateUser(){
		System.out.println("Enter User ID: ");
		String user=sc.next();
		return user;
	}
	String ValidatePwd(){
		System.out.println("Enter User Password: ");
		String pwd=sc.next();
		return pwd;
	}
}
