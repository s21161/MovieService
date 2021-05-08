package pl.pjatk.MovieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import java.util.List;


@SpringBootApplication
public class MovieServiceApplication {

	public Movie getMovie(String movieMake) { return new Movie(movieMake);}



}
