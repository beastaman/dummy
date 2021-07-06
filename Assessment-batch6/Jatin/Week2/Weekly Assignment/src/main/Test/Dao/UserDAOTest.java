package com.Dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserDAOTest {

	@Test
	public void test_of_user_when_wrong_username_passed() throws Exception {
		UserDAO userdao = new UserDAO();

		// assertEquals(null, userdao.getUserByEmailAndPwd("jatin", "huchekck"));
	}

	@Test
	public void test_of_user_when_user_credentails_are_correct() throws Exception {
		UserDAO userdao = new UserDAO();

		assertEquals(1, userdao.getUserByEmailAndPwd("jatin singh", "pwd@1234").getUserid());
	}



}
