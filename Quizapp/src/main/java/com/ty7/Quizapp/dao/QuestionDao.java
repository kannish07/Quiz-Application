package com.ty7.Quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Model.Question;



@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

	List<Question> findByCategory(String category);
	
	@Query(value="SELECT * FROM question q Where q.category=:category ORDER BY RANDOm() LIMIT :numQ",nativeQuery = true)
	List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
