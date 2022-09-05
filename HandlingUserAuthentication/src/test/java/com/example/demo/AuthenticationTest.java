package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.demo.AuthenticationClass;
import com.example.demo.FooParameterResolver;

@ExtendWith(FooParameterResolver.class)
public class AuthenticationTest{
	    @Test
	    @Tag("my-tag")
	   
	    void test1(AuthenticationClass obj) {
	    assertEquals("Admin@123", obj.ValidatePwd());
	    	
	    }
	    
	    @Test
		void test(AuthenticationClass obj) {
			assertEquals("Admin", obj.ValidateUser());
		}

}