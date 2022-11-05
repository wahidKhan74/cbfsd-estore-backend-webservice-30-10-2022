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
@Table(name = "SHIPMENTS")
public class Shipments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shipmentId")
	private int shipmentId;
	
	private int orderId;
	private int shipmentStatus;
	private String shipmentTitle;
	private Date shipmentDate;
	private Date expectedDeliveryDate;
	private String shipmentMethod;
	private String shipmentCompany;
	
}

