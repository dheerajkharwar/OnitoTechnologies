package com.onito.MoviesRatingsApi.Exception;

public class MovieNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public MovieNotFoundException(String tconst) {
		super("Could not found movie with tconst "+tconst);
	}

}
