package com.projectmanagement.service;

import java.util.List;
import java.util.Optional;

import com.projectmanagement.model.Task;
import org.springframework.stereotype.Service;

import com.projectmanagement.repository.TaskRepository;

@Service
public class TaskService {

	private TaskRepository taskRepository;

	public void save(Task task){
		taskRepository.save(task);
	}
	public void deletebyId(long id){
		taskRepository.deleteById(id);
	}
	public List<Task> getTodosByUser(String name){
		return taskRepository.findByUserName(name);
	}

	public void deleteTodo(long id) {
		Optional<Task> todo = taskRepository.findById(id);
		if (todo.isPresent()) {
			taskRepository.delete(todo.get());
		}
	}
	public void saveTodo(Task task) {
		taskRepository.save(task);
	}
	public Optional<Task> getTodoById(long id) {
		return taskRepository.findById(id);
	}

	public void updateTodo(Task task) {
		taskRepository.save(task);
	}
}