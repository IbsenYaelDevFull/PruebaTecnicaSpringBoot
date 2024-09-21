package com.pruebatecnica.angular.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
	
	@Id
    private Long id;
    private String title;
    private String description;
    private boolean completed;

}
