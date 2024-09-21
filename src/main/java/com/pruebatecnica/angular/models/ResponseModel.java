package com.pruebatecnica.angular.models;

import lombok.Data;

@Data
public class ResponseModel {
	
	private Integer StatusCode;
	private String message;
    private Object data;

}
