
package com.infikart;

import com.infikart.factory.MessageFactory;
import com.infikart.service.EmailService;
import com.infikart.service.MessageService;
import com.infikart.service.SMSservice;
import com.infikart.service.TwitterService;

public class ClientMessagingSystem {
	
	private MessageService messageService=  MessageFactory.factoryMethod();
	
	public void send(String address,String message) {
		boolean messageStatus=this.messageService.sendMessage(address, message);
		if(messageStatus==false) {
			System.out.println("invalid address,pl resend");
		}
	}

}
