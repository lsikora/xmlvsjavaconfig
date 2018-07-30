package somebody.somewhere.xmlvsjavaconfig.app;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import somebody.somewhere.xmlvsjavaconfig.commonbeans.*;
import somebody.somewhere.xmlvsjavaconfig.configuration.*;

import java.util.stream.*;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@Import(NewAndShiny.class)
public class XmlVsJavaConfigApplication {
  public static void main(String[] args) {
    run(XmlVsJavaConfigApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      System.out.println("Let's inspect the beans provided by Spring Boot:");
      Stream.of(ctx.getBeanNamesForType(CommonBean.class))
          .forEachOrdered(
              beanName ->
              {
                if (("kidneyBean" != beanName) && ("greatNorthernBean" != beanName)) {
                  System.out.printf("%s" + "     %s\n%n", beanName,
                      ctx.getBean(beanName));
                }
              }
          );
    };
  }
}
