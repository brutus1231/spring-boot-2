package pl.sda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.sda.service.PrimeNumberChecker;

@SpringBootApplication
@EnableJpaRepositories("pl.sda.repository")
public class ApplicationConfiguration {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfiguration.class, args);

        PrimeNumberChecker primeChecker = context.getBean(PrimeNumberChecker.class);
        primeChecker.check(123);

    }

}
