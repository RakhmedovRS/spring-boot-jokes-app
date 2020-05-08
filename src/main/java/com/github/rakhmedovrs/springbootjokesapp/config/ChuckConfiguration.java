package com.github.rakhmedovrs.springbootjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author RakhmedovRS
 * @created 08-May-20
 */
//@Configuration
public class ChuckConfiguration
{
	//@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes()
	{
		return new ChuckNorrisQuotes();
	}
}
