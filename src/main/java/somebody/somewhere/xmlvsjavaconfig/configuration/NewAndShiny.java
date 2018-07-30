package somebody.somewhere.xmlvsjavaconfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import somebody.somewhere.xmlvsjavaconfig.commonbeans.*;

@Configuration
public class NewAndShiny {
    @Bean
    public static GreatNorthernBean greatNorthernBean() {
        return new GreatNorthernBean();
    }

    @Bean
    public static PintoBean pintoBean() {
        return new PintoBean();
    }

    @Bean
    public static KidneyBean kidneyBean() {
        return new KidneyBean();
    }

    @Bean
    LimaBean limaBean() {
        return new LimaBean();
    }

    @Bean
    protected BlackedEyePea blackedEyePea() {
        return new BlackedEyePea();
    }

    @Bean
    public MrBean mrBean() {
        return new MrBean();
    }

}
