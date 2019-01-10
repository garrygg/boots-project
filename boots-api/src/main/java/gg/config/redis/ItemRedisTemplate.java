package gg.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/*
 * 替换默认的序列化key 和value 的对象
 * 否则springboot存入redis的键值会乱码
 */
@Configuration
public class ItemRedisTemplate<T> {
	
	@Autowired
    private RedisTemplate<String, T> redisTemplate;
	
	@Bean(name="myRedisTemplate")
    public RedisTemplate<String, T> redisTemplateInit() {
        //设置序列化Key的实例化对象
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置序列化Value的实例化对象
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return redisTemplate;
    }
}
