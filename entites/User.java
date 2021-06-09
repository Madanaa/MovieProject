package com.pjr.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer u_id;
	@Column(name="email", nullable= false, unique= true, length=45 )
	private String email;
	@Column(name="password", nullable= false, length=20 )
	private String password;
	@Column(name="firstname", nullable= false, length=20 )
	private String firstname;
	@Column(name="lastname", nullable= false, length=20 )
	private String lastname;
	@Column(name="role", nullable= false, length=15)
	private String role;
	
	
	public User() {
		
	}


	public User(Integer u_id, String email, String password, String firstname, String lastname, String role) {
		super();
		this.u_id = u_id;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}


	public Integer getU_id() {
		return u_id;
	}


	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", email=" + email + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", role=" + role + "]";
	}
	
	
	
	

}
