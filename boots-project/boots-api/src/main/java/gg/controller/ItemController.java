package gg.controller;

import gg.entity.Combo;
import gg.entity.Item;
import gg.service.ComboService;
import gg.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
	
	private static final Logger log = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;
	@Autowired
	private ComboService comboService;
	
	
	@GetMapping(value = "/item/{id}")
	public Item getItem(@PathVariable("id") Integer id) {
		return itemService.findItem(id);
	}
	
	@GetMapping("/item/list")
	public List listItems(String name, Integer status) {
		return itemService.findItems(name, status);
	}
	
	@GetMapping("/combo/{id}")
	public Combo getCombo(@PathVariable("id")Integer id) {
		return comboService.findCombo(id);
	}
	
	@GetMapping("/combo/list")
	public List listCombo(){
		return comboService.findCombos();
	}
}
