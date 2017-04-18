package com.pepper.provider;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(new String[] {"spring-service.xml"}).start();
		System.out.println("--------------------------> dubbo-provider started.......");
		while (true) {
			try {
				Thread.sleep(5 * 1000);
				System.out.println("-------------------> dubbo-provider heartbeat at:" + (new Date().getTime() / 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
