package com.pjr.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer r_id;
	@Column(name="ratting")
	private Double ratting;
	@Column(name="comments")
	private String comments;
	@ManyToOne
	private User u;
	@ManyToOne
	private Movies m;
	
	public Review() {
		
	}

	public Review(Integer r_id, Double ratting, String comments, User u, Movies m) {
		super();
		this.r_id = r_id;
		this.ratting = ratting;
		this.comments = comments;
		this.u = u;
		this.m = m;
	}

	public Integer getR_id() {
		return r_id;
	}

	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}

	public Double getRatting() {
		return ratting;
	}

	public void setRatting(Double ratting) {
		this.ratting = ratting;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public Movies getM() {
		return m;
	}

	public void setM(Movies m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Review [r_id=" + r_id + ", ratting=" + ratting + ", comments=" + comments + ", u=" + u + ", m=" + m
				+ "]";
	}

	
	
}
