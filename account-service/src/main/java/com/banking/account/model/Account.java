package com.banking.account.model;

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
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="accno")
	private Integer accountNumber;
	
	@Column(name="acctype")
	private String accountType;
	
	@Column(name="amt")
	private float amount;
	
	@Column(name="createdDate")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="status")
	private boolean accountStatus;
	
	@Column(name="custId")
	private int customerId;
	
}
