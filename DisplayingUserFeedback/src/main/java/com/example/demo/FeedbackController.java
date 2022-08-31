package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapi") 
public class FeedbackController {
    
    @Autowired
    FeedbackService feedbackService;
    
    @GetMapping("/allfeedback")
    public List<FeedbackEntity> getAllProduct(){
        return feedbackService.getAllProduct();
    }
    
    @GetMapping("/feedback/{id}")
    public FeedbackEntity getProduct(@PathVariable int id){
        return feedbackService.getProduct(id);
    }
    
    @PostMapping("/feedback")   //@RequestBody is used to read object from browser
    public void addProduct(@RequestBody FeedbackEntity pe ) {
    	feedbackService.addProduct(pe);
    }
    
    @DeleteMapping("/feedback/{id}")
    public void deleteProduct(@PathVariable int id)  {
    	feedbackService.deleteProduct(id);
    }
}