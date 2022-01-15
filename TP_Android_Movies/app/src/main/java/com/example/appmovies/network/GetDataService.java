package com.example.appmovies.network;

import com.example.appmovies.model.Movie;
import com.example.appmovies.model.ResultMovieData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDataService {

    //get popular movies
    @GET("movie/popular")
    Call<ResultMovieData> getPopularMovies(@Query("api_key") String apiKey,
                                           @Query("language") String language,
                                           @Query("page") int page);
    //get getUpcomingMovies movies
    @GET("movie/upcoming")
    Call<ResultMovieData> getUpcomingMovies(@Query("api_key") String apiKey,
                                           @Query("language") String language,
                                           @Query("page") int page);
     //get list of films when user search
    @GET("search/movie")
    Call<ResultMovieData> searchMovies(@Query("api_key") String apiKey,
                                       @Query("language") String language,
                                       @Query("query") String query,
                                       @Query("page") int page,
                                       @Query("include_adult") boolean includeAdult);
//get single movie
    @GET("movie/{id}")
    Call<Movie> getMovieById(@Path("id") int id,
                             @Query("api_key") String apiKey,
                             @Query("language") String language);
}
