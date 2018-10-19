package org.dao;

import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.pojo.Idiot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("idiotDao")
@Transactional
public class IdiotDao 
{
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//@Transactional
	public int addIdiot(Idiot idiot) 
	{
		
		Session session = sessionFactory.getCurrentSession();
		int x = (int)session.save(idiot);
		return x;
	}
	
	public List<Idiot> getAllIdiots() //8657420671
	{
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Idiot.class);
		return (List<Idiot>)criteria.list();
		
	}
	
	public Idiot getIdiotById(String email)
	{
		Session session = sessionFactory.getCurrentSession();
		/*Idiot idiot  = (Idiot) session.get(Idiot.class, email);*/
		Query q = session.createQuery("from Idiot where email = :b");
		q.setParameter("b", email);
		Idiot idiot = (Idiot) q.uniqueResult();
 		
		System.out.println(idiot);
		return idiot;
	}

	public void updateIdiot(Idiot idiot) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(idiot);
	}

	public void deletetByEmail(String email)
	{
		Session session = sessionFactory.getCurrentSession();
		Idiot idiot = (Idiot) session.get(Idiot.class, email);
		if (idiot!=null)
		session.delete(idiot);
	}
}
