package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Questions;
import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuestionsRepository;
import com.example.demo.repository.QuizRepository;


@Service
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository repo;
	
	@Autowired
	private QuizRepository repo1;

	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		return repo.save(q);
	}

	public List<Questions> getAllQuestion() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public boolean deleteQuestion(int id) {

			if(repo.findById(id).isPresent())
			{
				repo.deleteById(id);
				return true;
			}
			else
				return false;
		}

	public Questions getQuestionById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
	}
	
	public Quiz addQuiz(Quiz q) {
		// TODO Auto-generated method stub
		return repo1.save(q);
	}
	

}