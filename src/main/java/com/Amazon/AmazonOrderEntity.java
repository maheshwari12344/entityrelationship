package com.Amazon;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orderlist")
public class AmazonOrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	private int quantity;
	private String city;
    private int pincode;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@OneToMany(targetEntity=AmazonProductEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="order_fk",referencedColumnName="orderid")
	List<AmazonProductEntity>product;
	public List<AmazonProductEntity> getProduct() {
		return product;
	}
	public void setProduct(List<AmazonProductEntity> product) {
		this.product = product;
	}
	
	

}
