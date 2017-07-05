package com.tongxing.portal.entity;

import com.tongxing.modules.annotation.Table;

import java.io.Serializable;

@Table("user")
public class User implements Serializable {
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}