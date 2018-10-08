package org.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="idiot")
@DynamicUpdate
public class Idiot 
{
	@Column(name="name")
	private String name;
	@Id
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="country")
	private String country;
	
	public Idiot() {
		super();
	}
	public Idiot(String name, String email, String mobile, String country) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Idiot [name=" + name + ", email=" + email + ", mobile=" + mobile + ", country=" + country + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
