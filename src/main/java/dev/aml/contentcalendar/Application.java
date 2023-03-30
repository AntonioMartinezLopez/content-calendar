package dev.aml.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		try {
			RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
			System.out.println(restTemplate);
		}
		catch (Exception e) {
			System.out.println((e.toString()));
		}

	}

	// write more code

}
