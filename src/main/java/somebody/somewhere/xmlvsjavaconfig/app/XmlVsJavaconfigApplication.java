package somebody.somewhere.xmlvsjavaconfig.app;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import somebody.somewhere.xmlvsjavaconfig.commonbeans.BlackBean;

import javax.annotation.PostConstruct;

import java.util.Arrays;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@ImportResource(value = "classpath:oldAndUgly.xml")
public class XmlVsJavaconfigApplication {
    private final BlackBean blackBean;

    @Autowired
    public XmlVsJavaconfigApplication(final BlackBean blackBean) {
        this.blackBean = blackBean;
    }

    public static void main(String[] args) {
        Class<XmlVsJavaconfigApplication> primarySource = XmlVsJavaconfigApplication.class;
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
