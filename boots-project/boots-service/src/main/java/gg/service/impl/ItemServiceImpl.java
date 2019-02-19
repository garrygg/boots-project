package gg.service.impl;

import gg.dao.ItemMapper;
import gg.entity.Item;
import gg.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public Item findItem(Integer id) {
		// TODO Auto-generated method stub
		return itemMapper.findItem(id);
	}

	@Override
	public List<Item> findItems(String name, Integer status) {
		// TODO Auto-generated method stub
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("name", name);
		condition.put("status", status);
		return itemMapper.findItems(condition);
	}

}
