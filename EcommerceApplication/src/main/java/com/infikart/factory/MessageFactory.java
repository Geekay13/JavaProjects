package com.infikart.factory;

import com.infikart.service.EmailService;
import com.infikart.service.MessageService;
import com.infikart.service.SMSservice;
import com.infikart.service.TwitterService;

public class MessageFactory {
	private static MessageService messageService;
	public static MessageService factoryMethod() {
		messageService= new EmailService();
		return messageService;
		
	}

}
