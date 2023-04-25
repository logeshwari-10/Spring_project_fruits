package com.exampleFruitShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleFruitShop.Model.FruitShopMod;
@Repository
public interface FruitShopRepo extends JpaRepository<FruitShopMod, Integer> {

}
