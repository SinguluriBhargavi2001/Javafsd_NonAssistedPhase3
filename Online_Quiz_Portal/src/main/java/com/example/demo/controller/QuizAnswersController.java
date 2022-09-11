package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Answers;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Quiz;
import com.example.demo.repository.AnswersRepository;
import com.example.demo.repository.QuestionsRepository;
import com.example.demo.service.QuizService;

@RestController
@RequestMapping("/user/answers")
public class QuizAnswersController {

	@Autowired
	private AnswersRepository repo;

	@Autowired
	private QuizService service;
	@Autowired
	private QuestionsRepository repo1;

	int qid;
	int count=0;
	ArrayList<String> finalresult = new ArrayList<String>();

	@PostMapping("/")
	public ResponseEntity<Object> addAnswers(@RequestBody Answers a) {
		Answers answer = repo.save(a);
		qid = answer.getQuizid();
		if (answer != null)
		{
			ArrayList<String> uans = new ArrayList<String>();
			uans.add(answer.getAnswer1());
			uans.add(answer.getAnswer2());
			uans.add(answer.getAnswer3());
			uans.add(answer.getAnswer4());
			uans.add(answer.getAnswer5());
			
			List<Quiz> resp = service.findque(qid);
			
			// created an arraylist to store which questions comes under the given quiz id
			ArrayList<Integer> questionsid = new ArrayList<Integer>();

			// saving all the question id's in the arraylist
			resp.forEach(e -> questionsid.add(e.getQuestionid()));
			System.out.println(questionsid);
			
			List<Questions> findall = repo1.findAllById(questionsid);
			ArrayList<String> ans = new ArrayList<String>();
			findall.forEach((e)->ans.add(e.getAnswer()));
			
			for(int i=0; i<ans.size(); i++)
			{
				if(ans.get(i).equalsIgnoreCase(uans.get(i)))
				{
					count++;
					
				}
			}
			finalresult.clear();
			finalresult.add("Your Final Score is: "+count+" / "+questionsid.size());
			finalresult.add("Correct Ans: "+ans);
			System.out.println(ans);
			count=0;
		}
			
			return new ResponseEntity<Object>(finalresult, HttpStatus.CREATED);	
	}
}