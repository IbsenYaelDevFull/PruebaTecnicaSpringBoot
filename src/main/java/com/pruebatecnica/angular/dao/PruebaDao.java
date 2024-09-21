package com.pruebatecnica.angular.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.angular.models.Task;
import com.pruebatecnica.angular.pruebaInterfaces.TaskTaskRepository;

@Repository
public class PruebaDao {

	@Autowired
	TaskTaskRepository taskRepository;

	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<>();

		tasks = taskRepository.findAll();

		return tasks;

	}

	public int PersistTask(Task task) {
		int insert = 0;
		try {
			Boolean taskValidate = taskRepository.existsById(task.getId());
			if (!taskValidate) {
				taskRepository.save(task);
				insert = 1;
			}

			return insert;
		} catch (Exception e) {
			return insert;
		}

	}

	public int UpdateTask(Task task) {

		try {
			taskRepository.save(task);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}
	
	public int DeleteTask(Long id) {

		try {
			taskRepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}

}
