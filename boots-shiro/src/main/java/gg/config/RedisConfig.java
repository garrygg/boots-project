package gg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class RedisConfig {

	//@Value("${shiro.redis.port}")
	private String host  = "127.0.0.1:6379";


	//@Value("${shiro.redis.timeout}")
	private int timeout =600;

	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}