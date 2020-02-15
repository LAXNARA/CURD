package com.lax.product.app.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = 	"products")
@Data
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "p_id")
	Integer pId;

	@Column(name = "p_name")
	String pName;

	@Column(name = "p_cost")
	Integer pCost;

}
