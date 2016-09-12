package com.singplayground.showcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singplayground.showcase.dao.TestDateDao;
import com.singplayground.showcase.model.TestDateTime;

@Service
public class TestDateTimeServiceImpl implements TestDateTimeService {

	@Autowired
	private TestDateDao testDateDao;

	public void setTestDateDao(TestDateDao testDateDao) {
		this.testDateDao = testDateDao;
	}

	/*
		@Transactional
		public void saveOrupdateTest(TestMod testMod) throws IllegalArgumentException {
			logger.info("thsi is service");
			Assert.notNull(testMod, "testMod cannot null");
			testDao.savaOrupdate(testMod);
		}
	*/
	//@Transactional
	public List<TestDateTime> listTestDate() {
		return testDateDao.getList();
	}

}
