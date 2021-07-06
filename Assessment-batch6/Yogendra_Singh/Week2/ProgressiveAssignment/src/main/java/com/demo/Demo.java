package com.demo;

import java.util.List;

import com.dao.BranchDAO;
import com.to.Branch;

public class Demo {

	public static void main(String[] args) throws Exception {
		BranchDAO branchDAO = new BranchDAO();
		List<Branch> branches= branchDAO.getAllBranches();
		for(Branch branch: branches)
			System.out.println(branch);
	}

}
