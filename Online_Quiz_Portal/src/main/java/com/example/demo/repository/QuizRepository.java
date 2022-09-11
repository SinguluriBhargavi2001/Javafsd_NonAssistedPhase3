package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

		public List<Quiz> findByQuizid(int quizid);
}