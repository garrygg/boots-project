package gg.service;

import java.util.List;

import gg.entity.Item;

public interface ItemService {

	Item findItem(Integer id);

	List<Item> findItems(String name, Integer status);

}
