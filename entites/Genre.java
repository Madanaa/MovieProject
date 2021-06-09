package com.pjr.entites;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="g_id")
	private Integer g_id;
	@Column(name="genre_type")
	private String genre_type;

	
	public Genre() {
		super();
	}

	public Genre(Integer g_id, String genre_type) {
		super();
		this.g_id = g_id;
		this.genre_type = genre_type;
		
	}

	public Integer getG_id() {
		return g_id;
	}

	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}

	public String getGenre_type() {
		return genre_type;
	}

	public void setGenre_type(String genre_type) {
		this.genre_type = genre_type;
	}


	@Override
	public String toString() {
		return "Genre [g_id=" + g_id + ", genre_type=" + genre_type;
	}

	
}
