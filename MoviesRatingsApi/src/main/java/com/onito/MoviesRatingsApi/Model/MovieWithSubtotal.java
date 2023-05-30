package com.onito.MoviesRatingsApi.Model;

import java.util.List;

public class MovieWithSubtotal {

	List<MovieWithGenrewise> movie;
	List<Subtotal> subTotal;
	
	public MovieWithSubtotal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieWithSubtotal(List<MovieWithGenrewise> movie, List<Subtotal> subTotal) {
		super();
		this.movie = movie;
		this.subTotal = subTotal;
	}
	public List<MovieWithGenrewise> getMovie() {
		return movie;
	}
	public void setMovie(List<MovieWithGenrewise> movie) {
		this.movie = movie;
	}
	public List<Subtotal> getSubTotal() {
		return subTotal;
	}
	public void setTotal(List<Subtotal> subTotal) {
		this.subTotal = subTotal;
	}
	
}
