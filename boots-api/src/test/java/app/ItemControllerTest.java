package app;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/*
 * mock方式单元测试
 */
public class ItemControllerTest extends ApplicationTest{
	@Test
	public void testUrl() throws Exception{
		getMockMvc().perform(MockMvcRequestBuilders.get("/combo/1"))
		.andExpect(status().isOk())
		.andDo(print());
	}
}
