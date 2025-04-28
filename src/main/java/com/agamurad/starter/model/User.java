package com.agamurad.starter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	public String name = "Hello world";
	
	public User getAll() {
        return this;
    }
}
