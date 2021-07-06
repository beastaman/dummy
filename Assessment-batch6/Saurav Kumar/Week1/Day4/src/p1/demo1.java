package p1;

public class demo1 {
    public static void main(String[] args) {
        // different types of objects are pojo (transfer object)
        // Plain old java object, contains only data members
        // 2nd type is Business object which contains
        // only the logics to perform certain things, to this
        // logic data supplied by pojo.
        // 3rd type is DAO (data access object)

        EmployeeTo emp1 = new EmployeeTo("John", "Wick", 40, 1000000);

        TaxCalculation taxCal = new TaxCalculation();
//        emp1.setFirstName("John");
//        emp1.setLastName("Wick");
//        emp1.setAge(40);
//        emp1.setSalary(1000000);

        System.out.println(emp1);
        System.out.println("Tax is " + taxCal.calculateTax(emp1));
    }
}
