package com.project.project1.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.project1.entity.Student;

@Repository
public interface Myrepository extends JpaRepository<Student, Integer>{
	
}
