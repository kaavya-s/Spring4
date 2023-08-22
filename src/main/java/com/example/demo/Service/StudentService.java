package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public Student saveinfo(Student ss)
	{
		return sr.save(ss);
	}
	
	public List<Student> showinfo(){
		return sr.findAll();
	}
	public List<Student> savedetails(List<Student> ss)
	{
		return (List<Student>)sr.saveAll(ss);
	}
	public Student changeinfo(Student ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Student ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	public Optional<Student> getid(int id) {
		return sr.findById(id);
	}
	

}
