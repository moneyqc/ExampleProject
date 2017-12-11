package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
	启动main函数后，在控制台中可以发现启动了一个Tomcat容器，一个基于Spring MVC的应用也同时启动起来，这时访问 http://localhost:8080 就可以看到Hello World!出现在浏览器中了。
	spring-boot-starter-web，它包含了Spring Boot预定义的一些Web开发的常用依赖
	没有一行配置代码、也没有web.xml。基于Spring Boot的应用在大多数情况下都不需要我们去显式地声明各类配置，而是将最常用的默认配置作为约定，在不声明的情况下也能适应大多数的开发场景。
	
	同样的，数据库访问只要加入类似如下的maven依赖即可：
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-web-jdbc</artifactId>
		</dependency>
*/

@Controller
@SpringBootApplication
public class SampleController {

	@ResponseBody
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}