package gg.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //开启在线接口文档
@Profile({"dev","test"})//表示在开发或测试环境开启，而在生产关闭。
public class Swagger2Config {
    /**
     * 摘要信息
     */
    @Bean
    public Docket onlineApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("标题：在线接口文档")
                        .description("描述：abcdefg.")
                        .contact(new Contact("garrygg", "email", "url"))
                        .version("版本号:0.0.1")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("gg.controller"))
                .paths(PathSelectors.any())
                .build();
    }


}
