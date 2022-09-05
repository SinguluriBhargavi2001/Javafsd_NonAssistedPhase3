package com.example.demo;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class FooParameterResolver implements ParameterResolver {

	@Override
	public Object resolveParameter(ParameterContext parameterContext,  ExtensionContext extensionContext) throws ParameterResolutionException {
	    return new AuthenticationClass();
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext,ExtensionContext extensionContext) throws ParameterResolutionException {
	    return parameterContext.getParameter().getType() == AuthenticationClass.class;
	}
	 
 
}
