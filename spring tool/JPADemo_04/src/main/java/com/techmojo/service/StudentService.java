package com.techmojo.service;

 

import java.io.InvalidClassException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Student;
import com.techmojo.repo.StudentRepo;

@Service
public class StudentService {

		public StudentService() {
			// TODO Auto-generated constructor stub
		}
		StudentRepo sr;
		
		@Autowired
		public void setStudentRepo(StudentRepo sr) {
			this.sr = sr;
		}
		
		public Student recruit(Student stud) {
			return sr.save(stud);
		}
		
		public List<Student> listofStudents(){
			return sr.findAll();
		}
		
		public Student terminate(int id) throws InvalidClassException{
			Student remStud = searchStudent(id);//only to delete if stud is
			sr.deleteById(id);
			return remStud;
		}
		
//		search employee
		public Student searchStudent(int id) throws InvalidClassException{
			Optional<Student> optStud = sr.findById(id);
			if(!optStud.isPresent())
				throw new InvalidClassException("Student id " + id + "is not available");
			return optStud.get();
		}

}
