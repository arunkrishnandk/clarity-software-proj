package com.clarity.metric.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Metric implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue
	@Column
	private int id;
	
	@Column
	private String system;
	
	@Column
	private String name;
	
	@Column
	private Long date;
	
	@Column
	private Integer vaalue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getVaalue() {
		return vaalue;
	}

	public void setVaalue(int vaalue) {
		this.vaalue = vaalue;
	}

}
