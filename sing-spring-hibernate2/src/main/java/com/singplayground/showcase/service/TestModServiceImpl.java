package com.singplayground.showcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.singplayground.showcase.dao.TestDao;
import com.singplayground.showcase.model.TestMod;

@Service
public class TestModServiceImpl implements TestModService {

	@Autowired
	private TestDao testDao;

	/*
		public void setTestDao(TestDao testDao) {
			this.testDao = testDao;
		}
	*/
	//@Transactional
	@Override
	public void saveOrupdateTest(TestMod testMod) throws IllegalArgumentException {

		Assert.notNull(testMod, "testMod cannot null");
		testDao.savaOrupdate(testMod);
	}

	//@Transactional
	@Override
	public List<TestMod> listTestMod() {
		return testDao.getList();
	}

}
