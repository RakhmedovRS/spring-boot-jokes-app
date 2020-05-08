package com.github.rakhmedovrs.springbootjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author RakhmedovRS
 * @created 08-May-20
 */
@Configuration
public class ChuckConfiguration
{
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes()
	{
		return new ChuckNorrisQuotes();
	}
}
