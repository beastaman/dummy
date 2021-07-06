package com.Dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.entity.Branches;

public class BranchesDAOTest {

	@Test
	public void test_for_checking_the_count_of_all_the_branches() throws Exception {
		BranchesDAO branchdao = new BranchesDAO();

		List<Branches> allBranches = branchdao.getAllBranches();

		assertEquals(2, allBranches.size());
	}

}
