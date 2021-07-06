package com.dao;

import com.dto.Student;

public class Demo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        try {

//            System.out.println(studentDao.getAnyStudent("102"));
//            studentDao.addStudent(Student.builder()
//                    .id("107")
//                    .fName("Nishant")
//                    .lName("Sharma")
//                    .dob("1967/05/24")
//                    .area("Shalimar Bagh, Delhi")
//                    .phone("918891726810")
//                    .build());
//            studentDao.getAllStudent().forEach(System.out::println);
            studentDao.update("102", "918859050410");
            System.out.println(studentDao.findStudentById("102"));
            studentDao.deleteById("107");
            studentDao.findAll().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
