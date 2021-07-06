package com.dao;

import java.util.List;

import com.to.Student;
import com.to.StudentJoinMark;

public class Demo1 {

    public static void main(String[] args) {

        try {

            // Student student = new Student("s106", "Billy", "Eilish", "1999/02/23",
            // "Delhi", "11111111");

            StudentDAO studentDAO = new StudentDAO();

            // System.out.println(studentDAO.insertStudent(student));
//			List<Student> student = studentDAO.getAllStudent();
//			System.out.println(student);
//
//			Student student2 = studentDAO.getAnyStudent("s107");
//			System.out.println(student2);

            // System.out.println(studentDAO.deleteStudent("s106"));

            // Student student3 = new Student("s106", "Bill", "Clinton", "1967/02/3",
            // "Delhi", "1231111111");

            // System.out.println(studentDAO.updateStudent(student3));

            List<Student> studentMarks = studentDAO.getAllStudent();
            System.out.println(studentMarks);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}


