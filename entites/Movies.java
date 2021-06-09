package com.pjr.entites;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer m_id;
	@Column(name="m_name")
	private String m_name;
	@ManyToOne
	private MLanguage ml;
	@ManyToOne
	private Genre gt;
	@Column(name="year")
	private Integer year; 
	
	
	public Movies() {
		super();
	}


	public Movies(Integer m_id, String m_name, MLanguage ml, Genre gt, Integer year) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.ml = ml;
		this.gt = gt;
		this.year = year;
	}


	public Integer getM_id() {
		return m_id;
	}


	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public MLanguage getMl() {
		return ml;
	}


	public void setMl(MLanguage ml) {
		this.ml = ml;
	}


	public Genre getGt() {
		return gt;
	}


	public void setGt(Genre gt) {
		this.gt = gt;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	


}
	