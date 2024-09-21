package com.pruebatecnica.angular.pruebaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pruebatecnica.angular.dao.PruebaDao;
import com.pruebatecnica.angular.models.ResponseModel;
import com.pruebatecnica.angular.models.Task;
import com.pruebatecnica.angular.pruebaInterfaces.PruebaServiceInt;
import com.pruebatecnica.angular.utils.Utils;

@Service
public class PruebaService implements PruebaServiceInt {

	@Autowired
	PruebaDao pruebaDao;

	@Override
	public ResponseEntity<ResponseModel> getAllTasks() {

		List<Task> list = pruebaDao.getAllTasks();

		if (list.isEmpty())
			return Utils.responseError("No se ha encontrado información");

		return Utils.responseSuccess(list);
	}

	@Override
	public ResponseEntity<ResponseModel> createTask(Task task) {
		task.setCompleted(false);
		if (pruebaDao.PersistTask(task) == 0)
			return Utils.responseError("No se ha podido crear la tarea");

		return Utils.responseSuccess(task);
	}

	@Override
	public ResponseEntity<ResponseModel> updateTask(Task taskDetails) {
		if (pruebaDao.UpdateTask(taskDetails) == 0)
			return Utils.responseError("No se ha podido editar la tarea");

		return Utils.responseSuccess(taskDetails);
	}

	@Override
	public ResponseEntity<ResponseModel> deleteTask(Long id) {
		if (pruebaDao.DeleteTask(id) == 0)
			return Utils.responseError("No se ha podido eliminar la tarea");

		return Utils.responseSuccess(id);
	}

}
