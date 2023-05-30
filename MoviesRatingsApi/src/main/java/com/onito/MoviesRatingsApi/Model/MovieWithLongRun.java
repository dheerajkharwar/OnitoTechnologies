package com.onito.MoviesRatingsApi.Model;


public class MovieWithLongRun {
	
	private String tconst;
	private String primaryTitle;
	private int runtimeMinutes;
	private String genres;
	
	public MovieWithLongRun() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieWithLongRun(String tconst, String primaryTitle, int runtimeMinutes, String genres) {
		super();
		this.tconst = tconst;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
	}
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}
	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}

}
