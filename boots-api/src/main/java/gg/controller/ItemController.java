package gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gg.entity.Combo;
import gg.entity.Item;
import gg.service.ComboService;
import gg.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	@Autowired
	private ComboService comboService;
	
	@RequestMapping("/item/{id}")
	public Item getItem(@PathVariable("id") Integer id) {
		return itemService.findItem(id);
	}
	
	@RequestMapping("/item/list")
	public List listItems(String name, Integer status) {
		return itemService.findItems(name, status);
	}
	
	@GetMapping("/combo/{id}")
	public Combo getCombo(@PathVariable("id")Integer id) {
		return comboService.findCombo(id);
	}
	
	@RequestMapping("/combo/list")
	public List listCombo(){
		return comboService.findCombos();
	}
}
