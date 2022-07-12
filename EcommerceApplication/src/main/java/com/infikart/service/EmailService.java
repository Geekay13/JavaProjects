package com.infikart.service;

public class EmailService implements MessageService {

	public boolean sendMessage(String address, String message) {
		
		String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean messageStatus= false;
		
		if(address.matches(regex)) {
			messageStatus=true;
			System.out.println("the message is "+message+ "sent to "+address);
		}

		
		return messageStatus;
	}

}
