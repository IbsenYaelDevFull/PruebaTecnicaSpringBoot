package com.pruebatecnica.angular.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pruebatecnica.angular.models.ResponseModel;

public class Utils {

	public static ResponseEntity<ResponseModel> responseError(String message) {
		ResponseModel response = new ResponseModel();

		response.setStatusCode(0);
		response.setMessage(message);

		return new ResponseEntity<ResponseModel>(response, HttpStatus.BAD_REQUEST);

	}

	public static ResponseEntity<ResponseModel> responseSuccess(Object data) {
		ResponseModel response = new ResponseModel();
		response.setStatusCode(1);
		response.setMessage("Proceso Exitoso");
		response.setData(data);
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
	}

}
