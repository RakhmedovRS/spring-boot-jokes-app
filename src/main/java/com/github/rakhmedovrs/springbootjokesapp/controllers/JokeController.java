package com.github.rakhmedovrs.springbootjokesapp.controllers;

import com.github.rakhmedovrs.springbootjokesapp.model.Joke;
import com.github.rakhmedovrs.springbootjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Random;

/**
 * @author RakhmedovRS
 * @created 05-May-20
 */
@Controller
public class JokeController
{
	private final JokeService jokeService;
	private final Random random;

	public JokeController(JokeService jokeService)
	{
		this.jokeService = jokeService;
		this.random = new Random();
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getJoke(Model model)
	{
		model.addAttribute("jokes", Arrays.asList(
			new Joke(random.nextInt(Integer.MAX_VALUE), jokeService.getJoke()),
			new Joke(random.nextInt(Integer.MAX_VALUE),jokeService.getJoke()),
			new Joke(random.nextInt(Integer.MAX_VALUE),jokeService.getJoke())));
		return "chucknorris/jokes";
	}
}
