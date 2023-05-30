package com.onito.MoviesRatingsApi.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onito.MoviesRatingsApi.Model.Ratings;

public interface RatingsRepositery extends JpaRepository<Ratings, String> {

}
