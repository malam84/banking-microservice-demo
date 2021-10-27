package com.banking.product.model;

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
//@SequenceGenerator(
//name = "seqid-gen", 
//sequenceName = "product-id",
//initialValue = 10000000, allocationSize = 1)
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "prod_name")
	private String productName;
	
	@Column(name = "prod_category")
	private String productCategory;
	
	@Column(name = "min_amt")
	private String minAmount;
	
	@Column(name = "max_amt")
	private String maxAmount;
	
	@Column(name = "min_period")
	private String minPeriod;
	
	@Column(name = "max_period")
	private String maxPeriod;
	
	@Column(name = "prod_status")
	private boolean status;
	
	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
}
