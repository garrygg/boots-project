package gg.controller;

import gg.entity.Item;
import gg.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ItemCacheController {
	
	private static final Logger log = LoggerFactory.getLogger(ItemCacheController.class);
	
	@Autowired
	private ItemService itemService;
	
	@Resource(name="myRedisTemplate")
	private RedisTemplate redisTemplate;

	@GetMapping("/cache/item/{id}")
	public Item getItem(@PathVariable("id") Integer id) {
		Item item = null;
		item = (Item)redisTemplate.opsForValue().get("item:"+id);
		if (item != null) {
			log.info("get cache item: {}",item);
		}
		if (item == null) {
			item = itemService.findItem(id);
			if (item != null) {
				redisTemplate.opsForValue().set("item:"+id, item);
				log.info("set cache ");
			}
		}
		return item;
	}
}
