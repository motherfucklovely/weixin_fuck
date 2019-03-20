package org.jkjava.weixin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kemao_1/wexin/receiver")
public class MessageReceiverControll {

	@GetMapping
	public  String echo(
			String signature,
			String timestamp,
			String nonce,
			String echostr
			
			
			) {
		
		
		
		return echostr;
	}
}
