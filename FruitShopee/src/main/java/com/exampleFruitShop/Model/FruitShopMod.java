package com.exampleFruitShop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FruitShopMod {
    
	@Id
	private int sno;
	private String name;
	private int quantity;
	private int cost;
	private int carbohydrates;
	private int vitamins;
	private int fabrics;
	private String date;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public int getVitamins() {
		return vitamins;
	}
	public void setVitamins(int vitamins) {
		this.vitamins = vitamins;
	}
	public int getFabrics() {
		return fabrics;
	}
	public void setFabrics(int fabrics) {
		this.fabrics = fabrics;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
