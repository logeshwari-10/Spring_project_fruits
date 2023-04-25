package com.exampleFruitShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleFruitShop.Model.FruitShopMod;
import com.exampleFruitShop.Repository.FruitShopRepo;
@Service
public class FruitShopSer {
	@Autowired
	FruitShopRepo fsre;
	 public List<FruitShopMod> main(){
		 return fsre.findAll();
	 }
	 public FruitShopMod sub (FruitShopMod fs) {
		 return fsre.save(fs);
	 }
	 public FruitShopMod dub(FruitShopMod fs) {
		 return fsre.save(fs);
	 }
	 public void del(int cost)
	 {
		 
		 fsre.deleteById(cost);
	 }

}
