package com.simplilearn.estore.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CATEGORIES")
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryId;
	
	@Column(name = "categoryName")
	private String categoryName;
	
	@Column(name = "categoryDescription")
	private String categoryDescription;
	
	@Column(name = "categoryImageUrl")
	private String categoryImageUrl;
	
	@Column(name = "active")
	private int active;
	
	@Column(name = "addedOn")
	private Date addedOn;
	
}
