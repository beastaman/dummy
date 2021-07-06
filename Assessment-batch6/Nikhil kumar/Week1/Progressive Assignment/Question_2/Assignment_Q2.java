package com.sapient;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SQLFactory {
    private static SQLQuery sqlQuery=null;
    public static SQLQuery getSqlQuery(){
        if(sqlQuery==null){
            sqlQuery = new SQLQuery();
        }
        return sqlQuery;
    }
}
class SQLQuery {
    public String[] getTables(String query){
        return query.split("from ")[1].split("where")[0].split(", ");
    }
    public static String[] getConditions(String query){
        return query.split("where ")[1].split(" and | or ");
    }
    public Map<String, List<String>> getColumns(String query){
       Map<String,List<String>> cols = new HashMap<>();
       String columns = query.split("select")[1].split("from")[0];
       String[] tableCols = columns.split(", ");
        for (String t : tableCols) {
            t = t.replace(" ","");
            String[] td = t.split("\\.");
            if(cols.containsKey(td[0])) {
                List<String> al = cols.get(td[0]);
                al.add(td[1]);
                cols.put(td[0],al);
            }else{
                cols.put(td[0],new ArrayList<>(Arrays.asList(td[1])));
            }
        }

       return cols;
    }

    public List<String> getSubQuery(String query){
        List<String> subQueries = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\(.*?\\)");
        Matcher matcher = pattern.matcher(query.toString().toLowerCase());
        while (matcher.find()){
            subQueries.add(query.substring(matcher.start(), matcher.end()).replace("(","").replace(")",""));
        }
        return subQueries;
    }
}

public class Assignment_Q2 {
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        StringBuilder query = new StringBuilder();
        query.append("SELECT T1.ABC, T1.DEF, T2.XYZ, T3.PQR FROM TABLE1 T1, TABLE2 T2, TABLE3 T3")
                .append("WHERE T1.ID = T2.ID AND T2.SAL>T3.SAL OR ")
                .append("FNAME IN (SELECT * FROM DETAILS) AND PIN IN (SELECT * FROM ADDRESS)");

        System.out.println(query);
        System.out.println("Tables: "+Arrays.toString(SQLFactory.getSqlQuery().getTables(query.toString().toLowerCase())));
        System.out.println("Conditions: "+Arrays.toString(SQLFactory.getSqlQuery().getConditions(query.toString().toLowerCase())));
        System.out.println("Table Column Map: "+ SQLFactory.getSqlQuery().getColumns(query.toString().toLowerCase()));
        System.out.println("SubQueries: "+ SQLFactory.getSqlQuery().getSubQuery(query.toString().toLowerCase()));
    }

}
