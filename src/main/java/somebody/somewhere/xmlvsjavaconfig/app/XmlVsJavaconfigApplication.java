package somebody.somewhere.xmlvsjavaconfig.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import somebody.somewhere.xmlvsjavaconfig.configuration.NewAndShiny;

import java.util.Arrays;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class XmlVsJavaconfigApplication {

    public static void main(String[] args) {
        Class<NewAndShiny> primarySource = NewAndShiny.class;
        run(primarySource, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);

            for (String beanName : beanNames) {
                System.out.println(beanName + "     " + ctx.getBean(beanName).toString());
            }

        };
    }
}
