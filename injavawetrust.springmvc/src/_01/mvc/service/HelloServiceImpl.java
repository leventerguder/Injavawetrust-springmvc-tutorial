package _01.mvc.service;

import org.springframework.stereotype.Service;

import _01.mvc.domain.Message;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getMessage() {
		Message message = new Message();
		String greetingMessage = message.getGreetingMessage();
		return greetingMessage;
	}
}
