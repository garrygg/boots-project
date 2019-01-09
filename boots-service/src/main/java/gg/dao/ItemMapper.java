package gg.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import gg.entity.Item;

@Repository
public interface ItemMapper {
	
	Item findItem( Integer id);
	
	
	List<Item> findItems(Map condition);
}
