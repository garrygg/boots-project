package app;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest extends ApplicationTest{

	@Resource(name = "myRedisTemplate")
	private RedisTemplate redisTemplate;
	
	@Test
	public void  testConnectRedis() {
		 redisTemplate.opsForValue().set("hello", "ni hao a");
		 System.out.println("cache test item: "+redisTemplate.opsForValue().get("hello"));
	}
}
