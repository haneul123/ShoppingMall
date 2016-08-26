package shoppingMall.User.View;

import java.util.Scanner;

import shoppingMall.User.Vo.User;

public class UserView {
	
	private Scanner keyboard;
	
	
	public UserView(){
		
		 keyboard = new Scanner(System.in);
		
	}

	
	public User userSignUpView(){ //void
		
		User userSign = new User();
		
		System.out.println("회원가입");
		
		System.out.println("[이 름: ]");
		String userName = keyboard.next();
		
		System.out.println("[I D: ]");
		String userID = keyboard.next();
		
		System.out.println("[P W: ]");
		String userPW = keyboard.next();
		
		System.out.println("[E-MAIL: ]");
		String userEmail = keyboard.next();
		
		System.out.println("[나 이: ]");
		int userAge = keyboard.nextInt();
		
		System.out.println("[주 소: ]");
		String userAddr = keyboard.next();
		
		System.out.println("[전화번호: ]");
		String userTel = keyboard.next();
		
		userSign = new User(userID,userPW, userEmail, userName, userAddr, userAge, userTel);
		
		return userSign;
		
	}

}