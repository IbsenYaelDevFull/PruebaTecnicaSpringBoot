package com.pruebatecnica.angular.pruebaInterfaces;

import org.springframework.http.ResponseEntity;

import com.pruebatecnica.angular.models.ResponseModel;
import com.pruebatecnica.angular.models.Task;

public interface PruebaServiceInt {
	
	public ResponseEntity<ResponseModel> getAllTasks();
	
	public ResponseEntity<ResponseModel> createTask(Task task);
	
	public ResponseEntity<ResponseModel> updateTask(Task taskDetails);
	
	public ResponseEntity<ResponseModel> deleteTask(Long id);

}
