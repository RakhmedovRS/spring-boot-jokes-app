package com.github.rakhmedovrs.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 05-May-20
 */
@Component
public class JokeService
{
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeService()
	{
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	public String getJoke()
	{
		return chuckNorrisQuotes.getRandomQuote();
	}
}
