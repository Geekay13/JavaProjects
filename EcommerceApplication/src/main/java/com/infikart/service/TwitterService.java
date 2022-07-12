package com.infikart.service;

public class TwitterService implements MessageService {

	public boolean sendMessage(String address, String message) {
		boolean messageStatus= false;
		if(address.contains("@")&&	message.length()<=50) {
			messageStatus=true;
			System.out.println("The tweet: "+message+"sent to "+address);
		}


		return messageStatus;
	}

}
