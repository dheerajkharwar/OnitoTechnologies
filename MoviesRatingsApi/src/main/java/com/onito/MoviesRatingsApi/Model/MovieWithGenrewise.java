package com.onito.MoviesRatingsApi.Model;

public class MovieWithGenrewise {
	
	String genres;
	String primaryTitle;
	int numVotes;
	
	public MovieWithGenrewise(String genres, String primaryTitle, int numVotes) {
		this.genres = genres;
		this.primaryTitle = primaryTitle;
		this.numVotes = numVotes;
	}
	public MovieWithGenrewise() {
		
		// TODO Auto-generated constructor stub
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public int getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}


}
