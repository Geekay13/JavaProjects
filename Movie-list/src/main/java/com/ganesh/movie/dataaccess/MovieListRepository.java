package com.ganesh.movie.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.movie.model.Movie;

public interface MovieListRepository extends JpaRepository<Movie,Long>{
	List<Movie> findMoviesByActor(String name);
	

}
