package org.soap;

import org.soap.stub.ServerSoapService;
import org.soap.stub.Student;
import org.soap.stub.Genre;
import org.soap.stub.AddStudent;

import java.util.ArrayList;
import java.util.List;

public class ClientSoap {
    public static void main(String[] args) {
        ServerSoapService serviceStudent = new ServerSoapService();
        org.soap.stub.ServerSoap port = serviceStudent.getServerSoapPort();

        // Create a list of students
        List<Student> students = new ArrayList<>();
    Student student1 = new Student();
student1.setName("John");
student1.setPrenom("Doe");
student1.setGenre(Genre.F);
students.add(student1);

Student student2 = new Student();
student2.setName("Aniba");
student2.setPrenom("Soufiane");
student2.setGenre(Genre.F);
students.add(student2);

Student student3 = new Student();
student3.setName("ELASNI");
student3.setPrenom("Meriem");
student3.setGenre(Genre.M);
students.add(student3);

        // Add each student to the service
        for (Student student : students) {
            port.addStudent(student);
        }

        // Print all students
        System.out.println(port.getAllStudents());
    }
}