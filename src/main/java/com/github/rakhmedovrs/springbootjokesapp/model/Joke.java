package com.github.rakhmedovrs.springbootjokesapp.model;

/**
 * @author RakhmedovRS
 * @created 05-May-20
 */
public class Joke
{
	private Integer id;
	private String value;

	public Joke(Integer id, String value)
	{
		this.id = id;
		this.value = value;
	}

	public Integer getId()
	{
		return id;
	}

	public String getValue()
	{
		return value;
	}
}
