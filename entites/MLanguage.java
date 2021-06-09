package com.pjr.entites;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="language")

public class MLanguage  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="l_id")
	private Integer l_id;
	@Column(name="lang")
	private String lang;

	
	
	public MLanguage() {
		super();
	}



	public MLanguage(Integer l_id, String lang) {
		super();
		this.l_id = l_id;
		this.lang = lang;
	}



	public Integer getL_id() {
		return l_id;
	}



	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}



	public String getLang() {
		return lang;
	}



	public void setLang(String lang) {
		this.lang = lang;
	}



	@Override
	public String toString() {
		return "MLanguage [l_id=" + l_id + ", lang=" + lang + "]";
	}


	
	
	

}
