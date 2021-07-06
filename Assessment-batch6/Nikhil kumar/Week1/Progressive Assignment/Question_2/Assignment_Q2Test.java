package com.sapient;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Assignment_Q2Test {
    static SQLQuery sqlQuery;

    @BeforeAll
    static void init(){
        sqlQuery = SQLFactory.getSqlQuery();
    }

    @Test
    void checkObject(){
        SQLQuery sqlObj = SQLFactory.getSqlQuery();
        assertSame (sqlObj, sqlQuery);
    }

    @Test
    void getTables1() {
        assertArrayEquals(new String[]{"table t", "table x"},sqlQuery.getTables("SELECT T.A,T.B FROM Table T, Table X".toLowerCase()));
    }

    @Test
    void getTables2() {
        assertArrayEquals(new String[]{"table t", "table x"},sqlQuery.getTables("SELECT T.A,T.B FROM Table T, Table X".toLowerCase()));
    }

    @Test
    void getTables3() {
        assertArrayEquals(new String[]{"t", "x", "y"},sqlQuery.getTables("SELECT T.A,T.B, Y.D FROM T, X, Y".toLowerCase()));
    }

    @Test
    void getConditions1() {
        assertArrayEquals(new String[]{"t.a>20", "x.b=40"},sqlQuery.getConditions("SELECT T.A,X.B FROM Table T, Table X WHERE T.A>20 AND X.B=40".toLowerCase()));
    }

    @Test
    void getConditions2() {
        assertArrayEquals(new String[]{"t.a>20", "x.b=40", "x.d<>20"},sqlQuery.getConditions("SELECT T.A,X.B FROM Table T, Table X WHERE T.A>20 OR X.B=40 OR X.D<>20".toLowerCase()));
    }

    @Test
    void getColumns1() {
        String query = "SELECT T.A, T.B, X.C, X.D FROM Table T, Table X WHERE T.A>20 AND X.B=40".toLowerCase();
        Map<String, List<String>> map = new HashMap<>();
        map.put("t", new ArrayList<>(Arrays.asList("a","b")));
        map.put("x", new ArrayList<>(Arrays.asList("c","d")));
        assertTrue(map.equals(sqlQuery.getColumns(query)));
    }

    @Test
    void getColumns2() {
        String query = "SELECT T.A, T.B, X.C, X.D, Y.E, Y.F FROM Table T, Table X,  WHERE T.A>20 AND X.B=40".toLowerCase();
        Map<String, List<String>> map = new HashMap<>();
        map.put("t", new ArrayList<>(Arrays.asList("a","b")));
        map.put("x", new ArrayList<>(Arrays.asList("c","d")));
        map.put("y", new ArrayList<>(Arrays.asList("e","f")));
        assertTrue(map.equals(sqlQuery.getColumns(query)));
    }

    @Test
    void getSubQuery1() {
        String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20 AND FNAME IN (SELECT * FROM DETAILS)".toLowerCase();
        assertTrue(Arrays.asList("select * from details").equals(sqlQuery.getSubQuery(query)));
    }

    @Test
    void getSubQuery2() {
        String query = "SELECT * FROM T1, T2 WHERE AGE>22 AND FNAME IN (SELECT * FROM T3) AND LNAME IN (SELECT LN FROM T4)".toLowerCase();
        assertTrue(Arrays.asList("select * from t3","select ln from t4").equals(sqlQuery.getSubQuery(query)));
    }
}