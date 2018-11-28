package edu.ifg.lessons.services;

import java.util.ArrayList;
import java.util.List;

import edu.ifg.lessons.entity.Student;

public class StudentService {

	
	public List<Student> getStudents(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("123", "Lucas"));
		list.add(new Student("321", "João"));
		list.add(new Student("455", "Marcos"));
		list.add(new Student("564", "Joel"));
		list.add(new Student("564", "Rafael"));
		list.add(new Student("564", "Ana Mel"));
		list.add(new Student("564", "Ana Júlia"));
		list.add(new Student("564", "Lara"));
		list.add(new Student("564", "Ana Luiza"));
		list.add(new Student("564", "Joseph"));
		return list;
	}
}
