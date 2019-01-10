package app;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceTest extends ApplicationTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void DataSourceTest() {
		System.out.println(dataSource.getClass());
	}

}
