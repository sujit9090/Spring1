package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class MainLogic {
	public  static void main (String args[])
	{
		Resource res=new ClassPathResource("/SpringDependencyInjection/src/com/ex/spring.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		journey x=(journey)factory.getBean("goa");
		x.startJourney();
	}

}
