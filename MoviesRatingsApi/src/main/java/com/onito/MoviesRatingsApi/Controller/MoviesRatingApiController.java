package com.onito.MoviesRatingsApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onito.MoviesRatingsApi.Model.*;
import com.onito.MoviesRatingsApi.Repositery.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class MoviesRatingApiController {
	@Autowired
	private MoviesRepositery moviesRepo;
	@Autowired
	private RatingsRepositery ratingsRepo;
	@Autowired
	private JdbcTemplate jdbcTemplet;

	@GetMapping("/api/v1/longest-duration-movies")
	List<MovieWithLongRun> getTop10MoviesWithLongRun() {
		String query = "SELECT tconst, primary_title, runtime_minutes, genres FROM movies WHERE title_type = 'movie' ORDER BY runtime_minutes DESC  LIMIT 10";
		return jdbcTemplet.query(query, new BeanPropertyRowMapper<>(MovieWithLongRun.class));

	}

	@PostMapping("/api/v1/new-movie")
	String newMovie(@RequestBody MovieWithRating newMovie) {

		moviesRepo.save(new Movies(newMovie.getTconst(), newMovie.getTitleType(), newMovie.getPrimaryTitle(),
				newMovie.getRuntimeMinutes(), newMovie.getGenres()));
		ratingsRepo.save(new Ratings(newMovie.getTconst(), newMovie.getAverageRating(), newMovie.getNumVotes()));

		return "Success";
	}

	@GetMapping("/api/v1/top-rated-movies")
	List<TopRatedMovie> getTopRatedMovies() {
		String query = "SELECT movies.tconst, primary_title, genres, average_rating from movies INNER JOIN ratings "
				+ "on (movies.tconst=ratings.tconst AND average_rating > 6.0) " + "ORDER BY average_rating";
		return jdbcTemplet.query(query, new BeanPropertyRowMapper<>(TopRatedMovie.class));
	}

	@GetMapping("/api/v1/genre-movies-with-subtotals")
	MovieWithSubtotal getGenrewiseMovieWithSubtotal() {
		String query1 = "SELECT genres, primary_title, num_votes from movies INNER JOIN ratings "
				+ "on (movies.tconst=ratings.tconst) ORDER BY genres DESC";
		String query2 = "SELECT genres, SUM(num_votes) AS total_votes " + "from movies INNER JOIN ratings "
				+ "on (movies.tconst=ratings.tconst) " + "GROUP BY genres ORDER BY genres DESC";
		List<MovieWithGenrewise> movie = jdbcTemplet.query(query1,
				new BeanPropertyRowMapper<>(MovieWithGenrewise.class));
		List<Subtotal> subTotal = jdbcTemplet.query(query2, new BeanPropertyRowMapper<>(Subtotal.class));

		return new MovieWithSubtotal(movie, subTotal);

	}

	@PostMapping("/api/v1/update-runtime-minutes")
	String UpdateRuntimeInMinutes() {
		String query = "UPDATE movies " + "SET runtime_minutes = CASE genres "
				+ "WHEN 'Documentary' THEN runtime_minutes + 15 " + "WHEN 'Animation' THEN runtime_minutes + 30 "
				+ "ELSE runtime_minutes + 45 " + "END";
		return jdbcTemplet.update(query) > 0 ? "Success" : "Failed";
	}
}

