package gg.dao;

import gg.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ItemMapper {
	
	Item findItem( Integer id);
	
	
	List<Item> findItems(Map condition);
}
