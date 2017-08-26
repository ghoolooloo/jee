package net.yohol.jee.listener;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import net.yohol.jee.app.MyService;

@WebListener()
public class MyListener implements ServletContextListener {
	@Inject
	private MyService service;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("======================================Init");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		service.doSth();
		
	}
}