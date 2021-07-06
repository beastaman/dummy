package connect;
import java.util.*;

import com.to.Student;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			StudentDAO studentDAO=new StudentDAO();
			System.out.println(studentDAO.deleteStudent());
			
			/*StudentDAO studentDAO=new StudentDAO();			 //update
			System.out.println(studentDAO.updateStudent());*/
			
			
			/*StudentDAO studentDAO=new StudentDAO();			  //Insert
			Student student=new Student("s22","suyash","baghel","1999/01/01","delhi");
			System.out.println(studentDAO.saveStudent(student));*/
			
			  //StudentDAO studentDAO=new StudentDAO();			//Print all rows of table
			  //List<Student>student=studentDAO.getAllStudent();
			  //student.forEach(System.out::println);
			
			
			  //System.out.println("-------------");         //Get a record
			  //Student student2=studentDAO.getAnyStudent("s101"); 
			  //System.out.println(student2);
			 
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
