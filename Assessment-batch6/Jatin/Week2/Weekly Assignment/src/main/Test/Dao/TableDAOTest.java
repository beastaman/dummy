package com.Dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TableDAOTest {

	@Test
	public void test_when_branch_id_isInvalid() throws Exception {
		TableDAO tabledao = new TableDAO();
		assertEquals(0, tabledao.getAllTableUnreservedInBranch(10).size());
	}

	@Test
	public void test_when_branch_id_isvalid() throws Exception {
		TableDAO tabledao = new TableDAO();
		assertEquals(3, tabledao.getAllTableUnreservedInBranch(1).size());
	}

}
