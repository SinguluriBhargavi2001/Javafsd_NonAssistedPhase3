package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column(length=20)
	private String name;
	
	@Column(length=50)
	private String feedback;
	
	//Constructors
	//Constructor
    public FeedbackEntity() {
        super();
    }
    public FeedbackEntity(int id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.feedback = feedback;
    }
    
    //getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
