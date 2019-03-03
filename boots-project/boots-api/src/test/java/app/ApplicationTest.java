package app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import gg.Application;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 测试类基类
 * 其他测试类直接继承
 * 单元测试代码写在src/test/目录下
	单元测试类命名为*Test，前缀为要测试的类名
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =Application.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class ApplicationTest {
	/*
	 * Spring测试框架提供MockMvc对象，
	  	可以在不需要客户端-服务端请求的情况下进行MVC测试，
	  	完全在服务端这边就可以执行Controller的请求，跟启动了测试服务器一样。
	 */
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	public MockMvc getMockMvc() {
		return mockMvc;
	}
	/*-----------*/

	@Before
	public void before() {
		System.out.println("test start------");
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@After
    public void after() {
		System.out.println("test finish------");
	}


	@Test
	public void testException() throws  Exception{
		getMockMvc().perform(MockMvcRequestBuilders.get("/test/exception"))
				.andExpect(status().isOk())
				.andDo(print());
	}
}
