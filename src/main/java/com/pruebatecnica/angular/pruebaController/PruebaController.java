package com.pruebatecnica.angular.pruebaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.angular.models.ResponseModel;
import com.pruebatecnica.angular.models.Task;
import com.pruebatecnica.angular.pruebaInterfaces.PruebaServiceInt;

@RestController
@RequestMapping("/api/tasks")
public class PruebaController {
	
	@Autowired
	PruebaServiceInt pruebaServiceInt;
	
    @GetMapping("/getAll")
    public ResponseEntity<ResponseModel> getAllTasks() {
    	
    	return pruebaServiceInt.getAllTasks();
  
    }
    
    @PostMapping("/create")
    public ResponseEntity<ResponseModel> createTask(@RequestBody Task task) {
    	return pruebaServiceInt.createTask(task);
    }
    
    @PutMapping("/update")
    public ResponseEntity<ResponseModel> updateTask(@RequestBody Task taskDetails) {
    	   return pruebaServiceInt.updateTask(taskDetails);
    }
 
    

     @DeleteMapping("/{id}")
     public ResponseEntity<ResponseModel> deleteTask(@PathVariable Long id) {
    	 return pruebaServiceInt.deleteTask(id);
     }
     
    


}
