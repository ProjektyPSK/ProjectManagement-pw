package com.projectmanagement.repository;

import java.util.List;

import com.projectmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	List<Task> findByUserName(String user);
}
