package com.task.controller;

import java.util.concurrent.ExecutionException;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.services.NotifyCallable;
import com.task.services.NotifyFutureCallback;
import com.task.services.PushNotifyServices;

@RestController
public class IndexController {

	@Resource
	protected PushNotifyServices pushNotifyServices;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) throws InterruptedException, ExecutionException {
		NotifyCallable callable =new NotifyCallable();
		NotifyFutureCallback callback =new NotifyFutureCallback();
		pushNotifyServices.execute(callable, callback);
		return "Hello " + myName + "!!!";
	}
	
	
}
