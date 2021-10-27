package com.banking.customer.info.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "customerName")
	private String customerName;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "address")
	private String customerAddress;
	
	@Column(name= "country")
	private String country;
	
	@Temporal(TemporalType.DATE)
	@Column(name= "dob")
	private Date dob;
	
	@Column(name= "phone")
	private int phone;
	
	@Column(name= "userid")
	private int userId;
	
}
