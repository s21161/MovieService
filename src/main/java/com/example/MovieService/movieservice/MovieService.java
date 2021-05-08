package com.example.MovieService.movieservice;

import com.example.MovieService.clas.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public int findMovieByID(Long ID) {
        for (int i = 0; i < listOfMovies.size(); i++) {
            if (listOfMovies.get(i).getID() == ID) {
                return i;
            }
        }
        return -1;
    }

    List<Movie> listOfMovies = new ArrayList<Movie>() {
        {
            add(new Movie("1.", ("akcja")));
            add(new Movie("2.", ("dramat")));
        }
    };


    public List<Movie> getAll() {
        return listOfMovies;
    }

    public Movie getByID(Long ID) {
        int id = findMovieByID(ID);
        if (id != -1) {
            return listOfMovies.get(id);
        } else {
            return null;
        }
    }

    public Movie postByRequestBody(Movie movie) {
        if(movie.getTytul() != null && movie.getRodzaj() != null){
            Movie newMovie = new Movie(movie.getTytul(), movie.getRodzaj());
            listOfMovies.add(newMovie);
            return newMovie;
        }
        else{
            return null;
        }
    }

    public Movie putByNameAndBody(Long ID,Movie movie) {
        int id = findMovieByID(ID);
        if (id != -1) {
            if(movie.getTytul() != null && movie.getRodzaj() != null){
                Movie carEdit = listOfMovies.get(id);
                carEdit.setTytul(movie.getTytul());
                carEdit.setRodzaj(movie.getRodzaj());
                return carEdit;
            }
            else{
                return null;
            }

        } else {
            return null;
        }

    }

    public void deleteByName(@PathVariable Long ID) {
        int id = findMovieByID(ID);
        if (id != -1) {
            listOfMovies.remove(listOfMovies.get(id));

        }

    }

}
