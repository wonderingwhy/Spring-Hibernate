package com.sprhib.dao;


import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sprhib.model.Users;


public class SpringTest {

	private static ApplicationContext context=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("sprhib-data.xml");
	}

	@Test
	public void test() {
		SessionFactory bean=(SessionFactory)context.getBean("sessionFactory");
		HibernateTemplate hibernateTemplate =new HibernateTemplate(bean);
		Users user = new Users();
		user.setUsername("xnn");
		user.setPassword("123");
		hibernateTemplate.save(user);
	}

}
