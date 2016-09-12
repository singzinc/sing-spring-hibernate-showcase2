package com.singplayground.showcase.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.singplayground.showcase.model.TestMod;

@Repository
public class TestDaoImpl implements TestDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void savaOrupdate(Object object) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(object);

	}

	public List<TestMod> getList() {

		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TestMod.class);

		List<TestMod> campaignList = criteria.list();
		return campaignList;
	}

}
