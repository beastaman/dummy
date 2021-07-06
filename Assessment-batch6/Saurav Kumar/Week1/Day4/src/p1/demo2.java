package p1;

public class demo2 {
    public static void main(String[] args) {
        String query = "Select firstName, lastName, age from table1 where age = 20";

        String arr[] = query.split(" ");
        for(String s:arr) {
            System.out.println(s);
        }

        String arr1[] = query.split("from");
        for(String s:arr1) {
            System.out.println(s);
        }

        String arr2[] = arr1[0].split(" ");
        for(int i=1; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        String tableName_and_condition[] = query.split("from")[1].split("where");

        System.out.println("table name is : " + tableName_and_condition[0]);
        System.out.println("condition is : " + tableName_and_condition[1]);
    }
}
