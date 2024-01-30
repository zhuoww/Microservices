package com.learning.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboot.learnjpaandhibernate.course.Course;
import com.learning.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.learning.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	

//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn Jpa", "yun"));
//		repository.insert(new Course(2, "Learn ccc Jpa", "lal"));
//		repository.insert(new Course(3, "Learn xxx Jpa", "duo"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(2));
//	}
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn Jpa", "yun"));
		repository.save(new Course(2, "Learn ccc Jpa", "lal"));
		repository.save(new Course(3, "Learn xxx Jpa", "duo"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("duo"));
		System.out.println(repository.findByName("Learn ccc Jpa"));
		
		
	}
	

}
