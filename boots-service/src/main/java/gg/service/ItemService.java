package gg.service;

import gg.entity.Item;

import java.util.List;

public interface ItemService {

	Item findItem(Integer id);

	List<Item> findItems(String name, Integer status);

}
