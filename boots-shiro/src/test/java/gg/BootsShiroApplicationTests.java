package gg;

import gg.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BootsShiroApplicationTests {


	/*@Autowired
	private WebApplicationContext context;

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	@Transactional
	public void testFindUser(){
		//System.out.println(userService.findUserByLoginName("admin"));

		//System.out.println(userService.findUserById(1));

		System.out.println(userService.findUsers());
	}*/

}
