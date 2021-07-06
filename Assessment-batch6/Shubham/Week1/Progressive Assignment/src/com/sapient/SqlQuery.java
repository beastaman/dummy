package com.sapient;

public class SqlQuery {
	public String[] getTables(String arg)
	{
		String[] p1=arg.split("FROM");
		String[] p2=p1[1].split("WHERE");
		String[] res=p2[0].split(",");
		return res;
	}
	public String[] getConditions(String arg)
	{
		String[] p1=arg.split("WHERE");
		String[] res=p1[1].split(",");
		return res;
	}
}
