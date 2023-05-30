package com.onito.MoviesRatingsApi.Model;

import java.util.List;

public class MovieWithSubTotalList {
	
	List<MovieWithSubtotal> moviesList;

	public List<MovieWithSubtotal> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(List<MovieWithSubtotal> moviesList) {
		this.moviesList = moviesList;
	}

	public MovieWithSubTotalList(List<MovieWithSubtotal> moviesList) {
		super();
		this.moviesList = moviesList;
	}

	public MovieWithSubTotalList() {
		super();
		// TODO Auto-generated constructor stub
	}

}
