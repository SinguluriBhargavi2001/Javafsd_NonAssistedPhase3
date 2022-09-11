package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Questions;
import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuestionsRepository;
import com.example.demo.service.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	@Autowired
	private QuestionsRepository repo;
	
	@GetMapping("/{quizid}")
	public ResponseEntity<Object> findque(@PathVariable int quizid)
	{
		//getting all the questions data attached with the given quiz id
		List<Quiz> resp= service.findque(quizid);
		System.out.println(resp);
	
		//created an arraylist to store which questions comes under the given quiz id
		ArrayList<Integer> questionsid = new ArrayList<Integer>();
		
		//saveing all the question id's in the arraylist
		resp.forEach(e->questionsid.add(e.getQuestionid()));
		System.out.println(questionsid);

		//finding all the questions with the given question ids
		List<Questions> findall = repo.findAllById(questionsid);
		ArrayList<String> question = new ArrayList<String>();
		
		//storing all the questions and their options in the new arraylist
		findall.forEach((e)->{
			question.add("Que. "+e.getQuestion());
			question.add("(a) "+e.getOptionA());
			question.add("(b) "+e.getOptionB());
			question.add("(c) "+e.getOptionC());
			question.add("(d) "+e.getOptionD());
			question.add("_____________________");
			
		});
		
		System.out.println(question);
		
		if(questionsid.size()!=0)
			return new ResponseEntity<Object>(question,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("Quiz not Available",HttpStatus.NOT_FOUND);
	}
	

}