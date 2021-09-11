package com.demo.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springbasics.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext context=
//        		new ClassPathXmlApplicationContext("ApplicationCotext.xml");
//      Phone phone=context.getBean("myphone",Phone.class);
//      System.out.println(phone);
//      
//      Employe employe = context.getBean("employe",Employe.class);
//      System.out.println(employe);
  	
//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext();
//		context.refresh();
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		Watch watch = context.getBean(Watch.class);
		System.out.println(watch);
    }
}
