package somebody.somewhere.xmlvsjavaconfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import somebody.somewhere.xmlvsjavaconfig.commonbeans.BlackBean;

@Configuration
public class NewAndShiny {

    public final BlackBean blackBean(){
        return new BlackBean();
    }
}
