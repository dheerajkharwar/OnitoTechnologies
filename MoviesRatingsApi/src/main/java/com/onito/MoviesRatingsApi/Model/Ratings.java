package com.onito.MoviesRatingsApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ratings {
	@Id
	String tconst;
	double averageRating;
	int numVotes;
	
	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ratings(String tconst, double averageRating, int numVotes) {
		super();
		this.tconst = tconst;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
	}
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	public int getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}
	
	

}

