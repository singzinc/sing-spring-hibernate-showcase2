package com.singplayground.showcase.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.singplayground.showcase.model.TestDateTime;

@Repository
public class TestDateDaoImpl implements TestDateDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<TestDateTime> getList() {

		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TestDateTime.class);

		List<TestDateTime> testList = criteria.list();
		return testList;
	}
}
