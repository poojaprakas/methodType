package com.xworkz.controlStaments;

public class Email {
	public static void email(String name1,int num) {
		String username = "pooja";
		int password = 2345;
		if (username==name1 && password==num) {
			System.out.println("login to mail");
		}
		else
		{
			System.out.println("login failed");
		}
	}

	public static void main(String[] args) {
		Email.email("pooja", 2345);

	}

}
