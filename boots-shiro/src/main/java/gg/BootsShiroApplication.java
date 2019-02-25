package gg;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableJpaRepositories("gg.dao")
public class BootsShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootsShiroApplication.class, args);
	}


	//解决JPA因为懒加载导致JSON转换错误的问题
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
	}


	@GetMapping("/error")
	public String error(){
		return "/error";
	}
}
