package com.task.services;

import java.util.concurrent.Callable;

public class NotifyCallable implements Callable<NotfiyEvent> {

	public NotfiyEvent call() throws Exception {
		System.out.println("Task completed" );
		return new NotfiyEvent();
	}

}
