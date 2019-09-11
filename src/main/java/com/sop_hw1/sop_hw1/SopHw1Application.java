package com.sop_hw1.sop_hw1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import static com.sop_hw1.sop_hw1.MovieShop.fileReader;
import static com.sop_hw1.sop_hw1.MovieShop.fileWriter;

@SpringBootApplication
@RestController
public class SopHw1Application {
	MovieShop shop = new MovieShop();

	public static void main(String[] args) {
		SpringApplication.run(SopHw1Application.class, args);
		fileReader();
	}
	private static List<Movie> shoppingCart = new ArrayList<>();

	@RequestMapping("/")
	String home(){
		MovieFactory movieFactory = MovieFactory.getInstance();
		return "Welcome";
	}

	@GetMapping("/movies")
	public List<Movie> listMovies() {
		MovieFactory movieFactory = MovieFactory.getInstance();
		return shop.listMovie();
	}

	@GetMapping("/movies/{id}")
	public Movie getMovie(@PathVariable String id) {
		MovieFactory movieFactory = MovieFactory.getInstance();
		return shop.getOne(id);
	}

	@RequestMapping("/cart")
	public List<Movie> cartMovie(){
		MovieFactory movieFactory = MovieFactory.getInstance();
		fileWriter();
		return SopHw1Application.shoppingCart;
	}
}
