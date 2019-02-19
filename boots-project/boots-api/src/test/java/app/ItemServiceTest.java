package app;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gg.service.ItemService;
/*
 * service测试类
 * 通常测试类示例
 */
public class ItemServiceTest extends ApplicationTest{
	
	@Autowired
	private ItemService itemService;
	
	public ItemService getItemService() {
		return itemService;
	}
	@Test
	public void testGetItem() {
		System.out.println(itemService.findItem(1));
	}
	@Test
	public void testListItems() {
		System.out.println(itemService.findItems(null,0));
	}
}
