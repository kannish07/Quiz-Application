package com.ty7.Quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
