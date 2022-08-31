package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FeedbackService {
        
    @Autowired
    FeedbackRepository feedbackRepository;//reference object of interface
    
    //get list of all records
    public List<FeedbackEntity> getAllProduct(){
        return feedbackRepository.findAll();//findAll is a method of jpa repository which returns all records in list
    }
        //call findById to get 1 product details
    public FeedbackEntity getProduct(int id){
        return feedbackRepository.findById(id).get();
    }
        
    public void addProduct(FeedbackEntity pe){
    	feedbackRepository.save(pe);
    }
        
    public void deleteProduct(int id){
    	feedbackRepository.deleteById(id);       
    }
}