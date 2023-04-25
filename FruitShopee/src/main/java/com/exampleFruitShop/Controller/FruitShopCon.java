package com.exampleFruitShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleFruitShop.Model.FruitShopMod;
import com.exampleFruitShop.Service.FruitShopSer;
@RestController
public class FruitShopCon {
	@Autowired
	FruitShopSer servi;
	@GetMapping("/login")
	public List<FruitShopMod> main(){
		return servi.main();
	}
	@PostMapping("/signin")
	public FruitShopMod sub(@RequestBody FruitShopMod fs) {
		return servi.sub(fs);
	}
	@PutMapping("/signup/(id)")
	public FruitShopMod dub(@RequestBody FruitShopMod fs) {
		return servi.dub(fs);
	}
	@DeleteMapping("/del/(id)")
	public void delete (@PathVariable("id") int cost) {
		servi.del(cost);
	}
}
