package com.amit.java8.db;

import java.util.ArrayList;
import java.util.List;
import com.amit.java8.dto.Student;

public class StudentDB {
	private StudentDB() {
		super();
	}
	
	public static List<Student> getStudents() {
	        List<Student> students = new ArrayList<>();

	        students.add(new Student("John Doe", 20, "Math", 3.5));
	        students.add(new Student("Jane Smith", 22, "Science", 3.8));
	        students.add(new Student("Emily Johnson", 21, "History", 3.2));
	        students.add(new Student("Michael Brown", 23, "Art", 3.9));
	        students.add(new Student("Emma Watson", 24, "English", 3.7));
	        return students;
	    }
}
