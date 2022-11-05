package com.simplilearn.estore.enduser.entity;

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
@Table(name = "WISHLIST")
public class Wishlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wishlistId")
	private int wishlistId;
	
	private int productId;
	private int userId;
	
}
