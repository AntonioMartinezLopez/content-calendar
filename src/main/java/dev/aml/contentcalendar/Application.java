package dev.aml.contentcalendar;

import dev.aml.contentcalendar.config.ContentCalendarProperties;
import dev.aml.contentcalendar.model.Content;
import dev.aml.contentcalendar.model.Status;
import dev.aml.contentcalendar.model.Type;
import dev.aml.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		try {
			RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
			System.out.println(restTemplate);
		}
		catch (Exception e) {
			System.out.println((e.toString()));
		}
	}

	// write more code

	@Bean
	CommandLineRunner commandLineRunnerTwo(ContentRepository repository) {
		return args -> {

			// repository.deleteAll();

			System.out.println("Hello from Bean commandLineRunner...loading data.");
/*			Content content = new Content(
					null,
					"Hello Chat GPT",
					"All about Chat GPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);*/
		};
	}
}
