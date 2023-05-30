package com.onito.MoviesRatingsApi.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(MovieNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
public Map<String, String> exceptionHandler(MovieNotFoundException exception){
		
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("error Message", exception.getMessage());
		return errorMap;
		
	}

}
