package org.jkjava.weixin.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kemao_1/message/receiver")
public class MessageReceiverControll {
	private static final Logger LOG =LoggerFactory.getLogger(MessageReceiverControll.class);
	@GetMapping
	public  String echo(
			@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr
			) {
		return echostr;
	}
	
	@PostMapping
	 
	public String onMessage(
			@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestBody String xml) {
			//收到消息
		LOG.trace("收到的消息原文:\n{}\n--------------",xml);
			//接受消息
		
		return null;
		
	}
	
}
