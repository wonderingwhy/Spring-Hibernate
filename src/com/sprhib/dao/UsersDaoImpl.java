package com.sprhib.dao;



import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.sprhib.dao.UserDao;
import com.sprhib.model.Users;

public class UsersDaoImpl implements UserDao{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(Users user) {  
       sessionFactory.getCurrentSession().save(user);
    }

	public Users getUser(String username) {
		String hqlString="from Users u where u.username=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hqlString);
		return (Users)query.uniqueResult();
	} 
}
