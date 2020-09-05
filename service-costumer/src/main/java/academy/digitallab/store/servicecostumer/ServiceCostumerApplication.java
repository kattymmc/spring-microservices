package academy.digitallab.store.servicecostumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceCostumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCostumerApplication.class, args);
	}

}
