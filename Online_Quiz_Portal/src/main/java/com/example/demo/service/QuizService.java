package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuizRepository;


@Service
public class QuizService<questionsid> {
	
	@Autowired
	private QuizRepository repo;
	
	public List<Quiz> findque(int quizid) {
		List<Quiz> questions= repo.findByQuizid(quizid);
		return questions;
	}

}