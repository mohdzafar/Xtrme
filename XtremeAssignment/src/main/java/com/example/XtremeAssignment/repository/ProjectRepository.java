package com.example.XtremeAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.XtremeAssignment.model.Employee;
import com.example.XtremeAssignment.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
