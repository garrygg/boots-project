package gg;

import gg.exception.MyException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@MapperScan("gg.dao")
@Controller
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/test/exception")
    public String testException() throws  Exception{
        System.out.println("begin exception");
        throw new MyException("测试 异常捕获");
    }

}
