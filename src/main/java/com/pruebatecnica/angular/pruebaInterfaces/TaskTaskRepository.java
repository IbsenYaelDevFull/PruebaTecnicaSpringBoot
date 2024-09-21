package com.pruebatecnica.angular.pruebaInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.angular.models.Task;

public interface TaskTaskRepository extends JpaRepository<Task, Long>  {

}
