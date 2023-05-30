package com.onito.MoviesRatingsApi.Model;

public class Subtotal {
	
	String genres;
	int totalVotes;
	public Subtotal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subtotal(String genres, int totalVotes) {
		super();
		this.genres = genres;
		this.totalVotes = totalVotes;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public int getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(int total) {
		this.totalVotes = total;
	}

}
