package com.sop_hw1.sop_hw1;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sop_hw1.sop_hw1.Movie;
import com.sop_hw1.sop_hw1.MovieShop;
import com.sop_hw1.sop_hw1.Cart;

@SpringBootApplication
@RestController
public class SopHw1Application {
	MovieShop shop = new MovieShop();

	public static void main(String[] args) {
		SpringApplication.run(SopHw1Application.class, args);
	}


	@GetMapping("/movies")
	public List<Movie> listMovies() {
		return shop.listMovie();
	}

	@GetMapping("/movies/{id}")
	public Movie getMovie(@PathVariable String id) {
		return shop.findOne(id);
	}

	@PostMapping("/movies")
	public Cart getMovie(@RequestBody Cart cart) {

		return shop.cartMovie(cart. getId()); //not yet
	}
}
