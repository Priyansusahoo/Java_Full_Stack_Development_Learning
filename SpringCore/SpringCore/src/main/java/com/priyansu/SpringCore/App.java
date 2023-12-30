package com.priyansu.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args ) {
    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	Alien obj = (Alien)factory.getBean("alien");
    }
}
