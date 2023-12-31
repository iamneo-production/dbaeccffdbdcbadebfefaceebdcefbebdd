package com.examly.springapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private double maximumBudget;

	public Team(Long id, String name, double maximumBudget) {
		super();
		this.id = id;
		this.name = name;
		this.maximumBudget = maximumBudget;
	}

	public Team() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaximumBudget() {
		return maximumBudget;
	}

	public void setMaximumBudget(double maximumBudget) {
		this.maximumBudget = maximumBudget;
	}

	 
}
