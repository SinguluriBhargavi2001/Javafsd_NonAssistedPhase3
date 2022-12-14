package com.example.demo.controller;

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
import com.example.demo.service.QuestionsService;



@RestController
@RequestMapping("/admin/api/questions")
public class QuestionsController {
	
	@Autowired
	private QuestionsService service;
	
	///create new record
		@PostMapping("/")
		public ResponseEntity<Questions> addQuestion(@RequestBody Questions q){
			Questions question= service.addQuestion(q);
			if(question!=null)  
				return new ResponseEntity<Questions>(question,HttpStatus.CREATED);
			else
				return new ResponseEntity<Questions>(question, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		@GetMapping("/")
		public  List<Questions> getAllQuestion(){
			return service.getAllQuestion();
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Object> deleteQuestion(@PathVariable  int id ){
			
			if(service.deleteQuestion(id))
				return new ResponseEntity<Object>("Question Deleted", HttpStatus.OK);
			else
				return new ResponseEntity<Object>("No User Found",HttpStatus.NOT_FOUND);
		}
		
		@PostMapping("/createquiz")
		public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz q){
			Quiz qui= service.addQuiz(q);
			if(qui!=null)  
				return new ResponseEntity<Quiz>(qui,HttpStatus.CREATED);
			else
				return new ResponseEntity<Quiz>(qui, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	

}