package com.onito.MoviesRatingsApi.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onito.MoviesRatingsApi.Model.Movies;

public interface MoviesRepositery extends JpaRepository<Movies, String> {

}
